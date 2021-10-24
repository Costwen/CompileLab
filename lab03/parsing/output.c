int main() {    return 1 + 2 - 3 + 4 - 5 + 6 - 7 + 8 - 9 + 10;}define dso_local i32 @main (){
%x0 = add i32 1 , 2
%x1 = sub i32 %x0 , 3
%x2 = add i32 %x1 , 4
%x3 = sub i32 %x2 , 5
%x4 = add i32 %x3 , 6
%x5 = sub i32 %x4 , 7
%x6 = add i32 0 , 10
%x7 = sub i32 0 , %x6
%x8 = add i32 %x5 , %x7
ret i32 %x8
}
