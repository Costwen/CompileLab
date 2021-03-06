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
LBrace: '{';
RBrace: '}';
Semicolon: ';';
Sub: '-';
Mod: '%';
Plus: '+';
Mul: '*';
Div: '/';
Const: 'const';
Equal: '=';


OctalConst: [0-7]+;

DecimalConst: '0'|[1-9][0-9]*;

HexaDecimalConst: '0'[(x|X)]([0-9]|[a-f]|[A-F])+;

Ident: [_a-zA-Z][_a-zA-Z0-9]*;

decl : constDecl # declConstDecl 
    | varDecl # declVarDecl
    ;

number: DecimalConst | OctalConst | HexaDecimalConst;

constDecl : 'const' bType constDef ( ',' constDef)* ';';
bType : 'int';

constDef: Ident '=' constInitVal;

constInitVal: constExp;

constExp: addExp;

varDecl: bType varDef  (',' varDef)* ';';

varDef: Ident # varDefIdent
    | Ident '=' initVal #varDefIdentInitval
    ;

initVal: exp;


compUnit: funcDef;
funcDef: funcType Ident '(' ')' block;
funcType: 'int';

block:'{' blockItem* '}';

blockItem: decl  # blockItemDecl
          | stmt # blockItemStmt
        ;

stmt: lVal '=' exp ';' #stmtlVal
    | exp? ';'  #stmtExp
    | 'return' exp ';' #stmtReturnExp
    ;

lVal: Ident;

exp: addExp;

addExp:mulExp  # addExpMulExp
    |  addExp unaryOp mulExp #addExpAddExpOpMulExp
    ; 
mulExp: unaryExp #mulExpUnaryExp
    | mulExp fOp unaryExp #mulExpMulExpOpUnaryExp
    ;
unaryExp: primaryExp #unaryExpPrimaryExp
        | Ident '(' (exp ( ',' exp )*)? ')' #unaryExpFunc
        | unaryOp unaryExp #unaryExpUnaryOpUnaryExp
        ;


primaryExp: '(' exp ')' #primaryExpExp
            | number #primaryNumber
            | lVal #primaryLVal
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