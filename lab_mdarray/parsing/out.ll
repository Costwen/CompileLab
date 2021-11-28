; ModuleID = 'llvm-link'
source_filename = "llvm-link"
target datalayout = "e-m:e-p270:32:32-p271:32:32-p272:64:64-i64:64-f80:128-n8:16:32:64-S128"
target triple = "x86_64-pc-linux-gnu"

@maxn = dso_local constant i32 18
@mod = dso_local constant i32 1000000007
@dp = dso_local global [13226976 x i32] zeroinitializer
@list = dso_local global [200 x i32] zeroinitializer
@cns = dso_local global [20 x i32] zeroinitializer
@.str = private unnamed_addr constant [3 x i8] c"%d\00", align 1
@.str.1 = private unnamed_addr constant [3 x i8] c"%c\00", align 1
@.str.2 = private unnamed_addr constant [4 x i8] c"%d:\00", align 1
@.str.3 = private unnamed_addr constant [4 x i8] c" %d\00", align 1
@.str.4 = private unnamed_addr constant [2 x i8] c"\0A\00", align 1

define dso_local i32 @equal(i32 %x1, i32 %x2) {
  %x3 = alloca i32
  store i32 %x1, i32* %x3
  %x4 = alloca i32
  store i32 %x2, i32* %x4
  %x5 = load i32, i32* %x3
  %x6 = load i32, i32* %x4
  %x7 = icmp eq i32 %x5, %x6
  br i1 %x7, label %L0, label %L1

L0:                                               ; preds = %0
  ret i32 1

1:                                                ; No predecessors!
  br label %L2

L1:                                               ; preds = %0
  br label %L2

L2:                                               ; preds = %L1, %1
  ret i32 0

2:                                                ; No predecessors!
  ret i32 0
}

define dso_local i32 @dfs(i32 %x8, i32 %x9, i32 %x10, i32 %x11, i32 %x12, i32 %x13) {
  %x14 = alloca i32
  store i32 %x8, i32* %x14
  %x15 = alloca i32
  store i32 %x9, i32* %x15
  %x16 = alloca i32
  store i32 %x10, i32* %x16
  %x17 = alloca i32
  store i32 %x11, i32* %x17
  %x18 = alloca i32
  store i32 %x13, i32* %x18
  %x19 = alloca i32
  store i32 %x12, i32* %x19
  %x20 = load i32, i32* %x14
  %x21 = mul i32 %x20, 734832
  %x22 = add i32 %x21, 0
  %x23 = load i32, i32* %x15
  %x24 = mul i32 %x23, 40824
  %x25 = add i32 %x24, %x22
  %x26 = load i32, i32* %x16
  %x27 = mul i32 %x26, 2268
  %x28 = add i32 %x27, %x25
  %x29 = load i32, i32* %x17
  %x30 = mul i32 %x29, 126
  %x31 = add i32 %x30, %x28
  %x32 = load i32, i32* %x19
  %x33 = mul i32 %x32, 7
  %x34 = add i32 %x33, %x31
  %x35 = load i32, i32* %x18
  %x36 = mul i32 %x35, 1
  %x37 = add i32 %x36, %x34
  %x38 = getelementptr [13226976 x i32], [13226976 x i32]* @dp, i32 0, i32 %x37
  %x39 = load i32, i32* %x38
  %x40 = icmp ne i32 %x39, -1
  br i1 %x40, label %L3, label %L4

L3:                                               ; preds = %0
  %x41 = load i32, i32* %x14
  %x42 = mul i32 %x41, 734832
  %x43 = add i32 %x42, 0
  %x44 = load i32, i32* %x15
  %x45 = mul i32 %x44, 40824
  %x46 = add i32 %x45, %x43
  %x47 = load i32, i32* %x16
  %x48 = mul i32 %x47, 2268
  %x49 = add i32 %x48, %x46
  %x50 = load i32, i32* %x17
  %x51 = mul i32 %x50, 126
  %x52 = add i32 %x51, %x49
  %x53 = load i32, i32* %x19
  %x54 = mul i32 %x53, 7
  %x55 = add i32 %x54, %x52
  %x56 = load i32, i32* %x18
  %x57 = mul i32 %x56, 1
  %x58 = add i32 %x57, %x55
  %x59 = getelementptr [13226976 x i32], [13226976 x i32]* @dp, i32 0, i32 %x58
  %x60 = load i32, i32* %x59
  ret i32 %x60

1:                                                ; No predecessors!
  br label %L5

L4:                                               ; preds = %0
  br label %L5

L5:                                               ; preds = %L4, %1
  %x61 = load i32, i32* %x14
  %x62 = load i32, i32* %x15
  %x63 = add i32 %x61, %x62
  %x64 = load i32, i32* %x16
  %x65 = add i32 %x63, %x64
  %x66 = load i32, i32* %x17
  %x67 = add i32 %x65, %x66
  %x68 = load i32, i32* %x19
  %x69 = add i32 %x67, %x68
  %x70 = icmp eq i32 %x69, 0
  br i1 %x70, label %L6, label %L7

L6:                                               ; preds = %L5
  ret i32 1

2:                                                ; No predecessors!
  br label %L8

L7:                                               ; preds = %L5
  br label %L8

L8:                                               ; preds = %L7, %2
  %x71 = alloca i32
  store i32 0, i32* %x71
  %x72 = load i32, i32* %x14
  %x73 = icmp ne i32 %x72, 0
  br i1 %x73, label %L9, label %L10

L9:                                               ; preds = %L8
  %x74 = load i32, i32* %x18
  %x75 = call i32 @equal(i32 %x74, i32 2)
  %x76 = load i32, i32* %x14
  %x77 = sub i32 %x76, %x75
  %x78 = load i32, i32* %x14
  %x79 = sub i32 %x78, 1
  %x80 = load i32, i32* %x15
  %x81 = load i32, i32* %x16
  %x82 = load i32, i32* %x17
  %x83 = load i32, i32* %x19
  %x84 = call i32 @dfs(i32 %x79, i32 %x80, i32 %x81, i32 %x82, i32 %x83, i32 1)
  %x85 = mul i32 %x77, %x84
  %x86 = load i32, i32* %x71
  %x87 = add i32 %x86, %x85
  %x88 = srem i32 %x87, 1000000007
  store i32 %x88, i32* %x71
  br label %L11

L10:                                              ; preds = %L8
  br label %L11

L11:                                              ; preds = %L10, %L9
  %x89 = load i32, i32* %x15
  %x90 = icmp ne i32 %x89, 0
  br i1 %x90, label %L12, label %L13

L12:                                              ; preds = %L11
  %x91 = load i32, i32* %x18
  %x92 = call i32 @equal(i32 %x91, i32 3)
  %x93 = load i32, i32* %x15
  %x94 = sub i32 %x93, %x92
  %x95 = load i32, i32* %x14
  %x96 = add i32 %x95, 1
  %x97 = load i32, i32* %x15
  %x98 = sub i32 %x97, 1
  %x99 = load i32, i32* %x16
  %x100 = load i32, i32* %x17
  %x101 = load i32, i32* %x19
  %x102 = call i32 @dfs(i32 %x96, i32 %x98, i32 %x99, i32 %x100, i32 %x101, i32 2)
  %x103 = mul i32 %x94, %x102
  %x104 = load i32, i32* %x71
  %x105 = add i32 %x104, %x103
  %x106 = srem i32 %x105, 1000000007
  store i32 %x106, i32* %x71
  br label %L14

L13:                                              ; preds = %L11
  br label %L14

L14:                                              ; preds = %L13, %L12
  %x107 = load i32, i32* %x16
  %x108 = icmp ne i32 %x107, 0
  br i1 %x108, label %L15, label %L16

L15:                                              ; preds = %L14
  %x109 = load i32, i32* %x18
  %x110 = call i32 @equal(i32 %x109, i32 4)
  %x111 = load i32, i32* %x16
  %x112 = sub i32 %x111, %x110
  %x113 = load i32, i32* %x14
  %x114 = load i32, i32* %x15
  %x115 = add i32 %x114, 1
  %x116 = load i32, i32* %x16
  %x117 = sub i32 %x116, 1
  %x118 = load i32, i32* %x17
  %x119 = load i32, i32* %x19
  %x120 = call i32 @dfs(i32 %x113, i32 %x115, i32 %x117, i32 %x118, i32 %x119, i32 3)
  %x121 = mul i32 %x112, %x120
  %x122 = load i32, i32* %x71
  %x123 = add i32 %x122, %x121
  %x124 = srem i32 %x123, 1000000007
  store i32 %x124, i32* %x71
  br label %L17

L16:                                              ; preds = %L14
  br label %L17

L17:                                              ; preds = %L16, %L15
  %x125 = load i32, i32* %x17
  %x126 = icmp ne i32 %x125, 0
  br i1 %x126, label %L18, label %L19

L18:                                              ; preds = %L17
  %x127 = load i32, i32* %x18
  %x128 = call i32 @equal(i32 %x127, i32 5)
  %x129 = load i32, i32* %x17
  %x130 = sub i32 %x129, %x128
  %x131 = load i32, i32* %x14
  %x132 = load i32, i32* %x15
  %x133 = load i32, i32* %x16
  %x134 = add i32 %x133, 1
  %x135 = load i32, i32* %x17
  %x136 = sub i32 %x135, 1
  %x137 = load i32, i32* %x19
  %x138 = call i32 @dfs(i32 %x131, i32 %x132, i32 %x134, i32 %x136, i32 %x137, i32 4)
  %x139 = mul i32 %x130, %x138
  %x140 = load i32, i32* %x71
  %x141 = add i32 %x140, %x139
  %x142 = srem i32 %x141, 1000000007
  store i32 %x142, i32* %x71
  br label %L20

L19:                                              ; preds = %L17
  br label %L20

L20:                                              ; preds = %L19, %L18
  %x143 = load i32, i32* %x19
  %x144 = icmp ne i32 %x143, 0
  br i1 %x144, label %L21, label %L22

L21:                                              ; preds = %L20
  %x145 = load i32, i32* %x14
  %x146 = load i32, i32* %x15
  %x147 = load i32, i32* %x16
  %x148 = load i32, i32* %x17
  %x149 = add i32 %x148, 1
  %x150 = load i32, i32* %x19
  %x151 = sub i32 %x150, 1
  %x152 = call i32 @dfs(i32 %x145, i32 %x146, i32 %x147, i32 %x149, i32 %x151, i32 5)
  %x153 = load i32, i32* %x19
  %x154 = mul i32 %x153, %x152
  %x155 = load i32, i32* %x71
  %x156 = add i32 %x155, %x154
  %x157 = srem i32 %x156, 1000000007
  store i32 %x157, i32* %x71
  br label %L23

L22:                                              ; preds = %L20
  br label %L23

L23:                                              ; preds = %L22, %L21
  %x158 = load i32, i32* %x14
  %x159 = mul i32 %x158, 734832
  %x160 = add i32 %x159, 0
  %x161 = load i32, i32* %x15
  %x162 = mul i32 %x161, 40824
  %x163 = add i32 %x162, %x160
  %x164 = load i32, i32* %x16
  %x165 = mul i32 %x164, 2268
  %x166 = add i32 %x165, %x163
  %x167 = load i32, i32* %x17
  %x168 = mul i32 %x167, 126
  %x169 = add i32 %x168, %x166
  %x170 = load i32, i32* %x19
  %x171 = mul i32 %x170, 7
  %x172 = add i32 %x171, %x169
  %x173 = load i32, i32* %x18
  %x174 = mul i32 %x173, 1
  %x175 = add i32 %x174, %x172
  %x176 = getelementptr [13226976 x i32], [13226976 x i32]* @dp, i32 0, i32 %x175
  %x177 = load i32, i32* %x71
  %x178 = srem i32 %x177, 1000000007
  store i32 %x178, i32* %x176
  %x179 = load i32, i32* %x14
  %x180 = mul i32 %x179, 734832
  %x181 = add i32 %x180, 0
  %x182 = load i32, i32* %x15
  %x183 = mul i32 %x182, 40824
  %x184 = add i32 %x183, %x181
  %x185 = load i32, i32* %x16
  %x186 = mul i32 %x185, 2268
  %x187 = add i32 %x186, %x184
  %x188 = load i32, i32* %x17
  %x189 = mul i32 %x188, 126
  %x190 = add i32 %x189, %x187
  %x191 = load i32, i32* %x19
  %x192 = mul i32 %x191, 7
  %x193 = add i32 %x192, %x190
  %x194 = load i32, i32* %x18
  %x195 = mul i32 %x194, 1
  %x196 = add i32 %x195, %x193
  %x197 = getelementptr [13226976 x i32], [13226976 x i32]* @dp, i32 0, i32 %x196
  %x198 = load i32, i32* %x197
  ret i32 %x198

3:                                                ; No predecessors!
  ret i32 0
}

define dso_local i32 @main() {
  %x199 = alloca i32
  %x200 = call i32 @getint()
  store i32 %x200, i32* %x199
  %x201 = alloca i32
  store i32 0, i32* %x201
  br label %L24

L24:                                              ; preds = %L29, %0
  %x202 = load i32, i32* %x201
  %x203 = icmp slt i32 %x202, 18
  br i1 %x203, label %L25, label %L26

L25:                                              ; preds = %L24
  %x204 = alloca i32
  store i32 0, i32* %x204
  br label %L27

L27:                                              ; preds = %L32, %L25
  %x205 = load i32, i32* %x204
  %x206 = icmp slt i32 %x205, 18
  br i1 %x206, label %L28, label %L29

L28:                                              ; preds = %L27
  %x207 = alloca i32
  store i32 0, i32* %x207
  br label %L30

L30:                                              ; preds = %L35, %L28
  %x208 = load i32, i32* %x207
  %x209 = icmp slt i32 %x208, 18
  br i1 %x209, label %L31, label %L32

L31:                                              ; preds = %L30
  %x210 = alloca i32
  store i32 0, i32* %x210
  br label %L33

L33:                                              ; preds = %L38, %L31
  %x211 = load i32, i32* %x210
  %x212 = icmp slt i32 %x211, 18
  br i1 %x212, label %L34, label %L35

L34:                                              ; preds = %L33
  %x213 = alloca i32
  store i32 0, i32* %x213
  br label %L36

L36:                                              ; preds = %L41, %L34
  %x214 = load i32, i32* %x213
  %x215 = icmp slt i32 %x214, 18
  br i1 %x215, label %L37, label %L38

L37:                                              ; preds = %L36
  %x216 = alloca i32
  store i32 0, i32* %x216
  br label %L39

L39:                                              ; preds = %L40, %L37
  %x217 = load i32, i32* %x216
  %x218 = icmp slt i32 %x217, 7
  br i1 %x218, label %L40, label %L41

L40:                                              ; preds = %L39
  %x219 = load i32, i32* %x201
  %x220 = mul i32 %x219, 734832
  %x221 = add i32 %x220, 0
  %x222 = load i32, i32* %x204
  %x223 = mul i32 %x222, 40824
  %x224 = add i32 %x223, %x221
  %x225 = load i32, i32* %x207
  %x226 = mul i32 %x225, 2268
  %x227 = add i32 %x226, %x224
  %x228 = load i32, i32* %x210
  %x229 = mul i32 %x228, 126
  %x230 = add i32 %x229, %x227
  %x231 = load i32, i32* %x213
  %x232 = mul i32 %x231, 7
  %x233 = add i32 %x232, %x230
  %x234 = load i32, i32* %x216
  %x235 = mul i32 %x234, 1
  %x236 = add i32 %x235, %x233
  %x237 = getelementptr [13226976 x i32], [13226976 x i32]* @dp, i32 0, i32 %x236
  store i32 -1, i32* %x237
  %x238 = load i32, i32* %x216
  %x239 = add i32 %x238, 1
  store i32 %x239, i32* %x216
  br label %L39

L41:                                              ; preds = %L39
  %x240 = load i32, i32* %x213
  %x241 = add i32 %x240, 1
  store i32 %x241, i32* %x213
  br label %L36

L38:                                              ; preds = %L36
  %x242 = load i32, i32* %x210
  %x243 = add i32 %x242, 1
  store i32 %x243, i32* %x210
  br label %L33

L35:                                              ; preds = %L33
  %x244 = load i32, i32* %x207
  %x245 = add i32 %x244, 1
  store i32 %x245, i32* %x207
  br label %L30

L32:                                              ; preds = %L30
  %x246 = load i32, i32* %x204
  %x247 = add i32 %x246, 1
  store i32 %x247, i32* %x204
  br label %L27

L29:                                              ; preds = %L27
  %x248 = load i32, i32* %x201
  %x249 = add i32 %x248, 1
  store i32 %x249, i32* %x201
  br label %L24

L26:                                              ; preds = %L24
  store i32 0, i32* %x201
  br label %L42

L42:                                              ; preds = %L43, %L26
  %x250 = load i32, i32* %x201
  %x251 = load i32, i32* %x199
  %x252 = icmp slt i32 %x250, %x251
  br i1 %x252, label %L43, label %L44

L43:                                              ; preds = %L42
  %x253 = load i32, i32* %x201
  %x254 = mul i32 %x253, 1
  %x255 = add i32 %x254, 0
  %x256 = getelementptr [200 x i32], [200 x i32]* @list, i32 0, i32 %x255
  %x257 = call i32 @getint()
  store i32 %x257, i32* %x256
  %x258 = load i32, i32* %x201
  %x259 = mul i32 %x258, 1
  %x260 = add i32 %x259, 0
  %x261 = getelementptr [200 x i32], [200 x i32]* @list, i32 0, i32 %x260
  %x262 = load i32, i32* %x261
  %x263 = mul i32 %x262, 1
  %x264 = add i32 %x263, 0
  %x265 = getelementptr [20 x i32], [20 x i32]* @cns, i32 0, i32 %x264
  %x266 = load i32, i32* %x201
  %x267 = mul i32 %x266, 1
  %x268 = add i32 %x267, 0
  %x269 = getelementptr [200 x i32], [200 x i32]* @list, i32 0, i32 %x268
  %x270 = load i32, i32* %x269
  %x271 = mul i32 %x270, 1
  %x272 = add i32 %x271, 0
  %x273 = getelementptr [20 x i32], [20 x i32]* @cns, i32 0, i32 %x272
  %x274 = load i32, i32* %x273
  %x275 = add i32 %x274, 1
  store i32 %x275, i32* %x265
  %x276 = load i32, i32* %x201
  %x277 = add i32 %x276, 1
  store i32 %x277, i32* %x201
  br label %L42

L44:                                              ; preds = %L42
  %x278 = alloca i32
  %x279 = mul i32 1, 1
  %x280 = add i32 %x279, 0
  %x281 = getelementptr [20 x i32], [20 x i32]* @cns, i32 0, i32 %x280
  %x282 = load i32, i32* %x281
  %x283 = mul i32 2, 1
  %x284 = add i32 %x283, 0
  %x285 = getelementptr [20 x i32], [20 x i32]* @cns, i32 0, i32 %x284
  %x286 = load i32, i32* %x285
  %x287 = mul i32 3, 1
  %x288 = add i32 %x287, 0
  %x289 = getelementptr [20 x i32], [20 x i32]* @cns, i32 0, i32 %x288
  %x290 = load i32, i32* %x289
  %x291 = mul i32 4, 1
  %x292 = add i32 %x291, 0
  %x293 = getelementptr [20 x i32], [20 x i32]* @cns, i32 0, i32 %x292
  %x294 = load i32, i32* %x293
  %x295 = mul i32 5, 1
  %x296 = add i32 %x295, 0
  %x297 = getelementptr [20 x i32], [20 x i32]* @cns, i32 0, i32 %x296
  %x298 = load i32, i32* %x297
  %x299 = call i32 @dfs(i32 %x282, i32 %x286, i32 %x290, i32 %x294, i32 %x298, i32 0)
  store i32 %x299, i32* %x278
  %x300 = load i32, i32* %x278
  call void @putint(i32 %x300)
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
