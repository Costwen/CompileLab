declare i32 @getarray(i32*)
declare void @putarray(i32, i32*)
declare i32 @getint()
declare void @putint(i32)
declare i32 @getch()
declare void @putch(i32)
define dso_local i32 @exgcd(i32 %x1, i32 %x2, i32* %x3, i32* %x4)
{
%x5 = alloca i32
store i32 %x1, i32* %x5
%x6 = alloca i32
store i32 %x2, i32* %x6
%x7 = load i32, i32* %x6
%x8 = icmp eq i32 %x7, 0
br i1 %x8, label %L0, label %L1
L0:
%x9 = mul i32 0 , 1
%x10 = add i32 %x9 , 0
%x11 = getelementptr i32, i32* %x3, i32 %x10
store i32 1, i32* %x11
%x12 = mul i32 0 , 1
%x13 = add i32 %x12 , 0
%x14 = getelementptr i32, i32* %x4, i32 %x13
store i32 0, i32* %x14
%x15 = load i32, i32* %x5
ret i32 %x15
br label %L2
L1:
%x16 = alloca i32
%x17 = load i32, i32* %x6
%x18 = load i32, i32* %x5
%x19 = load i32, i32* %x6
%x20 = srem i32 %x18 , %x19
%x21 = getelementptr i32, i32* %x3, i32 0
%x22 = getelementptr i32, i32* %x4, i32 0
%x23 = call i32 @exgcd(i32 %x17,i32 %x20,i32* %x21,i32* %x22)
store i32 %x23, i32* %x16
%x24 = alloca i32
%x25 = mul i32 0 , 1
%x26 = add i32 %x25 , 0
%x27 = getelementptr i32, i32* %x3, i32 %x26
%x28 = load i32, i32* %x27
store i32 %x28, i32* %x24
%x29 = mul i32 0 , 1
%x30 = add i32 %x29 , 0
%x31 = getelementptr i32, i32* %x3, i32 %x30
%x32 = mul i32 0 , 1
%x33 = add i32 %x32 , 0
%x34 = getelementptr i32, i32* %x4, i32 %x33
%x35 = load i32, i32* %x34
store i32 %x35, i32* %x31
%x36 = mul i32 0 , 1
%x37 = add i32 %x36 , 0
%x38 = getelementptr i32, i32* %x4, i32 %x37
%x39 = load i32, i32* %x5
%x40 = load i32, i32* %x6
%x41 = sdiv i32 %x39 , %x40
%x42 = mul i32 0 , 1
%x43 = add i32 %x42 , 0
%x44 = getelementptr i32, i32* %x4, i32 %x43
%x45 = load i32, i32* %x44
%x46 = mul i32 %x41 , %x45
%x47 = load i32, i32* %x24
%x48 = sub i32 %x47 , %x46
store i32 %x48, i32* %x38
%x49 = load i32, i32* %x16
ret i32 %x49
br label %L2
L2:
ret i32 0
}
define dso_local i32 @main()
{
%x50 = alloca i32
store i32 7, i32* %x50
%x51 = alloca i32
store i32 15, i32* %x51
%x52 = alloca [1 x i32]
%x53 = getelementptr [1 x i32], [1 x i32]* %x52, i32 0, i32 0
store i32 1, i32* %x53
%x54 = alloca [1 x i32]
%x55 = getelementptr [1 x i32], [1 x i32]* %x54, i32 0, i32 0
store i32 1, i32* %x55
%x56 = load i32, i32* %x50
%x57 = load i32, i32* %x51
%x58 = getelementptr [1 x i32], [1 x i32]* %x52, i32 0, i32 0
%x59 = getelementptr [1 x i32], [1 x i32]* %x54, i32 0, i32 0
%x60 = call i32 @exgcd(i32 %x56,i32 %x57,i32* %x58,i32* %x59)
%x61 = mul i32 0 , 1
%x62 = add i32 %x61 , 0
%x63 = getelementptr [1 x i32], [1 x i32]* %x52, i32 0, i32 %x62
%x64 = mul i32 0 , 1
%x65 = add i32 %x64 , 0
%x66 = getelementptr [1 x i32], [1 x i32]* %x52, i32 0, i32 %x65
%x67 = load i32, i32* %x66
%x68 = load i32, i32* %x51
%x69 = srem i32 %x67 , %x68
%x70 = load i32, i32* %x51
%x71 = add i32 %x69 , %x70
%x72 = load i32, i32* %x51
%x73 = srem i32 %x71 , %x72
store i32 %x73, i32* %x63
%x74 = mul i32 0 , 1
%x75 = add i32 %x74 , 0
%x76 = getelementptr [1 x i32], [1 x i32]* %x52, i32 0, i32 %x75
%x77 = load i32, i32* %x76
call void @putint(i32 %x77)
ret i32 0
ret i32 0
}
