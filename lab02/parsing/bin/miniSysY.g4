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

Number: DecimalConst | OctalConst | HexaDecimalConst;

OctalConst: [0-7]+;

DecimalConst: '0'|[1-9][0-9]+;

HexaDecimalConst: '0'[(x|X)]([0-9]|[a-f]|[A-F])+;

WS: [\t\n\r] -> skip ;
Space: ' ' -> skip;

compUnit: funcDef;
funcDef: funcType ident '(' ')' block;
funcType: 'int';
ident: 'main';
block: '{'stmt'}';
stmt:'return' Number ';';

COMMENT
    : '/*' .*? '*/' -> skip
;

LINE_COMMENT
    : '//'.*? '\n' -> skip
;