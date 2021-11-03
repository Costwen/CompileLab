define dso_local i32  @main (){
%x0 = alloca i32
store i32 0, i32* %x0
%x1 = alloca i32
store i32 2, i32* %x1
%x2 = load i32, i32* %x1
store i32 %x2, i32* %x0
%x3 = load i32, i32* %x0
ret i32 %x3
}
