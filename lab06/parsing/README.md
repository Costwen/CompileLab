## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

## LAB05 IDEA

### part 8

一个较为显然的方法
使用一个栈, 当进入`{`之中,将新加入变量表的变量加入到栈之中。当读入`}`栈的时候, 将所有栈中的变量删除。

但是有个问题,如何解决变量重名的问题?

使用一个总表记录不同表, 其中总表的第一项为全局变量。

每次产生一个作用域, 我们直接新建一个表。然后将这个表加入总表的最后, 每次查询倒着查询即可。

```py
    identifer.newTable();
    visitBolck();
    identifer.removeTable();
```

```
def getIdentReg(String ident):
    for table in TableList:
        if table.find(ident)
            return table.getident;
    return null;
```

### part 9

如何解决全局变量只能用常量表达式, 并且得计算出初值?

首先得解决优化问题, 当检测到两边都是常量的时候, 不进行llvm代码输出, 而是直接进行优化。

即

```
    if isConst(reg1) && isConst(reg2){
        return reg1 op reg2;
    }
```

同时在获取常量寄存器的值的时候, 不使用`load`指令,而是直接返回实际的数子
