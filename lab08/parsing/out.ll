; ModuleID = 'llvm-link'
source_filename = "llvm-link"
target datalayout = "e-m:e-p270:32:32-p271:32:32-p272:64:64-i64:64-f80:128-n8:16:32:64-S128"
target triple = "x86_64-pc-linux-gnu"

@a = dso_local global [8 x i32] zeroinitializer
@b = dso_local constant [8 x i32] [i32 9, i32 2, i32 3, i32 4, i32 1, i32 5, i32 4, i32 0]
@c = dso_local global [8 x i32] [i32 1, i32 2, i32 3, i32 4, i32 6, i32 3, i32 7, i32 8]
@e = dso_local global [8 x i32] [i32 6, i32 7, i32 4, i32 5, i32 5, i32 6, i32 9, i32 10]
@.str = private unnamed_addr constant [3 x i8] c"%d\00", align 1
@.str.1 = private unnamed_addr constant [3 x i8] c"%c\00", align 1
@.str.2 = private unnamed_addr constant [4 x i8] c"%d:\00", align 1
@.str.3 = private unnamed_addr constant [4 x i8] c" %d\00", align 1
@.str.4 = private unnamed_addr constant [2 x i8] c"\0A\00", align 1

define dso_local i32 @main() {
  %1 = mul i32 2, 2
  %2 = add i32 %1, 0
  %3 = mul i32 1, 1
  %4 = add i32 %3, %2
  %5 = getelementptr [8 x i32], [8 x i32]* @e, i32 0, i32 0
  %6 = getelementptr i32, i32* %5, i32 %4
  %7 = mul i32 0, 2
  %8 = add i32 %7, 0
  %9 = mul i32 1, 1
  %10 = add i32 %9, %8
  %11 = getelementptr [8 x i32], [8 x i32]* @e, i32 0, i32 0
  %12 = getelementptr i32, i32* %11, i32 %10
  %13 = load i32, i32* %6
  %14 = load i32, i32* %12
  %15 = add i32 %13, %14
  %16 = mul i32 0, 2
  %17 = add i32 %16, 0
  %18 = mul i32 0, 1
  %19 = add i32 %18, %17
  %20 = getelementptr [8 x i32], [8 x i32]* @e, i32 0, i32 0
  %21 = getelementptr i32, i32* %20, i32 %19
  %22 = load i32, i32* %21
  %23 = sub i32 %15, %22
  %24 = mul i32 2, 2
  %25 = add i32 %24, 0
  %26 = mul i32 0, 1
  %27 = add i32 %26, %25
  %28 = getelementptr [8 x i32], [8 x i32]* @a, i32 0, i32 0
  %29 = getelementptr i32, i32* %28, i32 %27
  %30 = load i32, i32* %29
  %31 = add i32 %23, %30
  call void @putint(i32 %31)
  %32 = alloca [8 x i32]
  %33 = getelementptr [8 x i32], [8 x i32]* %32, i32 0, i32 0
  %34 = getelementptr i32, i32* %33, i32 0
  store i32 0, i32* %34
  %35 = getelementptr i32, i32* %33, i32 1
  store i32 0, i32* %35
  %36 = getelementptr i32, i32* %33, i32 2
  store i32 0, i32* %36
  %37 = getelementptr i32, i32* %33, i32 3
  store i32 0, i32* %37
  %38 = getelementptr i32, i32* %33, i32 4
  store i32 0, i32* %38
  %39 = getelementptr i32, i32* %33, i32 5
  store i32 0, i32* %39
  %40 = getelementptr i32, i32* %33, i32 6
  store i32 0, i32* %40
  %41 = getelementptr i32, i32* %33, i32 7
  store i32 0, i32* %41
  %42 = alloca [8 x i32]
  %43 = getelementptr [8 x i32], [8 x i32]* %42, i32 0, i32 0
  %44 = getelementptr i32, i32* %43, i32 0
  store i32 1, i32* %44
  %45 = getelementptr i32, i32* %43, i32 1
  store i32 2, i32* %45
  %46 = getelementptr i32, i32* %43, i32 2
  store i32 3, i32* %46
  %47 = getelementptr i32, i32* %43, i32 3
  store i32 4, i32* %47
  %48 = getelementptr i32, i32* %43, i32 4
  store i32 5, i32* %48
  %49 = getelementptr i32, i32* %43, i32 5
  store i32 6, i32* %49
  %50 = getelementptr i32, i32* %43, i32 6
  store i32 7, i32* %50
  %51 = getelementptr i32, i32* %43, i32 7
  store i32 8, i32* %51
  %52 = alloca [8 x i32]
  %53 = getelementptr [8 x i32], [8 x i32]* %52, i32 0, i32 0
  %54 = getelementptr i32, i32* %53, i32 0
  store i32 1, i32* %54
  %55 = getelementptr i32, i32* %53, i32 1
  store i32 2, i32* %55
  %56 = getelementptr i32, i32* %53, i32 2
  store i32 3, i32* %56
  %57 = getelementptr i32, i32* %53, i32 3
  store i32 4, i32* %57
  %58 = getelementptr i32, i32* %53, i32 4
  store i32 5, i32* %58
  %59 = getelementptr i32, i32* %53, i32 5
  store i32 6, i32* %59
  %60 = getelementptr i32, i32* %53, i32 6
  store i32 7, i32* %60
  %61 = getelementptr i32, i32* %53, i32 7
  store i32 8, i32* %61
  call void @putch(i32 10)
  %62 = alloca [8 x i32]
  %63 = mul i32 6, 1
  %64 = add i32 %63, 0
  %65 = getelementptr [8 x i32], [8 x i32]* %42, i32 0, i32 0
  %66 = getelementptr i32, i32* %65, i32 %64
  %67 = mul i32 7, 1
  %68 = add i32 %67, 0
  %69 = getelementptr [8 x i32], [8 x i32]* %42, i32 0, i32 0
  %70 = getelementptr i32, i32* %69, i32 %68
  %71 = getelementptr [8 x i32], [8 x i32]* %62, i32 0, i32 0
  %72 = getelementptr i32, i32* %71, i32 0
  %73 = load i32, i32* %66
  store i32 %73, i32* %72
  %74 = getelementptr i32, i32* %71, i32 1
  %75 = load i32, i32* %70
  store i32 %75, i32* %74
  %76 = getelementptr i32, i32* %71, i32 2
  store i32 3, i32* %76
  %77 = getelementptr i32, i32* %71, i32 3
  store i32 4, i32* %77
  %78 = getelementptr i32, i32* %71, i32 4
  store i32 5, i32* %78
  %79 = getelementptr i32, i32* %71, i32 5
  store i32 6, i32* %79
  %80 = getelementptr i32, i32* %71, i32 6
  store i32 7, i32* %80
  %81 = getelementptr i32, i32* %71, i32 7
  store i32 8, i32* %81
  %82 = mul i32 3, 2
  %83 = add i32 %82, 0
  %84 = mul i32 1, 1
  %85 = add i32 %84, %83
  %86 = getelementptr [8 x i32], [8 x i32]* %62, i32 0, i32 0
  %87 = getelementptr i32, i32* %86, i32 %85
  %88 = mul i32 0, 2
  %89 = add i32 %88, 0
  %90 = mul i32 0, 1
  %91 = add i32 %90, %89
  %92 = getelementptr [8 x i32], [8 x i32]* %62, i32 0, i32 0
  %93 = getelementptr i32, i32* %92, i32 %91
  %94 = load i32, i32* %87
  %95 = load i32, i32* %93
  %96 = add i32 %94, %95
  %97 = mul i32 0, 2
  %98 = add i32 %97, 0
  %99 = mul i32 1, 1
  %100 = add i32 %99, %98
  %101 = getelementptr [8 x i32], [8 x i32]* %62, i32 0, i32 0
  %102 = getelementptr i32, i32* %101, i32 %100
  %103 = load i32, i32* %102
  %104 = add i32 %96, %103
  %105 = mul i32 2, 2
  %106 = add i32 %105, 0
  %107 = mul i32 0, 1
  %108 = add i32 %107, %106
  %109 = getelementptr [8 x i32], [8 x i32]* %32, i32 0, i32 0
  %110 = getelementptr i32, i32* %109, i32 %108
  %111 = load i32, i32* %110
  %112 = add i32 %104, %111
  call void @putint(i32 %112)
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
