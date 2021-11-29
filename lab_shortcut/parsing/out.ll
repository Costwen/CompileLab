; ModuleID = 'llvm-link'
source_filename = "llvm-link"
target datalayout = "e-m:e-p270:32:32-p271:32:32-p272:64:64-i64:64-f80:128-n8:16:32:64-S128"
target triple = "x86_64-pc-linux-gnu"

@g = dso_local global i32 0
@.str = private unnamed_addr constant [3 x i8] c"%d\00", align 1
@.str.1 = private unnamed_addr constant [3 x i8] c"%c\00", align 1
@.str.2 = private unnamed_addr constant [4 x i8] c"%d:\00", align 1
@.str.3 = private unnamed_addr constant [4 x i8] c" %d\00", align 1
@.str.4 = private unnamed_addr constant [2 x i8] c"\0A\00", align 1

define dso_local i32 @func(i32 %x1) {
  %x2 = alloca i32
  store i32 %x1, i32* %x2
  %x3 = load i32, i32* @g
  %x4 = load i32, i32* %x2
  %x5 = add i32 %x3, %x4
  store i32 %x5, i32* @g
  %x6 = load i32, i32* @g
  call void @putint(i32 %x6)
  %x7 = load i32, i32* @g
  ret i32 %x7

1:                                                ; No predecessors!
  ret i32 0
}

define dso_local i32 @main() {
  %x8 = alloca i32
  %x9 = call i32 @getint()
  store i32 %x9, i32* %x8
  %x10 = load i32, i32* %x8
  %x11 = icmp sgt i32 %x10, 10
  br i1 %x11, label %L3, label %L1

L3:                                               ; preds = %0
  %x12 = load i32, i32* %x8
  %x13 = call i32 @func(i32 %x12)
  %x14 = icmp ne i32 %x13, 0
  br i1 %x14, label %L0, label %L1

L0:                                               ; preds = %L3
  store i32 1, i32* %x8
  br label %L2

L1:                                               ; preds = %L3, %0
  store i32 0, i32* %x8
  br label %L2

L2:                                               ; preds = %L1, %L0
  %x15 = call i32 @getint()
  store i32 %x15, i32* %x8
  %x16 = load i32, i32* %x8
  %x17 = icmp sgt i32 %x16, 11
  br i1 %x17, label %L7, label %L5

L7:                                               ; preds = %L2
  %x18 = load i32, i32* %x8
  %x19 = call i32 @func(i32 %x18)
  %x20 = icmp ne i32 %x19, 0
  br i1 %x20, label %L4, label %L5

L4:                                               ; preds = %L7
  store i32 1, i32* %x8
  br label %L6

L5:                                               ; preds = %L7, %L2
  store i32 0, i32* %x8
  br label %L6

L6:                                               ; preds = %L5, %L4
  %x21 = call i32 @getint()
  store i32 %x21, i32* %x8
  %x22 = load i32, i32* %x8
  %x23 = icmp sle i32 %x22, 99
  br i1 %x23, label %L8, label %L11

L11:                                              ; preds = %L6
  %x24 = load i32, i32* %x8
  %x25 = call i32 @func(i32 %x24)
  %x26 = icmp ne i32 %x25, 0
  br i1 %x26, label %L8, label %L9

1:                                                ; No predecessors!
  br i1 %x26, label %L8, label %L9

L8:                                               ; preds = %1, %L11, %L6
  store i32 1, i32* %x8
  br label %L10

L9:                                               ; preds = %1, %L11
  store i32 0, i32* %x8
  br label %L10

L10:                                              ; preds = %L9, %L8
  %x27 = call i32 @getint()
  store i32 %x27, i32* %x8
  %x28 = load i32, i32* %x8
  %x29 = icmp sle i32 %x28, 100
  br i1 %x29, label %L12, label %L15

L15:                                              ; preds = %L10
  %x30 = load i32, i32* %x8
  %x31 = call i32 @func(i32 %x30)
  %x32 = icmp ne i32 %x31, 0
  br i1 %x32, label %L12, label %L13

2:                                                ; No predecessors!
  br i1 %x32, label %L12, label %L13

L12:                                              ; preds = %2, %L15, %L10
  store i32 1, i32* %x8
  br label %L14

L13:                                              ; preds = %2, %L15
  store i32 0, i32* %x8
  br label %L14

L14:                                              ; preds = %L13, %L12
  %x33 = call i32 @func(i32 99)
  %x34 = icmp eq i32 0, %x33
  br i1 %x34, label %L19, label %L17

L19:                                              ; preds = %L14
  %x35 = call i32 @func(i32 100)
  %x36 = icmp ne i32 %x35, 0
  br i1 %x36, label %L16, label %L17

L16:                                              ; preds = %L19
  store i32 1, i32* %x8
  br label %L18

L17:                                              ; preds = %L19, %L14
  store i32 0, i32* %x8
  br label %L18

L18:                                              ; preds = %L17, %L16
  ret i32 0

3:                                                ; No predecessors!
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
