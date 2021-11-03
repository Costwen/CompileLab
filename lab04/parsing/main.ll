declare void @putch(i32)
declare i32 @getch()
declare i32 @getint()
declare void @putint(i32)
define dso_local i32  @main (){
%x0 = alloca i32
store i32 0, i32* %x0
%x1 = alloca i32
store i32 5, i32* %x1
%x2 = alloca i32
store i32 3, i32* %x2
%x3 = alloca i32
%x4 = load i32, i32* %x1
%x5 = mul i32 %x4 , 5
%x6 = sub i32 %x5 , 20
store i32 %x6, i32* %x3
%x7 = load i32, i32* %x2
%x8 = load i32, i32* %x3
%x9 = sdiv i32 %x7 , %x8
%x10 = mul i32 %x9 , 0
%x11 = load i32, i32* %x1
%x12 = sub i32 %x11 , %x10
store i32 %x12, i32* %x0
%x13 = load i32, i32* %x0
call void @putint(i32 %x13)
ret i32 0
}
