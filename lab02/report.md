# 实验报告

## 实验要求

- 能够处理只包含一条 return 语句的 main 函数

- 能够消除程序中的注释


## 过程简介

这次实验采用了antlr4词法语法生成工具

### 任务一

通过编写g4文件, 但不知为何antlr4不能直接处理左递归的问题(明明室友的可以)。所以修改了数字的定义,将数字定义为了正则表达式。

```bash
Number: DecimalConst | OctalConst | HexaDecimalConst;

OctalConst: [0-7]+;

DecimalConst: '0'|[1-9][0-9]+;

HexaDecimalConst: '0'[(x|X)]([0-9]|[a-f]|[A-F])+;
```

当遍历语法树的时候, 将返回值设置为当前这个token/product转化为对应的llvm代码。 这个部分可以递归处理。

对于 token直接返回转化的结果,对于产生式则直接返回产生式。

例如`FuncDef`的编译的结果应该是`FuncType Ident '(' ')' Block`各自递归编译的结果组合起来。

于是最后我们将得到整体的编译结果。输出即可。




### 任务二

将处理注释的过程直接放置在了g4文件的编写之中,通过参考[grammar-g4](https://github.com/antlr/grammars-v4)中c语法定义之中处理注释的方式。定义如下注释,将注释直接在处理的时候skip跳过即可解决。

```g4
COMMENT
    : '/*' .*? '*/' -> skip
;

LINE_COMMENT
    : '//'.*? '\n' -> skip
;
```