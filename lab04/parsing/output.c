define dso_local i32  @main (){
%x0 = alloca i32
%x1 = call i32 @getint()
store i32 %x1, i32* %x0
%x2 = alloca i32
store i32 1, i32* %x2
%x3 = load i32, i32* %x0
%x4 = load i32, i32* %x2
%x5 = sub i32 %x3 , %x4
call void @putint(i32 %x5)
ret i32 0
}
