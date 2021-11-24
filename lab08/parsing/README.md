# LAB07 IDEA

## part 12

需要从之前改动的:

### Shape

首先我们需要识别一下当前的标识符是`arr`类型还是`int`类型

如果是`int`类型不需要处理, 如果是`arr`类型。需要记录当前的类型为`arr`, 并且需要开启一个数组来记录这个`arr`,每一维的长度。


```java
HashMap<String, ArrayList<Interger>> arrayShape;
```

当遍历的时候, 将`constExp`的返回值一个个添加到数组之中。

```java
    dim = visit(ctx.constExp());
    shape.append(dim);
    setShape(name, dim);
```

### 定义

定义分为全局和局部, 首先考虑一下全局变量的定义

#### 全局变量定义

定义分为三个部分

- 类型

    通过不同的树节点判断即可。

- 声明

    通过访问所有的`constExp`节点, 将能够得到`shape`,最后输出, 但是在这里我们将多维转化为1维
    ```llvm
        global [prob(shape) x i32]
    ```

- 初始化
    初始化的方法得递归的遍历`{{, }}`, 首先我们得记录嵌套的深度i, 深度对应的就是数组的维度。
    假设当前为第i层, 我们得知这一维数组大小为n, 假设有k个子节点。则我们需要自行补充$(n-k)*porb(shape[i:])$个0

#### 局部变量定义

- 类型
    
    判断方法和全局一致

- 声明

    使用`alloca`声明
    ```llvm
    alloca [prob(shape) x i32]
    ```

    对于赋值, 我们同样使用全局变量的方式。 但是不同的是,我们得使用下述代码获取地址
    ```llvm
    %reg = getelementptr [prob(shape) x i32], [prob(shape) x i32]* @name, i32 0, i32 0
    %addr = getelementptr i32, i32* %reg, i32 offset
    ```

- 初始化
    使用`load`指令load上述地址。

#### 问题

如何解决下述问题
```c
    int a[2][3], b[3];
    b[3] = a[1];
```

这个时候我们得判断两边的类型。