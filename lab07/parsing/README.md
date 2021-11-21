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

### part 9

对于 `while(cond){S1} S2`这样的结构。 生成的`llvm`代码应该如下所示

```llvm
    br label L0
    L0:
    br cond label %L1, label %L2
    L1:
        S1
        br label L0
    L2: S2
```

### part 10

对于`continue`和`break`; 

假设当前的情况为`while(cond){S1 continue; S2} S3`

生成的`llvm`代码应该如下所示

```llvm
    
    br label L0
    L0:
    br cond label %L1, label %L2
    L1:
        S1
        br label L0
        S2
        br label L0
    L2: S2
```

对于当前的情况为``while(cond){S1 break; S2} S3`

生成的`llvm`代码应该为

```llvm
    
    br label L0
    L0:
    br cond label %L1, label %L2
    L1:
        S1
        br label L2
        S2
        br label L0
    L2: S2
```

所以我们在进入while循环的时候, 应该记录当前的L0 和 L2 并且使用队列保存(循环套用while)

但是`continue`和`break`不能和`if`的跳转标签相混淆一起用, 为了避免这种情况,使用如下代码生成

```
        var L1 = identifier.newRegister("label");
        var L2 = identifier.newRegister("label");
        Output.brDest(L1);
        Output.label(L1);
        Output.brDest(identifier.peekL2());
        Output.label(L2);
```
