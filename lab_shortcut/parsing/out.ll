; ModuleID = 'llvm-link'
source_filename = "llvm-link"
target datalayout = "e-m:e-p270:32:32-p271:32:32-p272:64:64-i64:64-f80:128-n8:16:32:64-S128"
target triple = "x86_64-pc-linux-gnu"

@a = dso_local global i32 -1
@b = dso_local global i32 1
@.str = private unnamed_addr constant [3 x i8] c"%d\00", align 1
@.str.1 = private unnamed_addr constant [3 x i8] c"%c\00", align 1
@.str.2 = private unnamed_addr constant [4 x i8] c"%d:\00", align 1
@.str.3 = private unnamed_addr constant [4 x i8] c" %d\00", align 1
@.str.4 = private unnamed_addr constant [2 x i8] c"\0A\00", align 1

define dso_local i32 @inc_a() {
  %x1 = alloca i32
  %x2 = load i32, i32* @a
  store i32 %x2, i32* %x1
  %x3 = load i32, i32* %x1
  %x4 = add i32 %x3, 1
  store i32 %x4, i32* %x1
  %x5 = load i32, i32* %x1
  store i32 %x5, i32* @a
  %x6 = load i32, i32* @a
  ret i32 %x6

1:                                                ; No predecessors!
  ret i32 0
}

define dso_local i32 @main() {
  %x7 = alloca i32
  store i32 5, i32* %x7
  br label %L0

L0:                                               ; preds = %L10, %0
  %x8 = load i32, i32* %x7
  %x9 = icmp sge i32 %x8, 0
  br i1 %x9, label %L1, label %L2

L1:                                               ; preds = %L0
  %x10 = call i32 @inc_a()
  %x11 = icmp ne i32 %x10, 0
  br i1 %x11, label %L7, label %L4

L7:                                               ; preds = %L1
  %x12 = call i32 @inc_a()
  %x13 = icmp ne i32 %x12, 0
  br i1 %x13, label %L3, label %L4

1:                                                ; No predecessors!
  br i1 %x13, label %L6, label %L4

L6:                                               ; preds = %1
  %x14 = call i32 @inc_a()
  %x15 = icmp ne i32 %x14, 0
  br i1 %x15, label %L3, label %L4

2:                                                ; No predecessors!
  br i1 %x15, label %L3, label %L4

L3:                                               ; preds = %2, %L6, %L7
  %x16 = load i32, i32* @a
  call void @putint(i32 %x16)
  call void @putch(i32 32)
  %x17 = load i32, i32* @b
  call void @putint(i32 %x17)
  call void @putch(i32 10)
  br label %L5

L4:                                               ; preds = %2, %L6, %1, %L7, %L1
  br label %L5

L5:                                               ; preds = %L4, %L3
  %x18 = call i32 @inc_a()
  %x19 = icmp slt i32 %x18, 14
  br i1 %x19, label %L8, label %L11

L11:                                              ; preds = %L5
  %x20 = call i32 @inc_a()
  %x21 = icmp ne i32 %x20, 0
  br i1 %x21, label %L12, label %L9

L12:                                              ; preds = %L11
  %x22 = call i32 @inc_a()
  %x23 = call i32 @inc_a()
  %x24 = sub i32 %x22, %x23
  %x25 = add i32 %x24, 1
  %x26 = icmp ne i32 %x25, 0
  br i1 %x26, label %L8, label %L9

3:                                                ; No predecessors!
  br i1 %x26, label %L8, label %L9

4:                                                ; No predecessors!
  br i1 %x26, label %L8, label %L9

L8:                                               ; preds = %4, %3, %L12, %L5
  %x27 = load i32, i32* @a
  call void @putint(i32 %x27)
  call void @putch(i32 10)
  %x28 = load i32, i32* @b
  %x29 = mul i32 %x28, 2
  store i32 %x29, i32* @b
  br label %L10

L9:                                               ; preds = %4, %3, %L12, %L11
  %x30 = call i32 @inc_a()
  br label %L10

L10:                                              ; preds = %L9, %L8
  %x31 = load i32, i32* %x7
  %x32 = sub i32 %x31, 1
  store i32 %x32, i32* %x7
  br label %L0

L2:                                               ; preds = %L0
  %x33 = load i32, i32* @a
  call void @putint(i32 %x33)
  call void @putch(i32 32)
  %x34 = load i32, i32* @b
  call void @putint(i32 %x34)
  call void @putch(i32 10)
  ret i32 0

5:                                                ; No predecessors!
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
