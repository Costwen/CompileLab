declare i32 @getarray(i32*)
declare void @putarray(i32, i32*)
declare i32 @getint()
declare void @putint(i32)
declare i32 @getch()
declare void @putch(i32)
@global_variable = dso_local global i32 0
define dso_local i32 @add()
{
%x1 = load i32, i32* @global_variable
%x2 = add i32 %x1 , 1
store i32 %x2, i32* @global_variable
%x3 = load i32, i32* @global_variable
ret i32 %x3
ret i32 0
}
define dso_local i32 @main()
{
br label %L0
L0:
%x4 = call i32 @add()
%x5 = icmp eq i32 1, %x4
br i1 %x5, label %L1, label %L3
L3:
%x6 = icmp eq i32 1, 0
br i1 %x6, label %L1, label %L2
br i1 %x6, label %L1, label %L2
L1:
%x7 = load i32, i32* @global_variable
call void @putint(i32 %x7)
br label %L0
L2:
%x8 = load i32, i32* @global_variable
ret i32 %x8
ret i32 0
}
