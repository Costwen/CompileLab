; ModuleID = 'llvm-link'
source_filename = "llvm-link"
target datalayout = "e-m:e-p270:32:32-p271:32:32-p272:64:64-i64:64-f80:128-n8:16:32:64-S128"
target triple = "x86_64-pc-linux-gnu"

@TAPE_LEN = dso_local constant i32 65536
@BUFFER_LEN = dso_local constant i32 32768
@tape = dso_local global [65536 x i32] zeroinitializer
@program = dso_local global [32768 x i32] zeroinitializer
@ptr = dso_local global i32 0
@.str = private unnamed_addr constant [3 x i8] c"%d\00", align 1
@.str.1 = private unnamed_addr constant [3 x i8] c"%c\00", align 1
@.str.2 = private unnamed_addr constant [4 x i8] c"%d:\00", align 1
@.str.3 = private unnamed_addr constant [4 x i8] c" %d\00", align 1
@.str.4 = private unnamed_addr constant [2 x i8] c"\0A\00", align 1

define dso_local i32 @main() {
  %1 = alloca i32
  store i32 0, i32* %1
  %2 = alloca i32
  %3 = call i32 @getint()
  store i32 %3, i32* %2
  br label %L0

L0:                                               ; preds = %L1, %0
  %4 = load i32, i32* %1
  %5 = load i32, i32* %2
  %6 = icmp slt i32 %4, %5
  br i1 %6, label %L1, label %L2

L1:                                               ; preds = %L0
  %7 = load i32, i32* %1
  %8 = mul i32 %7, 1
  %9 = add i32 %8, 0
  %10 = getelementptr [32768 x i32], [32768 x i32]* @program, i32 0, i32 0
  %11 = getelementptr i32, i32* %10, i32 %9
  %12 = call i32 @getch()
  store i32 %12, i32* %11
  %13 = load i32, i32* %1
  %14 = add i32 %13, 1
  store i32 %14, i32* %1
  br label %L0

L2:                                               ; preds = %L0
  %15 = load i32, i32* %1
  %16 = mul i32 %15, 1
  %17 = add i32 %16, 0
  %18 = getelementptr [32768 x i32], [32768 x i32]* @program, i32 0, i32 0
  %19 = getelementptr i32, i32* %18, i32 %17
  store i32 0, i32* %19
  %20 = alloca i32
  %21 = alloca i32
  store i32 0, i32* %1
  br label %L3

L3:                                               ; preds = %L8, %L2
  %22 = load i32, i32* %1
  %23 = mul i32 %22, 1
  %24 = add i32 %23, 0
  %25 = getelementptr [32768 x i32], [32768 x i32]* @program, i32 0, i32 0
  %26 = getelementptr i32, i32* %25, i32 %24
  %27 = load i32, i32* %26
  %28 = icmp ne i32 %27, 0
  br i1 %28, label %L4, label %L5

L4:                                               ; preds = %L3
  %29 = load i32, i32* %1
  %30 = mul i32 %29, 1
  %31 = add i32 %30, 0
  %32 = getelementptr [32768 x i32], [32768 x i32]* @program, i32 0, i32 0
  %33 = getelementptr i32, i32* %32, i32 %31
  %34 = load i32, i32* %33
  store i32 %34, i32* %20
  %35 = load i32, i32* %20
  %36 = icmp eq i32 %35, 62
  br i1 %36, label %L6, label %L7

L6:                                               ; preds = %L4
  %37 = load i32, i32* @ptr
  %38 = add i32 %37, 1
  store i32 %38, i32* @ptr
  br label %L8

L7:                                               ; preds = %L4
  %39 = load i32, i32* %20
  %40 = icmp eq i32 %39, 60
  br i1 %40, label %L9, label %L10

L9:                                               ; preds = %L7
  %41 = load i32, i32* @ptr
  %42 = sub i32 %41, 1
  store i32 %42, i32* @ptr
  br label %L11

L10:                                              ; preds = %L7
  %43 = load i32, i32* %20
  %44 = icmp eq i32 %43, 43
  br i1 %44, label %L12, label %L13

L12:                                              ; preds = %L10
  %45 = load i32, i32* @ptr
  %46 = mul i32 %45, 1
  %47 = add i32 %46, 0
  %48 = getelementptr [65536 x i32], [65536 x i32]* @tape, i32 0, i32 0
  %49 = getelementptr i32, i32* %48, i32 %47
  %50 = load i32, i32* @ptr
  %51 = mul i32 %50, 1
  %52 = add i32 %51, 0
  %53 = getelementptr [65536 x i32], [65536 x i32]* @tape, i32 0, i32 0
  %54 = getelementptr i32, i32* %53, i32 %52
  %55 = load i32, i32* %54
  %56 = add i32 %55, 1
  store i32 %56, i32* %49
  br label %L14

L13:                                              ; preds = %L10
  %57 = load i32, i32* %20
  %58 = icmp eq i32 %57, 45
  br i1 %58, label %L15, label %L16

L15:                                              ; preds = %L13
  %59 = load i32, i32* @ptr
  %60 = mul i32 %59, 1
  %61 = add i32 %60, 0
  %62 = getelementptr [65536 x i32], [65536 x i32]* @tape, i32 0, i32 0
  %63 = getelementptr i32, i32* %62, i32 %61
  %64 = load i32, i32* @ptr
  %65 = mul i32 %64, 1
  %66 = add i32 %65, 0
  %67 = getelementptr [65536 x i32], [65536 x i32]* @tape, i32 0, i32 0
  %68 = getelementptr i32, i32* %67, i32 %66
  %69 = load i32, i32* %68
  %70 = sub i32 %69, 1
  store i32 %70, i32* %63
  br label %L17

L16:                                              ; preds = %L13
  %71 = load i32, i32* %20
  %72 = icmp eq i32 %71, 46
  br i1 %72, label %L18, label %L19

L18:                                              ; preds = %L16
  %73 = load i32, i32* @ptr
  %74 = mul i32 %73, 1
  %75 = add i32 %74, 0
  %76 = getelementptr [65536 x i32], [65536 x i32]* @tape, i32 0, i32 0
  %77 = getelementptr i32, i32* %76, i32 %75
  %78 = load i32, i32* %77
  call void @putch(i32 %78)
  br label %L20

L19:                                              ; preds = %L16
  %79 = load i32, i32* %20
  %80 = icmp eq i32 %79, 44
  br i1 %80, label %L21, label %L22

L21:                                              ; preds = %L19
  %81 = load i32, i32* @ptr
  %82 = mul i32 %81, 1
  %83 = add i32 %82, 0
  %84 = getelementptr [65536 x i32], [65536 x i32]* @tape, i32 0, i32 0
  %85 = getelementptr i32, i32* %84, i32 %83
  %86 = call i32 @getch()
  store i32 %86, i32* %85
  br label %L23

L22:                                              ; preds = %L19
  %87 = load i32, i32* %20
  %88 = icmp eq i32 %87, 93
  %89 = load i32, i32* @ptr
  %90 = mul i32 %89, 1
  %91 = add i32 %90, 0
  %92 = getelementptr [65536 x i32], [65536 x i32]* @tape, i32 0, i32 0
  %93 = getelementptr i32, i32* %92, i32 %91
  %94 = load i32, i32* %93
  %95 = icmp ne i32 %94, 0
  %96 = and i1 %88, %95
  br i1 %96, label %L24, label %L25

L24:                                              ; preds = %L22
  store i32 1, i32* %21
  br label %L27

L27:                                              ; preds = %L32, %L24
  %97 = load i32, i32* %21
  %98 = icmp sgt i32 %97, 0
  br i1 %98, label %L28, label %L29

L28:                                              ; preds = %L27
  %99 = load i32, i32* %1
  %100 = sub i32 %99, 1
  store i32 %100, i32* %1
  %101 = load i32, i32* %1
  %102 = mul i32 %101, 1
  %103 = add i32 %102, 0
  %104 = getelementptr [32768 x i32], [32768 x i32]* @program, i32 0, i32 0
  %105 = getelementptr i32, i32* %104, i32 %103
  %106 = load i32, i32* %105
  store i32 %106, i32* %20
  %107 = load i32, i32* %20
  %108 = icmp eq i32 %107, 91
  br i1 %108, label %L30, label %L31

L30:                                              ; preds = %L28
  %109 = load i32, i32* %21
  %110 = sub i32 %109, 1
  store i32 %110, i32* %21
  br label %L32

L31:                                              ; preds = %L28
  %111 = load i32, i32* %20
  %112 = icmp eq i32 %111, 93
  br i1 %112, label %L33, label %L34

L33:                                              ; preds = %L31
  %113 = load i32, i32* %21
  %114 = add i32 %113, 1
  store i32 %114, i32* %21
  br label %L35

L34:                                              ; preds = %L31
  br label %L35

L35:                                              ; preds = %L34, %L33
  br label %L32

L32:                                              ; preds = %L35, %L30
  br label %L27

L29:                                              ; preds = %L27
  br label %L26

L25:                                              ; preds = %L22
  br label %L26

L26:                                              ; preds = %L25, %L29
  br label %L23

L23:                                              ; preds = %L26, %L21
  br label %L20

L20:                                              ; preds = %L23, %L18
  br label %L17

L17:                                              ; preds = %L20, %L15
  br label %L14

L14:                                              ; preds = %L17, %L12
  br label %L11

L11:                                              ; preds = %L14, %L9
  br label %L8

L8:                                               ; preds = %L11, %L6
  %115 = load i32, i32* %1
  %116 = add i32 %115, 1
  store i32 %116, i32* %1
  br label %L3

L5:                                               ; preds = %L3
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
