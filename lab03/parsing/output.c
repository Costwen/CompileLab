define dso_local i32 @main (){
%x0 = sub i32 0 , %x15
%x1 = sub i32 0 , %x0
%x2 = sub i32 0 , %x1
%x3 = add i32 0 , %x2
%x4 = sub i32 0 , %x3
%x5 = sdiv i32 %x4 , %x5
%x6 = add i32 %x1 , %x5
ret i32 %x6
}
