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

## LAB04 IDEA

如何解决if 表达式跳转问题

要解决这个问题,我们得先完成bool表达式的计算

我们得先计算两边的值结果在寄存器之中分别为reg1, reg2, 然后使用下述表达式
`
    <result> = icmp <cond> <ty> <op1>, <op2>
`
对于if 语句使用
`
    br i1 <cond>, label <iftrue>, label <iffalse>
`
对于`if (xxx) {S1} S3`这种情况 
生成
```
br cond label %L1, label %L2
L1:
    visit(S1)
    br label %L2
L2:
    visit(S3)
```
对于`if (xxx) {S1} else {S2} S3`
生成
```
br cond label L1, label L2
L1:
    visit(S1)
    br label %L3
L2:
    visit(S2)
    br label %L3
L3:
    visit(S3)
```

bool 变量处理

通过官网我们可查阅到相关的cond表达式

```
eq: equal
ne: not equal
ugt: unsigned greater than
uge: unsigned greater or equal
ult: unsigned less than
ule: unsigned less or equal
sgt: signed greater than
sge: signed greater or equal
slt: signed less than
sle: signed less or equal
```
使用指令`<result> = icmp <cond> <ty> <op1>, <op2>`

如果两边的类型不一致?

我们将其`<result> = zext <ty> <value> to <ty2>`

对于!cond 的变量将其和0进行比较


declare void @putint(i32)
define dso_local i32 @main() {
    %1 = alloca i32
    store i32 10, i32* %1
    %2 = load i32, i32* %1
    %3 = icmp eq i32 %2, 0  !a
    %4 = zext i1 %3 to i32  a -> i32
    %5 = icmp eq i1 %3, 0   
    %6 = zext i1 %5 to i32
    %7 = icmp eq i1 %5, 0
    %8 = zext i1 %7 to i32
    %9 = zext i1 %7 to i32
    %10 = sub i32 0, %9
    %11 = icmp ne i32 %10, 0
    br i1 %11, label %12, label %18

12:
    %13 = sub i32 0, 1
    %14 = sub i32 0, %13
    %15 = sub i32 0, %14
    store i32 %15, i32* %1
    br label %16

16:
    %17 = load i32, i32* %1
    call void @putint(i32 %17)
    ret i32 0
18:
    store i32 0, i32* %1
    br label %16
}