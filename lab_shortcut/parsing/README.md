# LAB08 IDEA

## part shortcut

为了实现短路求值, 需要改变肯定是`if (cond) {S1}else {S2}S3`代码生成。

但是具体改哪个地方? 在这里我不希望修改已有的`if else`代码块生成的逻辑。所以我们修改的就是`cond`之中的判断的逻辑条件。

显然我们需要分为两种情况进行考虑,

首先考虑第一种情况`f1() && f2()`

在之前的处理我们是首先求出`f1(),f2()`的值。然后使用`and`指令生成最终结果并且返回。

但这里我们只需要一次求得一个值, 实际考虑的伪代码结构应该如下,而这里的`L1, L2`是上一次访问`if`或者`while`节点生成的标签

```python 
def visitAndNode():
    var cond1 = visit(f1())
    br i1 cond1, label _L1, label L2 // 如果为非跳过接下来的_L1
    _L1:
        var cond2 = visit(f2())
        br i1 cond2 label L1, Label L2

    L1:
        xxxx
    L2:
        xxxx
    L3:

```

同样的对于`f1()||f2()`这样的情况

我们的伪代码如下


```python 
def visitOrNode():
    var cond1 = visit(f1())
    br i1 cond1, label L1, label _L1  // 如果为是跳过接下来的_L1
    _L1:
        var cond2 = visit(f2())
        br i1 cond2 label L1, Label L2
    L1:
        xxxx
    L2:
        xxxx
    L3:

```


但是对于`while`的处理是不一样的。

由于之前我们生成`while(cond){S1} S2`使用的逻辑是

```llvm
    br label L0
    L0:
    br cond label %L1, label %L2
    L1:
        S1
        br label L0
    L2: S2
```

但是上面的假设能够成立必须是得每次最左边的值能够直接用表达式算出来。

所以我们得在`visitEqExp`的时候改一下访问的东西。

```llvm
    if (A and B) {S1} else{S2} S3
    br i1 %cond, label %L1, label %L2
    则L1是B的代码段B的入口
    L2 是代码段S2的入口

    if (A and B || C and D) {S1} else{S2} S3
    br i1 %cond, label %L1, label %L2
    
    则L1是B的代码段B的入口
    L2 是代码段C的入口

```