declare i32 @getarray(i32*)
declare void @putarray(i32, i32*)
declare i32 @getint()
declare void @putint(i32)
declare i32 @getch()
declare void @putch(i32)
define dso_local void @set1(i32 %x1, i32* %x2)
{
%x3 = mul i32 %x1 , 1
%x4 = add i32 %x3 , 0
%x5 = getelementptr i32, i32* %x2, i32 %x4
store i32 1, i32* %x5
ret void
}
define dso_local i32 @main()
{
%x6 = alloca [10 x i32]
%x7 = getelementptr [10 x i32], [10 x i32]* %x6, i32 0, i32 0
store i32 0, i32* %x7
%x8 = getelementptr [10 x i32], [10 x i32]* %x6, i32 0, i32 1
store i32 0, i32* %x8
%x9 = getelementptr [10 x i32], [10 x i32]* %x6, i32 0, i32 2
store i32 0, i32* %x9
%x10 = getelementptr [10 x i32], [10 x i32]* %x6, i32 0, i32 3
store i32 0, i32* %x10
%x11 = getelementptr [10 x i32], [10 x i32]* %x6, i32 0, i32 4
store i32 0, i32* %x11
%x12 = getelementptr [10 x i32], [10 x i32]* %x6, i32 0, i32 5
store i32 0, i32* %x12
%x13 = getelementptr [10 x i32], [10 x i32]* %x6, i32 0, i32 6
store i32 0, i32* %x13
%x14 = getelementptr [10 x i32], [10 x i32]* %x6, i32 0, i32 7
store i32 0, i32* %x14
%x15 = getelementptr [10 x i32], [10 x i32]* %x6, i32 0, i32 8
store i32 0, i32* %x15
%x16 = getelementptr [10 x i32], [10 x i32]* %x6, i32 0, i32 9
store i32 0, i32* %x16
%x17 = alloca i32
%x18 = mul i32 0 , 5
%x19 = add i32 %x18 , 0
%x20 = getelementptr [10 x i32], [10 x i32]* %x6, i32 0, i32 %x19
%x21 = call i32 @getarray(i32* %x20)
store i32 %x21, i32* %x17
%x22 = mul i32 1 , 5
%x23 = add i32 %x22 , 0
%x24 = getelementptr [10 x i32], [10 x i32]* %x6, i32 0, i32 %x23
%x25 = call i32 @getarray(i32* %x24)
%x26 = alloca i32
store i32 0, i32* %x26
br label %L0
L0:
%x27 = load i32, i32* %x26
%x28 = load i32, i32* %x17
%x29 = icmp slt i32 %x27, %x28
br i1 %x29, label %L1, label %L2
L1:
%x30 = load i32, i32* %x26
%x31 = load i32, i32* %x26
%x32 = srem i32 %x31 , 2
%x33 = mul i32 %x32 , 5
%x34 = add i32 %x33 , 0
%x35 = getelementptr [10 x i32], [10 x i32]* %x6, i32 0, i32 %x34
call void @set1(i32 %x30,i32* %x35)
%x36 = load i32, i32* %x26
%x37 = add i32 %x36 , 1
store i32 %x37, i32* %x26
br label %L0
L2:
%x38 = load i32, i32* %x17
%x39 = mul i32 0 , 5
%x40 = add i32 %x39 , 0
%x41 = getelementptr [10 x i32], [10 x i32]* %x6, i32 0, i32 %x40
call void @putarray(i32 %x38,i32* %x41)
%x42 = load i32, i32* %x17
%x43 = mul i32 1 , 5
%x44 = add i32 %x43 , 0
%x45 = getelementptr [10 x i32], [10 x i32]* %x6, i32 0, i32 %x44
call void @putarray(i32 %x42,i32* %x45)
ret i32 0
}
