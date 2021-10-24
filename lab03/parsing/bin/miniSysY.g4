grammar miniSysY;
/*
    rule
 */

options {
    language = Java; //设定生成代码的语言
}

/*
    token
 */
Return: 'return';
LPar: '(';
RPar: ')';
Int: 'int';
Main: 'main';
LBrace: '{';
RBrace: '}';
Semicolon: ';';
Sub: '-';
Mod: '%';
Plus: '+';
Mul: '*';
Div: '/';

Number: DecimalConst | OctalConst | HexaDecimalConst;

OctalConst: [0-7]+;

DecimalConst: '0'|[1-9][0-9]*;

HexaDecimalConst: '0'[(x|X)]([0-9]|[a-f]|[A-F])+;



compUnit: funcDef;
funcDef: funcType ident '(' ')' block;
funcType: 'int';
ident: 'main';
block: '{'stmt'}';
stmt:'return' exp ';';

exp: addExp;
addExp:mulExp  # addExpMulExp
    |  addExp unaryOp mulExp #addExpAddExpOpMulExp
    ; 
mulExp: unaryExp #mulExpUnaryExp
    | mulExp fOp unaryExp #mulExpMulExpOpUnaryExp
    ;
unaryExp: primaryExp #unaryExpPrimaryExp
        | unaryOp unaryExp #unaryExpUnaryOpUnaryExp
        ;
primaryExp: '(' exp ')' #primaryExpExp
            | Number #primaryNumber
            ;
unaryOp: op=('+' | '-');
fOp: op=('*' | '/' | '%');

Whitespace
    :   [ \t]+
        -> skip
    ;

Newline
    :   (   '\r' '\n'?
        |   '\n'
        )
        -> skip
    ;
BlockComment
    :   '/*' .*? '*/'
        -> skip
    ;

LineComment
    :   '//' ~[\r\n]*
        -> skip
    ;