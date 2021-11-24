; ModuleID = 'llvm-link'
source_filename = "llvm-link"
target datalayout = "e-m:e-p270:32:32-p271:32:32-p272:64:64-i64:64-f80:128-n8:16:32:64-S128"
target triple = "x86_64-pc-linux-gnu"

@__HELLO = dso_local global [100 x i32] [i32 87, i32 101, i32 108, i32 99, i32 111, i32 109, i32 101, i32 32, i32 116, i32 111, i32 32, i32 116, i32 104, i32 101, i32 32, i32 74, i32 97, i32 112, i32 97, i32 114, i32 105, i32 32, i32 80, i32 97, i32 114, i32 107, i32 33, i32 10, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0]
@N4__mE___ = dso_local global [300 x i32] [i32 83, i32 97, i32 97, i32 98, i32 97, i32 114, i32 117, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 75, i32 97, i32 98, i32 97, i32 110, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 72, i32 97, i32 115, i32 104, i32 105, i32 98, i32 105, i32 114, i32 111, i32 107, i32 111, i32 117, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 65, i32 114, i32 97, i32 105, i32 103, i32 117, i32 109, i32 97, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 72, i32 117, i32 110, i32 98, i32 111, i32 114, i32 117, i32 116, i32 111, i32 32, i32 80, i32 101, i32 110, i32 103, i32 105, i32 110, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 84, i32 97, i32 105, i32 114, i32 105, i32 107, i32 117, i32 32, i32 79, i32 111, i32 107, i32 97, i32 109, i32 105, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0]
@saY_HeI10_To = dso_local global [40 x i32] [i32 32, i32 115, i32 97, i32 121, i32 115, i32 32, i32 104, i32 101, i32 108, i32 108, i32 111, i32 32, i32 116, i32 111, i32 32, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0]
@RET = dso_local global [5 x i32] [i32 10, i32 0, i32 0, i32 0, i32 0]
@.str = private unnamed_addr constant [3 x i8] c"%d\00", align 1
@.str.1 = private unnamed_addr constant [3 x i8] c"%c\00", align 1
@.str.2 = private unnamed_addr constant [4 x i8] c"%d:\00", align 1
@.str.3 = private unnamed_addr constant [4 x i8] c" %d\00", align 1
@.str.4 = private unnamed_addr constant [2 x i8] c"\0A\00", align 1

define dso_local i32 @main() {
  %1 = alloca i32
  store i32 0, i32* %1
  br label %L0

L0:                                               ; preds = %L1, %0
  %2 = load i32, i32* %1
  %3 = mul i32 %2, 1
  %4 = add i32 %3, 0
  %5 = getelementptr [100 x i32], [100 x i32]* @__HELLO, i32 0, i32 0
  %6 = getelementptr i32, i32* %5, i32 %4
  %7 = load i32, i32* %6
  %8 = icmp ne i32 %7, 0
  br i1 %8, label %L1, label %L2

L1:                                               ; preds = %L0
  %9 = load i32, i32* %1
  %10 = mul i32 %9, 1
  %11 = add i32 %10, 0
  %12 = getelementptr [100 x i32], [100 x i32]* @__HELLO, i32 0, i32 0
  %13 = getelementptr i32, i32* %12, i32 %11
  %14 = load i32, i32* %13
  call void @putch(i32 %14)
  %15 = load i32, i32* %1
  %16 = add i32 %15, 1
  store i32 %16, i32* %1
  br label %L0

L2:                                               ; preds = %L0
  %17 = alloca i32
  store i32 0, i32* %17
  br label %L3

L3:                                               ; preds = %L23, %L2
  %18 = icmp ne i32 1, 0
  br i1 %18, label %L4, label %L5

L4:                                               ; preds = %L3
  %19 = alloca i32
  %20 = load i32, i32* %17
  %21 = sdiv i32 %20, 6
  store i32 %21, i32* %19
  %22 = alloca i32
  %23 = load i32, i32* %17
  %24 = srem i32 %23, 6
  store i32 %24, i32* %22
  %25 = load i32, i32* %19
  %26 = load i32, i32* %22
  %27 = icmp ne i32 %25, %26
  br i1 %27, label %L6, label %L7

L6:                                               ; preds = %L4
  store i32 0, i32* %1
  br label %L9

L9:                                               ; preds = %L10, %L6
  %28 = load i32, i32* %19
  %29 = mul i32 %28, 50
  %30 = add i32 %29, 0
  %31 = load i32, i32* %1
  %32 = mul i32 %31, 1
  %33 = add i32 %32, %30
  %34 = getelementptr [300 x i32], [300 x i32]* @N4__mE___, i32 0, i32 0
  %35 = getelementptr i32, i32* %34, i32 %33
  %36 = load i32, i32* %35
  %37 = icmp ne i32 %36, 0
  br i1 %37, label %L10, label %L11

L10:                                              ; preds = %L9
  %38 = load i32, i32* %19
  %39 = mul i32 %38, 50
  %40 = add i32 %39, 0
  %41 = load i32, i32* %1
  %42 = mul i32 %41, 1
  %43 = add i32 %42, %40
  %44 = getelementptr [300 x i32], [300 x i32]* @N4__mE___, i32 0, i32 0
  %45 = getelementptr i32, i32* %44, i32 %43
  %46 = load i32, i32* %45
  call void @putch(i32 %46)
  %47 = load i32, i32* %1
  %48 = add i32 %47, 1
  store i32 %48, i32* %1
  br label %L9

L11:                                              ; preds = %L9
  store i32 0, i32* %1
  br label %L12

L12:                                              ; preds = %L13, %L11
  %49 = load i32, i32* %1
  %50 = mul i32 %49, 1
  %51 = add i32 %50, 0
  %52 = getelementptr [40 x i32], [40 x i32]* @saY_HeI10_To, i32 0, i32 0
  %53 = getelementptr i32, i32* %52, i32 %51
  %54 = load i32, i32* %53
  %55 = icmp ne i32 %54, 0
  br i1 %55, label %L13, label %L14

L13:                                              ; preds = %L12
  %56 = load i32, i32* %1
  %57 = mul i32 %56, 1
  %58 = add i32 %57, 0
  %59 = getelementptr [40 x i32], [40 x i32]* @saY_HeI10_To, i32 0, i32 0
  %60 = getelementptr i32, i32* %59, i32 %58
  %61 = load i32, i32* %60
  call void @putch(i32 %61)
  %62 = load i32, i32* %1
  %63 = add i32 %62, 1
  store i32 %63, i32* %1
  br label %L12

L14:                                              ; preds = %L12
  store i32 0, i32* %1
  br label %L15

L15:                                              ; preds = %L16, %L14
  %64 = load i32, i32* %22
  %65 = mul i32 %64, 50
  %66 = add i32 %65, 0
  %67 = load i32, i32* %1
  %68 = mul i32 %67, 1
  %69 = add i32 %68, %66
  %70 = getelementptr [300 x i32], [300 x i32]* @N4__mE___, i32 0, i32 0
  %71 = getelementptr i32, i32* %70, i32 %69
  %72 = load i32, i32* %71
  %73 = icmp ne i32 %72, 0
  br i1 %73, label %L16, label %L17

L16:                                              ; preds = %L15
  %74 = load i32, i32* %22
  %75 = mul i32 %74, 50
  %76 = add i32 %75, 0
  %77 = load i32, i32* %1
  %78 = mul i32 %77, 1
  %79 = add i32 %78, %76
  %80 = getelementptr [300 x i32], [300 x i32]* @N4__mE___, i32 0, i32 0
  %81 = getelementptr i32, i32* %80, i32 %79
  %82 = load i32, i32* %81
  call void @putch(i32 %82)
  %83 = load i32, i32* %1
  %84 = add i32 %83, 1
  store i32 %84, i32* %1
  br label %L15

L17:                                              ; preds = %L15
  store i32 0, i32* %1
  br label %L18

L18:                                              ; preds = %L19, %L17
  %85 = load i32, i32* %1
  %86 = mul i32 %85, 1
  %87 = add i32 %86, 0
  %88 = getelementptr [5 x i32], [5 x i32]* @RET, i32 0, i32 0
  %89 = getelementptr i32, i32* %88, i32 %87
  %90 = load i32, i32* %89
  %91 = icmp ne i32 %90, 0
  br i1 %91, label %L19, label %L20

L19:                                              ; preds = %L18
  %92 = load i32, i32* %1
  %93 = mul i32 %92, 1
  %94 = add i32 %93, 0
  %95 = getelementptr [5 x i32], [5 x i32]* @RET, i32 0, i32 0
  %96 = getelementptr i32, i32* %95, i32 %94
  %97 = load i32, i32* %96
  call void @putch(i32 %97)
  %98 = load i32, i32* %1
  %99 = add i32 %98, 1
  store i32 %99, i32* %1
  br label %L18

L20:                                              ; preds = %L18
  br label %L8

L7:                                               ; preds = %L4
  br label %L8

L8:                                               ; preds = %L7, %L20
  %100 = load i32, i32* %17
  %101 = mul i32 %100, 17
  %102 = add i32 %101, 23
  %103 = srem i32 %102, 32
  store i32 %103, i32* %17
  %104 = load i32, i32* %17
  %105 = icmp eq i32 %104, 0
  br i1 %105, label %L21, label %L22

L21:                                              ; preds = %L8
  br label %L24

L24:                                              ; preds = %L21
  br label %L5

L25:                                              ; No predecessors!
  br label %L23

L22:                                              ; preds = %L8
  br label %L23

L23:                                              ; preds = %L22, %L25
  br label %L3

L5:                                               ; preds = %L24, %L3
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
