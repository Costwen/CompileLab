; ModuleID = 'llvm-link'
source_filename = "llvm-link"
target datalayout = "e-m:e-p270:32:32-p271:32:32-p272:64:64-i64:64-f80:128-n8:16:32:64-S128"
target triple = "x86_64-pc-linux-gnu"

@.str = private unnamed_addr constant [3 x i8] c"%d\00", align 1
@.str.1 = private unnamed_addr constant [3 x i8] c"%c\00", align 1
@.str.2 = private unnamed_addr constant [4 x i8] c"%d:\00", align 1
@.str.3 = private unnamed_addr constant [4 x i8] c" %d\00", align 1
@.str.4 = private unnamed_addr constant [2 x i8] c"\0A\00", align 1

define dso_local i32 @exgcd(i32 %x1, i32 %x2, i32* %x3, i32* %x4) {
  %x5 = alloca i32
  store i32 %x1, i32* %x5
  %x6 = alloca i32
  store i32 %x2, i32* %x6
  %x7 = load i32, i32* %x6
  %x8 = icmp eq i32 %x7, 0
  br i1 %x8, label %L0, label %L1

L0:                                               ; preds = %0
  %x9 = mul i32 0, 1
  %x10 = add i32 %x9, 0
  %x11 = getelementptr i32, i32* %x3, i32 %x10
  store i32 1, i32* %x11
  %x12 = mul i32 0, 1
  %x13 = add i32 %x12, 0
  %x14 = getelementptr i32, i32* %x4, i32 %x13
  store i32 0, i32* %x14
  %x15 = load i32, i32* %x5
  ret i32 %x15

1:                                                ; No predecessors!
  br label %L2

L1:                                               ; preds = %0
  %x16 = alloca i32
  %x17 = load i32, i32* %x6
  %x18 = load i32, i32* %x5
  %x19 = load i32, i32* %x6
  %x20 = srem i32 %x18, %x19
  %x21 = getelementptr i32, i32* %x3, i32 0
  %x22 = getelementptr i32, i32* %x4, i32 0
  %x23 = call i32 @exgcd(i32 %x17, i32 %x20, i32* %x21, i32* %x22)
  store i32 %x23, i32* %x16
  %x24 = alloca i32
  %x25 = mul i32 0, 1
  %x26 = add i32 %x25, 0
  %x27 = getelementptr i32, i32* %x3, i32 %x26
  %x28 = load i32, i32* %x27
  store i32 %x28, i32* %x24
  %x29 = mul i32 0, 1
  %x30 = add i32 %x29, 0
  %x31 = getelementptr i32, i32* %x3, i32 %x30
  %x32 = mul i32 0, 1
  %x33 = add i32 %x32, 0
  %x34 = getelementptr i32, i32* %x4, i32 %x33
  %x35 = load i32, i32* %x34
  store i32 %x35, i32* %x31
  %x36 = mul i32 0, 1
  %x37 = add i32 %x36, 0
  %x38 = getelementptr i32, i32* %x4, i32 %x37
  %x39 = load i32, i32* %x5
  %x40 = load i32, i32* %x6
  %x41 = sdiv i32 %x39, %x40
  %x42 = mul i32 0, 1
  %x43 = add i32 %x42, 0
  %x44 = getelementptr i32, i32* %x4, i32 %x43
  %x45 = load i32, i32* %x44
  %x46 = mul i32 %x41, %x45
  %x47 = load i32, i32* %x24
  %x48 = sub i32 %x47, %x46
  store i32 %x48, i32* %x38
  %x49 = load i32, i32* %x16
  ret i32 %x49

2:                                                ; No predecessors!
  br label %L2

L2:                                               ; preds = %2, %1
  ret i32 0
}

define dso_local i32 @main() {
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
  %x60 = call i32 @exgcd(i32 %x56, i32 %x57, i32* %x58, i32* %x59)
  %x61 = mul i32 0, 1
  %x62 = add i32 %x61, 0
  %x63 = getelementptr [1 x i32], [1 x i32]* %x52, i32 0, i32 %x62
  %x64 = mul i32 0, 1
  %x65 = add i32 %x64, 0
  %x66 = getelementptr [1 x i32], [1 x i32]* %x52, i32 0, i32 %x65
  %x67 = load i32, i32* %x66
  %x68 = load i32, i32* %x51
  %x69 = srem i32 %x67, %x68
  %x70 = load i32, i32* %x51
  %x71 = add i32 %x69, %x70
  %x72 = load i32, i32* %x51
  %x73 = srem i32 %x71, %x72
  store i32 %x73, i32* %x63
  %x74 = mul i32 0, 1
  %x75 = add i32 %x74, 0
  %x76 = getelementptr [1 x i32], [1 x i32]* %x52, i32 0, i32 %x75
  %x77 = load i32, i32* %x76
  call void @putint(i32 %x77)
  ret i32 0

1:                                                ; No predecessors!
  ret i32 0
}

; Function Attrs: noinline nounwind optnone uwtable
define dso_local i32 @getint() #0 {
  %1 = alloca i32, align 4
  %2 = call i32 (i8*, ...) @__isoc99_scanf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @.str, i64 0, i64 0), i32* %1)
  %3 = load i32, i32* %1, align 4
  ret i32 %3
}

declare dso_local i32 @__isoc99_scanf(i8*, ...) #1

; Function Attrs: noinline nounwind optnone uwtable
define dso_local i32 @getch() #0 {
  %1 = alloca i8, align 1
  %2 = call i32 (i8*, ...) @__isoc99_scanf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @.str.1, i64 0, i64 0), i8* %1)
  %3 = load i8, i8* %1, align 1
  %4 = sext i8 %3 to i32
  ret i32 %4
}

; Function Attrs: noinline nounwind optnone uwtable
define dso_local i32 @getarray(i32* %0) #0 {
  %2 = alloca i32*, align 8
  %3 = alloca i32, align 4
  %4 = alloca i32, align 4
  store i32* %0, i32** %2, align 8
  %5 = call i32 (i8*, ...) @__isoc99_scanf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @.str, i64 0, i64 0), i32* %3)
  store i32 0, i32* %4, align 4
  br label %6

6:                                                ; preds = %16, %1
  %7 = load i32, i32* %4, align 4
  %8 = load i32, i32* %3, align 4
  %9 = icmp slt i32 %7, %8
  br i1 %9, label %10, label %19

10:                                               ; preds = %6
  %11 = load i32*, i32** %2, align 8
  %12 = load i32, i32* %4, align 4
  %13 = sext i32 %12 to i64
  %14 = getelementptr inbounds i32, i32* %11, i64 %13
  %15 = call i32 (i8*, ...) @__isoc99_scanf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @.str, i64 0, i64 0), i32* %14)
  br label %16

16:                                               ; preds = %10
  %17 = load i32, i32* %4, align 4
  %18 = add nsw i32 %17, 1
  store i32 %18, i32* %4, align 4
  br label %6

19:                                               ; preds = %6
  %20 = load i32, i32* %3, align 4
  ret i32 %20
}

; Function Attrs: noinline nounwind optnone uwtable
define dso_local void @putint(i32 %0) #0 {
  %2 = alloca i32, align 4
  store i32 %0, i32* %2, align 4
  %3 = load i32, i32* %2, align 4
  %4 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @.str, i64 0, i64 0), i32 %3)
  ret void
}

declare dso_local i32 @printf(i8*, ...) #1

; Function Attrs: noinline nounwind optnone uwtable
define dso_local void @putch(i32 %0) #0 {
  %2 = alloca i32, align 4
  store i32 %0, i32* %2, align 4
  %3 = load i32, i32* %2, align 4
  %4 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @.str.1, i64 0, i64 0), i32 %3)
  ret void
}

; Function Attrs: noinline nounwind optnone uwtable
define dso_local void @putarray(i32 %0, i32* %1) #0 {
  %3 = alloca i32, align 4
  %4 = alloca i32*, align 8
  %5 = alloca i32, align 4
  store i32 %0, i32* %3, align 4
  store i32* %1, i32** %4, align 8
  %6 = load i32, i32* %3, align 4
  %7 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str.2, i64 0, i64 0), i32 %6)
  store i32 0, i32* %5, align 4
  br label %8

8:                                                ; preds = %19, %2
  %9 = load i32, i32* %5, align 4
  %10 = load i32, i32* %3, align 4
  %11 = icmp slt i32 %9, %10
  br i1 %11, label %12, label %22

12:                                               ; preds = %8
  %13 = load i32*, i32** %4, align 8
  %14 = load i32, i32* %5, align 4
  %15 = sext i32 %14 to i64
  %16 = getelementptr inbounds i32, i32* %13, i64 %15
  %17 = load i32, i32* %16, align 4
  %18 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str.3, i64 0, i64 0), i32 %17)
  br label %19

19:                                               ; preds = %12
  %20 = load i32, i32* %5, align 4
  %21 = add nsw i32 %20, 1
  store i32 %21, i32* %5, align 4
  br label %8

22:                                               ; preds = %8
  %23 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([2 x i8], [2 x i8]* @.str.4, i64 0, i64 0))
  ret void
}

attributes #0 = { noinline nounwind optnone uwtable "correctly-rounded-divide-sqrt-fp-math"="false" "disable-tail-calls"="false" "frame-pointer"="all" "less-precise-fpmad"="false" "min-legal-vector-width"="0" "no-infs-fp-math"="false" "no-jump-tables"="false" "no-nans-fp-math"="false" "no-signed-zeros-fp-math"="false" "no-trapping-math"="false" "stack-protector-buffer-size"="8" "target-cpu"="x86-64" "target-features"="+cx8,+fxsr,+mmx,+sse,+sse2,+x87" "unsafe-fp-math"="false" "use-soft-float"="false" }
attributes #1 = { "correctly-rounded-divide-sqrt-fp-math"="false" "disable-tail-calls"="false" "frame-pointer"="all" "less-precise-fpmad"="false" "no-infs-fp-math"="false" "no-nans-fp-math"="false" "no-signed-zeros-fp-math"="false" "no-trapping-math"="false" "stack-protector-buffer-size"="8" "target-cpu"="x86-64" "target-features"="+cx8,+fxsr,+mmx,+sse,+sse2,+x87" "unsafe-fp-math"="false" "use-soft-float"="false" }

!llvm.ident = !{!0}
!llvm.module.flags = !{!1}

!0 = !{!"clang version 10.0.0-4ubuntu1~18.04.2 "}
!1 = !{i32 1, !"wchar_size", i32 4}
