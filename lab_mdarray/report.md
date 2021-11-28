# 实验报告

## 实验要求

- 实现正号、负号

- 实现四则运算及模运算

## 过程简介

这次实验采用了antlr4词法语法生成工具, 同时这两个任务为并行关系,所以在解决的时候同时解决了两个问题。

## 结果过程

### 解决报错问题

(上一个lab的实验报告忘记说明了), 对于我们的语法树,添加一个ErrorListener, 当检测到错误时, 直接exit退出。

### 编写g4文件

按照所有文法的定义,编写好g4文件, 但值得注意的是, 其中不能重复定义`unaryop`和`('+'|'-')`,如果不讲两个定义为相同的产生式,而是分开定义为`addExp ('+'|'-') mulExp`和`unaryop: ('+'|'-')`。则产生文件将会把这两个分开定义为不同的节点从而产生错误。

### 解决分支问题

为了判断当前处于产生式的哪个分支, 在不同的产生式后添加标签,部分标签如下

```
addExp:mulExp  # addExpMulExp
    |  addExp unaryOp mulExp #addExpAddExpOpMulExp
    ; 
mulExp: unaryExp #mulExpUnaryExp
    | mulExp fOp unaryExp #mulExpMulExpOpUnaryExp
    ;
```

### 实现寄存器的分配

定义一个寄存器分配类, 里面记录的当前节点被分配到的寄存器/常量。

在处理的时候,如果是需要运算的产生式, 由于语法树的递归特性, 被运算的数已经被分配了寄存器。这个时候我们直接按照运算的格式
`result = op ty op1 op2` 的格式输出已有寄存器,并给result分配新的寄存器，

如果是没有产生运算的产生式,则不需要新分配寄存器,直接继承子节点的寄存器寄存器结果即可。

```java
        identifier.setRegister(ctx, visit(ctx.child()));
        return identifier.getRegister(ctx);
```

在最后返回当前结果的寄存器即可。

输出结果则直接在遍历的时候输出。而不是最后统一输出。