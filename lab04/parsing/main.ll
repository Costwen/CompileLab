declare void @putint(i32)
declare i32 @getint()
declare i32 @getch()
declare void @putch(i32)
define dso_local i32  @main (){
%x0 = alloca i32
%x1 = alloca i32
store i32 0, i32* %x0
%x2 = load i32, i32* %x0
store i32 %x2, i32* %x1
%x3 = load i32, i32* %x0
ret i32 %x3
}
