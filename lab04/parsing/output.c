define dso_local i32  @main (){
%x0 = alloca i32
%x1 = call i32 @getint()
store i32 %x1, i32* %x0
