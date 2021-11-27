; ModuleID = 'llvm-link'
source_filename = "llvm-link"
target datalayout = "e-m:e-p270:32:32-p271:32:32-p272:64:64-i64:64-f80:128-n8:16:32:64-S128"
target triple = "x86_64-pc-linux-gnu"

@.str = private unnamed_addr constant [3 x i8] c"%d\00", align 1
@.str.1 = private unnamed_addr constant [3 x i8] c"%c\00", align 1
@.str.2 = private unnamed_addr constant [4 x i8] c"%d:\00", align 1
@.str.3 = private unnamed_addr constant [4 x i8] c" %d\00", align 1
@.str.4 = private unnamed_addr constant [2 x i8] c"\0A\00", align 1

define dso_local void @set1(i32 %x1, i32* %x2) {
  %x3 = mul i32 %x1, 1
  %x4 = add i32 %x3, 0
  %x5 = getelementptr i32, i32* %x2, i32 %x4
  store i32 1, i32* %x5
  ret void
}

define dso_local i32 @main() {
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
  %x18 = mul i32 0, 5
  %x19 = add i32 %x18, 0
  %x20 = getelementptr [10 x i32], [10 x i32]* %x6, i32 0, i32 %x19
  %x21 = call i32 @getarray(i32* %x20)
  store i32 %x21, i32* %x17
  %x22 = mul i32 1, 5
  %x23 = add i32 %x22, 0
  %x24 = getelementptr [10 x i32], [10 x i32]* %x6, i32 0, i32 %x23
  %x25 = call i32 @getarray(i32* %x24)
  %x26 = alloca i32
  store i32 0, i32* %x26
  br label %L0

L0:                                               ; preds = %L1, %0
  %x27 = load i32, i32* %x26
  %x28 = load i32, i32* %x17
  %x29 = icmp slt i32 %x27, %x28
  br i1 %x29, label %L1, label %L2

L1:                                               ; preds = %L0
  %x30 = load i32, i32* %x26
  %x31 = load i32, i32* %x26
  %x32 = srem i32 %x31, 2
  %x33 = mul i32 %x32, 5
  %x34 = add i32 %x33, 0
  %x35 = getelementptr [10 x i32], [10 x i32]* %x6, i32 0, i32 %x34
  call void @set1(i32 %x30, i32* %x35)
  %x36 = load i32, i32* %x26
  %x37 = add i32 %x36, 1
  store i32 %x37, i32* %x26
  br label %L0

L2:                                               ; preds = %L0
  %x38 = load i32, i32* %x17
  %x39 = mul i32 0, 5
  %x40 = add i32 %x39, 0
  %x41 = getelementptr [10 x i32], [10 x i32]* %x6, i32 0, i32 %x40
  call void @putarray(i32 %x38, i32* %x41)
  %x42 = load i32, i32* %x17
  %x43 = mul i32 1, 5
  %x44 = add i32 %x43, 0
  %x45 = getelementptr [10 x i32], [10 x i32]* %x6, i32 0, i32 %x44
  call void @putarray(i32 %x42, i32* %x45)
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
