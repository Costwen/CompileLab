; ModuleID = 'llvm-link'
source_filename = "llvm-link"
target datalayout = "e-m:e-p270:32:32-p271:32:32-p272:64:64-i64:64-f80:128-n8:16:32:64-S128"
target triple = "x86_64-pc-linux-gnu"

@ints = dso_local global [10000 x i32] zeroinitializer
@intt = dso_local global i32 0
@chas = dso_local global [10000 x i32] zeroinitializer
@chat = dso_local global i32 0
@i = dso_local global i32 0
@ii = dso_local global i32 1
@c = dso_local global i32 0
@get = dso_local global [10000 x i32] zeroinitializer
@get2 = dso_local global [10000 x i32] zeroinitializer
@.str = private unnamed_addr constant [3 x i8] c"%d\00", align 1
@.str.1 = private unnamed_addr constant [3 x i8] c"%c\00", align 1
@.str.2 = private unnamed_addr constant [4 x i8] c"%d:\00", align 1
@.str.3 = private unnamed_addr constant [4 x i8] c" %d\00", align 1
@.str.4 = private unnamed_addr constant [2 x i8] c"\0A\00", align 1

define dso_local i32 @isdigit(i32 %x1) {
  %x2 = alloca i32
  store i32 %x1, i32* %x2
  %x3 = load i32, i32* %x2
  %x4 = icmp sge i32 %x3, 48
  %x5 = load i32, i32* %x2
  %x6 = icmp sle i32 %x5, 57
  %x7 = and i1 %x4, %x6
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

define dso_local i32 @power(i32 %x8, i32 %x9) {
  %x10 = alloca i32
  store i32 %x9, i32* %x10
  %x11 = alloca i32
  store i32 %x8, i32* %x11
  %x12 = alloca i32
  store i32 1, i32* %x12
  br label %L3

L3:                                               ; preds = %L4, %0
  %x13 = load i32, i32* %x10
  %x14 = icmp ne i32 %x13, 0
  br i1 %x14, label %L4, label %L5

L4:                                               ; preds = %L3
  %x15 = load i32, i32* %x12
  %x16 = load i32, i32* %x11
  %x17 = mul i32 %x15, %x16
  store i32 %x17, i32* %x12
  %x18 = load i32, i32* %x10
  %x19 = sub i32 %x18, 1
  store i32 %x19, i32* %x10
  br label %L3

L5:                                               ; preds = %L3
  %x20 = load i32, i32* %x12
  ret i32 %x20

1:                                                ; No predecessors!
  ret i32 0
}

define dso_local i32 @getstr(i32* %x21) {
  %x22 = alloca i32
  %x23 = call i32 @getch()
  store i32 %x23, i32* %x22
  %x24 = alloca i32
  store i32 0, i32* %x24
  br label %L6

L6:                                               ; preds = %L7, %0
  %x25 = load i32, i32* %x22
  %x26 = icmp ne i32 %x25, 13
  %x27 = load i32, i32* %x22
  %x28 = icmp ne i32 %x27, 10
  %x29 = and i1 %x26, %x28
  br i1 %x29, label %L7, label %L8

L7:                                               ; preds = %L6
  %x30 = load i32, i32* %x24
  %x31 = mul i32 %x30, 1
  %x32 = add i32 %x31, 0
  %x33 = getelementptr i32, i32* %x21, i32 %x32
  %x34 = load i32, i32* %x22
  store i32 %x34, i32* %x33
  %x35 = load i32, i32* %x24
  %x36 = add i32 %x35, 1
  store i32 %x36, i32* %x24
  %x37 = call i32 @getch()
  store i32 %x37, i32* %x22
  br label %L6

L8:                                               ; preds = %L6
  %x38 = load i32, i32* %x24
  ret i32 %x38

1:                                                ; No predecessors!
  ret i32 0
}

define dso_local void @intpush(i32 %x39) {
  %x40 = alloca i32
  store i32 %x39, i32* %x40
  %x41 = load i32, i32* @intt
  %x42 = add i32 %x41, 1
  store i32 %x42, i32* @intt
  %x43 = load i32, i32* @intt
  %x44 = mul i32 %x43, 1
  %x45 = add i32 %x44, 0
  %x46 = getelementptr [10000 x i32], [10000 x i32]* @ints, i32 0, i32 %x45
  %x47 = load i32, i32* %x40
  store i32 %x47, i32* %x46
  ret void
}

define dso_local void @chapush(i32 %x48) {
  %x49 = alloca i32
  store i32 %x48, i32* %x49
  %x50 = load i32, i32* @chat
  %x51 = add i32 %x50, 1
  store i32 %x51, i32* @chat
  %x52 = load i32, i32* @chat
  %x53 = mul i32 %x52, 1
  %x54 = add i32 %x53, 0
  %x55 = getelementptr [10000 x i32], [10000 x i32]* @chas, i32 0, i32 %x54
  %x56 = load i32, i32* %x49
  store i32 %x56, i32* %x55
  ret void
}

define dso_local i32 @intpop() {
  %x57 = load i32, i32* @intt
  %x58 = sub i32 %x57, 1
  store i32 %x58, i32* @intt
  %x59 = load i32, i32* @intt
  %x60 = add i32 %x59, 1
  %x61 = mul i32 %x60, 1
  %x62 = add i32 %x61, 0
  %x63 = getelementptr [10000 x i32], [10000 x i32]* @ints, i32 0, i32 %x62
  %x64 = load i32, i32* %x63
  ret i32 %x64

1:                                                ; No predecessors!
  ret i32 0
}

define dso_local i32 @chapop() {
  %x65 = load i32, i32* @chat
  %x66 = sub i32 %x65, 1
  store i32 %x66, i32* @chat
  %x67 = load i32, i32* @chat
  %x68 = add i32 %x67, 1
  %x69 = mul i32 %x68, 1
  %x70 = add i32 %x69, 0
  %x71 = getelementptr [10000 x i32], [10000 x i32]* @chas, i32 0, i32 %x70
  %x72 = load i32, i32* %x71
  ret i32 %x72

1:                                                ; No predecessors!
  ret i32 0
}

define dso_local void @intadd(i32 %x73) {
  %x74 = alloca i32
  store i32 %x73, i32* %x74
  %x75 = load i32, i32* @intt
  %x76 = mul i32 %x75, 1
  %x77 = add i32 %x76, 0
  %x78 = getelementptr [10000 x i32], [10000 x i32]* @ints, i32 0, i32 %x77
  %x79 = load i32, i32* @intt
  %x80 = mul i32 %x79, 1
  %x81 = add i32 %x80, 0
  %x82 = getelementptr [10000 x i32], [10000 x i32]* @ints, i32 0, i32 %x81
  %x83 = load i32, i32* %x82
  %x84 = mul i32 %x83, 10
  store i32 %x84, i32* %x78
  %x85 = load i32, i32* @intt
  %x86 = mul i32 %x85, 1
  %x87 = add i32 %x86, 0
  %x88 = getelementptr [10000 x i32], [10000 x i32]* @ints, i32 0, i32 %x87
  %x89 = load i32, i32* @intt
  %x90 = mul i32 %x89, 1
  %x91 = add i32 %x90, 0
  %x92 = getelementptr [10000 x i32], [10000 x i32]* @ints, i32 0, i32 %x91
  %x93 = load i32, i32* %x92
  %x94 = load i32, i32* %x74
  %x95 = add i32 %x93, %x94
  store i32 %x95, i32* %x88
  ret void
}

define dso_local i32 @find() {
  %x96 = call i32 @chapop()
  store i32 %x96, i32* @c
  %x97 = load i32, i32* @ii
  %x98 = mul i32 %x97, 1
  %x99 = add i32 %x98, 0
  %x100 = getelementptr [10000 x i32], [10000 x i32]* @get2, i32 0, i32 %x99
  store i32 32, i32* %x100
  %x101 = load i32, i32* @ii
  %x102 = add i32 %x101, 1
  %x103 = mul i32 %x102, 1
  %x104 = add i32 %x103, 0
  %x105 = getelementptr [10000 x i32], [10000 x i32]* @get2, i32 0, i32 %x104
  %x106 = load i32, i32* @c
  store i32 %x106, i32* %x105
  %x107 = load i32, i32* @ii
  %x108 = add i32 %x107, 2
  store i32 %x108, i32* @ii
  %x109 = load i32, i32* @chat
  %x110 = icmp eq i32 %x109, 0
  br i1 %x110, label %L9, label %L10

L9:                                               ; preds = %0
  ret i32 0

1:                                                ; No predecessors!
  br label %L11

L10:                                              ; preds = %0
  br label %L11

L11:                                              ; preds = %L10, %1
  ret i32 1

2:                                                ; No predecessors!
  ret i32 0
}

define dso_local i32 @main() {
  store i32 0, i32* @intt
  store i32 0, i32* @chat
  %x111 = alloca i32
  %x112 = getelementptr [10000 x i32], [10000 x i32]* @get, i32 0, i32 0
  %x113 = call i32 @getstr(i32* %x112)
  store i32 %x113, i32* %x111
  br label %L12

L12:                                              ; preds = %L17, %0
  %x114 = load i32, i32* @i
  %x115 = load i32, i32* %x111
  %x116 = icmp slt i32 %x114, %x115
  br i1 %x116, label %L13, label %L14

L13:                                              ; preds = %L12
  %x117 = load i32, i32* @i
  %x118 = mul i32 %x117, 1
  %x119 = add i32 %x118, 0
  %x120 = getelementptr [10000 x i32], [10000 x i32]* @get, i32 0, i32 %x119
  %x121 = load i32, i32* %x120
  %x122 = call i32 @isdigit(i32 %x121)
  %x123 = icmp eq i32 %x122, 1
  br i1 %x123, label %L15, label %L16

L15:                                              ; preds = %L13
  %x124 = load i32, i32* @ii
  %x125 = mul i32 %x124, 1
  %x126 = add i32 %x125, 0
  %x127 = getelementptr [10000 x i32], [10000 x i32]* @get2, i32 0, i32 %x126
  %x128 = load i32, i32* @i
  %x129 = mul i32 %x128, 1
  %x130 = add i32 %x129, 0
  %x131 = getelementptr [10000 x i32], [10000 x i32]* @get, i32 0, i32 %x130
  %x132 = load i32, i32* %x131
  store i32 %x132, i32* %x127
  %x133 = load i32, i32* @ii
  %x134 = add i32 %x133, 1
  store i32 %x134, i32* @ii
  br label %L17

L16:                                              ; preds = %L13
  %x135 = load i32, i32* @i
  %x136 = mul i32 %x135, 1
  %x137 = add i32 %x136, 0
  %x138 = getelementptr [10000 x i32], [10000 x i32]* @get, i32 0, i32 %x137
  %x139 = load i32, i32* %x138
  %x140 = icmp eq i32 %x139, 40
  br i1 %x140, label %L18, label %L19

L18:                                              ; preds = %L16
  call void @chapush(i32 40)
  br label %L20

L19:                                              ; preds = %L16
  br label %L20

L20:                                              ; preds = %L19, %L18
  %x141 = load i32, i32* @i
  %x142 = mul i32 %x141, 1
  %x143 = add i32 %x142, 0
  %x144 = getelementptr [10000 x i32], [10000 x i32]* @get, i32 0, i32 %x143
  %x145 = load i32, i32* %x144
  %x146 = icmp eq i32 %x145, 94
  br i1 %x146, label %L21, label %L22

L21:                                              ; preds = %L20
  call void @chapush(i32 94)
  br label %L23

L22:                                              ; preds = %L20
  br label %L23

L23:                                              ; preds = %L22, %L21
  %x147 = load i32, i32* @i
  %x148 = mul i32 %x147, 1
  %x149 = add i32 %x148, 0
  %x150 = getelementptr [10000 x i32], [10000 x i32]* @get, i32 0, i32 %x149
  %x151 = load i32, i32* %x150
  %x152 = icmp eq i32 %x151, 41
  br i1 %x152, label %L24, label %L25

L24:                                              ; preds = %L23
  %x153 = call i32 @chapop()
  store i32 %x153, i32* @c
  br label %L27

L27:                                              ; preds = %L28, %L24
  %x154 = load i32, i32* @c
  %x155 = icmp ne i32 %x154, 40
  br i1 %x155, label %L28, label %L29

L28:                                              ; preds = %L27
  %x156 = load i32, i32* @ii
  %x157 = mul i32 %x156, 1
  %x158 = add i32 %x157, 0
  %x159 = getelementptr [10000 x i32], [10000 x i32]* @get2, i32 0, i32 %x158
  store i32 32, i32* %x159
  %x160 = load i32, i32* @ii
  %x161 = add i32 %x160, 1
  %x162 = mul i32 %x161, 1
  %x163 = add i32 %x162, 0
  %x164 = getelementptr [10000 x i32], [10000 x i32]* @get2, i32 0, i32 %x163
  %x165 = load i32, i32* @c
  store i32 %x165, i32* %x164
  %x166 = load i32, i32* @ii
  %x167 = add i32 %x166, 2
  store i32 %x167, i32* @ii
  %x168 = call i32 @chapop()
  store i32 %x168, i32* @c
  br label %L27

L29:                                              ; preds = %L27
  br label %L26

L25:                                              ; preds = %L23
  br label %L26

L26:                                              ; preds = %L25, %L29
  %x169 = load i32, i32* @i
  %x170 = mul i32 %x169, 1
  %x171 = add i32 %x170, 0
  %x172 = getelementptr [10000 x i32], [10000 x i32]* @get, i32 0, i32 %x171
  %x173 = load i32, i32* %x172
  %x174 = icmp eq i32 %x173, 43
  br i1 %x174, label %L30, label %L31

L30:                                              ; preds = %L26
  br label %L33

L33:                                              ; preds = %L38, %L30
  %x175 = load i32, i32* @chat
  %x176 = mul i32 %x175, 1
  %x177 = add i32 %x176, 0
  %x178 = getelementptr [10000 x i32], [10000 x i32]* @chas, i32 0, i32 %x177
  %x179 = load i32, i32* %x178
  %x180 = icmp eq i32 %x179, 43
  %x181 = load i32, i32* @chat
  %x182 = mul i32 %x181, 1
  %x183 = add i32 %x182, 0
  %x184 = getelementptr [10000 x i32], [10000 x i32]* @chas, i32 0, i32 %x183
  %x185 = load i32, i32* %x184
  %x186 = icmp eq i32 %x185, 45
  %x187 = or i1 %x180, %x186
  %x188 = load i32, i32* @chat
  %x189 = mul i32 %x188, 1
  %x190 = add i32 %x189, 0
  %x191 = getelementptr [10000 x i32], [10000 x i32]* @chas, i32 0, i32 %x190
  %x192 = load i32, i32* %x191
  %x193 = icmp eq i32 %x192, 42
  %x194 = or i1 %x187, %x193
  %x195 = load i32, i32* @chat
  %x196 = mul i32 %x195, 1
  %x197 = add i32 %x196, 0
  %x198 = getelementptr [10000 x i32], [10000 x i32]* @chas, i32 0, i32 %x197
  %x199 = load i32, i32* %x198
  %x200 = icmp eq i32 %x199, 47
  %x201 = or i1 %x194, %x200
  %x202 = load i32, i32* @chat
  %x203 = mul i32 %x202, 1
  %x204 = add i32 %x203, 0
  %x205 = getelementptr [10000 x i32], [10000 x i32]* @chas, i32 0, i32 %x204
  %x206 = load i32, i32* %x205
  %x207 = icmp eq i32 %x206, 37
  %x208 = or i1 %x201, %x207
  %x209 = load i32, i32* @chat
  %x210 = mul i32 %x209, 1
  %x211 = add i32 %x210, 0
  %x212 = getelementptr [10000 x i32], [10000 x i32]* @chas, i32 0, i32 %x211
  %x213 = load i32, i32* %x212
  %x214 = icmp eq i32 %x213, 94
  %x215 = or i1 %x208, %x214
  br i1 %x215, label %L34, label %L35

L34:                                              ; preds = %L33
  %x216 = call i32 @find()
  %x217 = icmp eq i32 %x216, 0
  br i1 %x217, label %L36, label %L37

L36:                                              ; preds = %L34
  br label %L39

L39:                                              ; preds = %L36
  br label %L35

L40:                                              ; No predecessors!
  br label %L38

L37:                                              ; preds = %L34
  br label %L38

L38:                                              ; preds = %L37, %L40
  br label %L33

L35:                                              ; preds = %L39, %L33
  call void @chapush(i32 43)
  br label %L32

L31:                                              ; preds = %L26
  br label %L32

L32:                                              ; preds = %L31, %L35
  %x218 = load i32, i32* @i
  %x219 = mul i32 %x218, 1
  %x220 = add i32 %x219, 0
  %x221 = getelementptr [10000 x i32], [10000 x i32]* @get, i32 0, i32 %x220
  %x222 = load i32, i32* %x221
  %x223 = icmp eq i32 %x222, 45
  br i1 %x223, label %L41, label %L42

L41:                                              ; preds = %L32
  br label %L44

L44:                                              ; preds = %L49, %L41
  %x224 = load i32, i32* @chat
  %x225 = mul i32 %x224, 1
  %x226 = add i32 %x225, 0
  %x227 = getelementptr [10000 x i32], [10000 x i32]* @chas, i32 0, i32 %x226
  %x228 = load i32, i32* %x227
  %x229 = icmp eq i32 %x228, 43
  %x230 = load i32, i32* @chat
  %x231 = mul i32 %x230, 1
  %x232 = add i32 %x231, 0
  %x233 = getelementptr [10000 x i32], [10000 x i32]* @chas, i32 0, i32 %x232
  %x234 = load i32, i32* %x233
  %x235 = icmp eq i32 %x234, 45
  %x236 = or i1 %x229, %x235
  %x237 = load i32, i32* @chat
  %x238 = mul i32 %x237, 1
  %x239 = add i32 %x238, 0
  %x240 = getelementptr [10000 x i32], [10000 x i32]* @chas, i32 0, i32 %x239
  %x241 = load i32, i32* %x240
  %x242 = icmp eq i32 %x241, 42
  %x243 = or i1 %x236, %x242
  %x244 = load i32, i32* @chat
  %x245 = mul i32 %x244, 1
  %x246 = add i32 %x245, 0
  %x247 = getelementptr [10000 x i32], [10000 x i32]* @chas, i32 0, i32 %x246
  %x248 = load i32, i32* %x247
  %x249 = icmp eq i32 %x248, 47
  %x250 = or i1 %x243, %x249
  %x251 = load i32, i32* @chat
  %x252 = mul i32 %x251, 1
  %x253 = add i32 %x252, 0
  %x254 = getelementptr [10000 x i32], [10000 x i32]* @chas, i32 0, i32 %x253
  %x255 = load i32, i32* %x254
  %x256 = icmp eq i32 %x255, 37
  %x257 = or i1 %x250, %x256
  %x258 = load i32, i32* @chat
  %x259 = mul i32 %x258, 1
  %x260 = add i32 %x259, 0
  %x261 = getelementptr [10000 x i32], [10000 x i32]* @chas, i32 0, i32 %x260
  %x262 = load i32, i32* %x261
  %x263 = icmp eq i32 %x262, 94
  %x264 = or i1 %x257, %x263
  br i1 %x264, label %L45, label %L46

L45:                                              ; preds = %L44
  %x265 = call i32 @find()
  %x266 = icmp eq i32 %x265, 0
  br i1 %x266, label %L47, label %L48

L47:                                              ; preds = %L45
  br label %L50

L50:                                              ; preds = %L47
  br label %L46

L51:                                              ; No predecessors!
  br label %L49

L48:                                              ; preds = %L45
  br label %L49

L49:                                              ; preds = %L48, %L51
  br label %L44

L46:                                              ; preds = %L50, %L44
  call void @chapush(i32 45)
  br label %L43

L42:                                              ; preds = %L32
  br label %L43

L43:                                              ; preds = %L42, %L46
  %x267 = load i32, i32* @i
  %x268 = mul i32 %x267, 1
  %x269 = add i32 %x268, 0
  %x270 = getelementptr [10000 x i32], [10000 x i32]* @get, i32 0, i32 %x269
  %x271 = load i32, i32* %x270
  %x272 = icmp eq i32 %x271, 42
  br i1 %x272, label %L52, label %L53

L52:                                              ; preds = %L43
  br label %L55

L55:                                              ; preds = %L60, %L52
  %x273 = load i32, i32* @chat
  %x274 = mul i32 %x273, 1
  %x275 = add i32 %x274, 0
  %x276 = getelementptr [10000 x i32], [10000 x i32]* @chas, i32 0, i32 %x275
  %x277 = load i32, i32* %x276
  %x278 = icmp eq i32 %x277, 42
  %x279 = load i32, i32* @chat
  %x280 = mul i32 %x279, 1
  %x281 = add i32 %x280, 0
  %x282 = getelementptr [10000 x i32], [10000 x i32]* @chas, i32 0, i32 %x281
  %x283 = load i32, i32* %x282
  %x284 = icmp eq i32 %x283, 47
  %x285 = or i1 %x278, %x284
  %x286 = load i32, i32* @chat
  %x287 = mul i32 %x286, 1
  %x288 = add i32 %x287, 0
  %x289 = getelementptr [10000 x i32], [10000 x i32]* @chas, i32 0, i32 %x288
  %x290 = load i32, i32* %x289
  %x291 = icmp eq i32 %x290, 37
  %x292 = or i1 %x285, %x291
  %x293 = load i32, i32* @chat
  %x294 = mul i32 %x293, 1
  %x295 = add i32 %x294, 0
  %x296 = getelementptr [10000 x i32], [10000 x i32]* @chas, i32 0, i32 %x295
  %x297 = load i32, i32* %x296
  %x298 = icmp eq i32 %x297, 94
  %x299 = or i1 %x292, %x298
  br i1 %x299, label %L56, label %L57

L56:                                              ; preds = %L55
  %x300 = call i32 @find()
  %x301 = icmp eq i32 %x300, 0
  br i1 %x301, label %L58, label %L59

L58:                                              ; preds = %L56
  br label %L61

L61:                                              ; preds = %L58
  br label %L57

L62:                                              ; No predecessors!
  br label %L60

L59:                                              ; preds = %L56
  br label %L60

L60:                                              ; preds = %L59, %L62
  br label %L55

L57:                                              ; preds = %L61, %L55
  call void @chapush(i32 42)
  br label %L54

L53:                                              ; preds = %L43
  br label %L54

L54:                                              ; preds = %L53, %L57
  %x302 = load i32, i32* @i
  %x303 = mul i32 %x302, 1
  %x304 = add i32 %x303, 0
  %x305 = getelementptr [10000 x i32], [10000 x i32]* @get, i32 0, i32 %x304
  %x306 = load i32, i32* %x305
  %x307 = icmp eq i32 %x306, 47
  br i1 %x307, label %L63, label %L64

L63:                                              ; preds = %L54
  br label %L66

L66:                                              ; preds = %L71, %L63
  %x308 = load i32, i32* @chat
  %x309 = mul i32 %x308, 1
  %x310 = add i32 %x309, 0
  %x311 = getelementptr [10000 x i32], [10000 x i32]* @chas, i32 0, i32 %x310
  %x312 = load i32, i32* %x311
  %x313 = icmp eq i32 %x312, 42
  %x314 = load i32, i32* @chat
  %x315 = mul i32 %x314, 1
  %x316 = add i32 %x315, 0
  %x317 = getelementptr [10000 x i32], [10000 x i32]* @chas, i32 0, i32 %x316
  %x318 = load i32, i32* %x317
  %x319 = icmp eq i32 %x318, 47
  %x320 = or i1 %x313, %x319
  %x321 = load i32, i32* @chat
  %x322 = mul i32 %x321, 1
  %x323 = add i32 %x322, 0
  %x324 = getelementptr [10000 x i32], [10000 x i32]* @chas, i32 0, i32 %x323
  %x325 = load i32, i32* %x324
  %x326 = icmp eq i32 %x325, 37
  %x327 = or i1 %x320, %x326
  %x328 = load i32, i32* @chat
  %x329 = mul i32 %x328, 1
  %x330 = add i32 %x329, 0
  %x331 = getelementptr [10000 x i32], [10000 x i32]* @chas, i32 0, i32 %x330
  %x332 = load i32, i32* %x331
  %x333 = icmp eq i32 %x332, 94
  %x334 = or i1 %x327, %x333
  br i1 %x334, label %L67, label %L68

L67:                                              ; preds = %L66
  %x335 = call i32 @find()
  %x336 = icmp eq i32 %x335, 0
  br i1 %x336, label %L69, label %L70

L69:                                              ; preds = %L67
  br label %L72

L72:                                              ; preds = %L69
  br label %L68

L73:                                              ; No predecessors!
  br label %L71

L70:                                              ; preds = %L67
  br label %L71

L71:                                              ; preds = %L70, %L73
  br label %L66

L68:                                              ; preds = %L72, %L66
  call void @chapush(i32 47)
  br label %L65

L64:                                              ; preds = %L54
  br label %L65

L65:                                              ; preds = %L64, %L68
  %x337 = load i32, i32* @i
  %x338 = mul i32 %x337, 1
  %x339 = add i32 %x338, 0
  %x340 = getelementptr [10000 x i32], [10000 x i32]* @get, i32 0, i32 %x339
  %x341 = load i32, i32* %x340
  %x342 = icmp eq i32 %x341, 37
  br i1 %x342, label %L74, label %L75

L74:                                              ; preds = %L65
  br label %L77

L77:                                              ; preds = %L82, %L74
  %x343 = load i32, i32* @chat
  %x344 = mul i32 %x343, 1
  %x345 = add i32 %x344, 0
  %x346 = getelementptr [10000 x i32], [10000 x i32]* @chas, i32 0, i32 %x345
  %x347 = load i32, i32* %x346
  %x348 = icmp eq i32 %x347, 42
  %x349 = load i32, i32* @chat
  %x350 = mul i32 %x349, 1
  %x351 = add i32 %x350, 0
  %x352 = getelementptr [10000 x i32], [10000 x i32]* @chas, i32 0, i32 %x351
  %x353 = load i32, i32* %x352
  %x354 = icmp eq i32 %x353, 47
  %x355 = or i1 %x348, %x354
  %x356 = load i32, i32* @chat
  %x357 = mul i32 %x356, 1
  %x358 = add i32 %x357, 0
  %x359 = getelementptr [10000 x i32], [10000 x i32]* @chas, i32 0, i32 %x358
  %x360 = load i32, i32* %x359
  %x361 = icmp eq i32 %x360, 37
  %x362 = or i1 %x355, %x361
  %x363 = load i32, i32* @chat
  %x364 = mul i32 %x363, 1
  %x365 = add i32 %x364, 0
  %x366 = getelementptr [10000 x i32], [10000 x i32]* @chas, i32 0, i32 %x365
  %x367 = load i32, i32* %x366
  %x368 = icmp eq i32 %x367, 94
  %x369 = or i1 %x362, %x368
  br i1 %x369, label %L78, label %L79

L78:                                              ; preds = %L77
  %x370 = call i32 @find()
  %x371 = icmp eq i32 %x370, 0
  br i1 %x371, label %L80, label %L81

L80:                                              ; preds = %L78
  br label %L83

L83:                                              ; preds = %L80
  br label %L79

L84:                                              ; No predecessors!
  br label %L82

L81:                                              ; preds = %L78
  br label %L82

L82:                                              ; preds = %L81, %L84
  br label %L77

L79:                                              ; preds = %L83, %L77
  call void @chapush(i32 37)
  br label %L76

L75:                                              ; preds = %L65
  br label %L76

L76:                                              ; preds = %L75, %L79
  %x372 = load i32, i32* @ii
  %x373 = mul i32 %x372, 1
  %x374 = add i32 %x373, 0
  %x375 = getelementptr [10000 x i32], [10000 x i32]* @get2, i32 0, i32 %x374
  store i32 32, i32* %x375
  %x376 = load i32, i32* @ii
  %x377 = add i32 %x376, 1
  store i32 %x377, i32* @ii
  br label %L17

L17:                                              ; preds = %L76, %L15
  %x378 = load i32, i32* @i
  %x379 = add i32 %x378, 1
  store i32 %x379, i32* @i
  br label %L12

L14:                                              ; preds = %L12
  br label %L85

L85:                                              ; preds = %L86, %L14
  %x380 = load i32, i32* @chat
  %x381 = icmp sgt i32 %x380, 0
  br i1 %x381, label %L86, label %L87

L86:                                              ; preds = %L85
  %x382 = alloca i32
  %x383 = call i32 @chapop()
  store i32 %x383, i32* %x382
  %x384 = load i32, i32* @ii
  %x385 = mul i32 %x384, 1
  %x386 = add i32 %x385, 0
  %x387 = getelementptr [10000 x i32], [10000 x i32]* @get2, i32 0, i32 %x386
  store i32 32, i32* %x387
  %x388 = load i32, i32* @ii
  %x389 = add i32 %x388, 1
  %x390 = mul i32 %x389, 1
  %x391 = add i32 %x390, 0
  %x392 = getelementptr [10000 x i32], [10000 x i32]* @get2, i32 0, i32 %x391
  %x393 = load i32, i32* %x382
  store i32 %x393, i32* %x392
  %x394 = load i32, i32* @ii
  %x395 = add i32 %x394, 2
  store i32 %x395, i32* @ii
  br label %L85

L87:                                              ; preds = %L85
  %x396 = load i32, i32* @ii
  %x397 = mul i32 %x396, 1
  %x398 = add i32 %x397, 0
  %x399 = getelementptr [10000 x i32], [10000 x i32]* @get2, i32 0, i32 %x398
  store i32 64, i32* %x399
  store i32 1, i32* @i
  br label %L88

L88:                                              ; preds = %L93, %L87
  %x400 = load i32, i32* @i
  %x401 = mul i32 %x400, 1
  %x402 = add i32 %x401, 0
  %x403 = getelementptr [10000 x i32], [10000 x i32]* @get2, i32 0, i32 %x402
  %x404 = load i32, i32* %x403
  %x405 = icmp ne i32 %x404, 64
  br i1 %x405, label %L89, label %L90

L89:                                              ; preds = %L88
  %x406 = load i32, i32* @i
  %x407 = mul i32 %x406, 1
  %x408 = add i32 %x407, 0
  %x409 = getelementptr [10000 x i32], [10000 x i32]* @get2, i32 0, i32 %x408
  %x410 = load i32, i32* %x409
  %x411 = icmp eq i32 %x410, 43
  %x412 = load i32, i32* @i
  %x413 = mul i32 %x412, 1
  %x414 = add i32 %x413, 0
  %x415 = getelementptr [10000 x i32], [10000 x i32]* @get2, i32 0, i32 %x414
  %x416 = load i32, i32* %x415
  %x417 = icmp eq i32 %x416, 45
  %x418 = or i1 %x411, %x417
  %x419 = load i32, i32* @i
  %x420 = mul i32 %x419, 1
  %x421 = add i32 %x420, 0
  %x422 = getelementptr [10000 x i32], [10000 x i32]* @get2, i32 0, i32 %x421
  %x423 = load i32, i32* %x422
  %x424 = icmp eq i32 %x423, 42
  %x425 = or i1 %x418, %x424
  %x426 = load i32, i32* @i
  %x427 = mul i32 %x426, 1
  %x428 = add i32 %x427, 0
  %x429 = getelementptr [10000 x i32], [10000 x i32]* @get2, i32 0, i32 %x428
  %x430 = load i32, i32* %x429
  %x431 = icmp eq i32 %x430, 47
  %x432 = or i1 %x425, %x431
  %x433 = load i32, i32* @i
  %x434 = mul i32 %x433, 1
  %x435 = add i32 %x434, 0
  %x436 = getelementptr [10000 x i32], [10000 x i32]* @get2, i32 0, i32 %x435
  %x437 = load i32, i32* %x436
  %x438 = icmp eq i32 %x437, 37
  %x439 = or i1 %x432, %x438
  %x440 = load i32, i32* @i
  %x441 = mul i32 %x440, 1
  %x442 = add i32 %x441, 0
  %x443 = getelementptr [10000 x i32], [10000 x i32]* @get2, i32 0, i32 %x442
  %x444 = load i32, i32* %x443
  %x445 = icmp eq i32 %x444, 94
  %x446 = or i1 %x439, %x445
  br i1 %x446, label %L91, label %L92

L91:                                              ; preds = %L89
  %x447 = alloca i32
  %x448 = call i32 @intpop()
  store i32 %x448, i32* %x447
  %x449 = alloca i32
  %x450 = call i32 @intpop()
  store i32 %x450, i32* %x449
  %x451 = alloca i32
  %x452 = load i32, i32* @i
  %x453 = mul i32 %x452, 1
  %x454 = add i32 %x453, 0
  %x455 = getelementptr [10000 x i32], [10000 x i32]* @get2, i32 0, i32 %x454
  %x456 = load i32, i32* %x455
  %x457 = icmp eq i32 %x456, 43
  br i1 %x457, label %L94, label %L95

L94:                                              ; preds = %L91
  %x458 = load i32, i32* %x447
  %x459 = load i32, i32* %x449
  %x460 = add i32 %x458, %x459
  store i32 %x460, i32* %x451
  br label %L96

L95:                                              ; preds = %L91
  br label %L96

L96:                                              ; preds = %L95, %L94
  %x461 = load i32, i32* @i
  %x462 = mul i32 %x461, 1
  %x463 = add i32 %x462, 0
  %x464 = getelementptr [10000 x i32], [10000 x i32]* @get2, i32 0, i32 %x463
  %x465 = load i32, i32* %x464
  %x466 = icmp eq i32 %x465, 45
  br i1 %x466, label %L97, label %L98

L97:                                              ; preds = %L96
  %x467 = load i32, i32* %x449
  %x468 = load i32, i32* %x447
  %x469 = sub i32 %x467, %x468
  store i32 %x469, i32* %x451
  br label %L99

L98:                                              ; preds = %L96
  br label %L99

L99:                                              ; preds = %L98, %L97
  %x470 = load i32, i32* @i
  %x471 = mul i32 %x470, 1
  %x472 = add i32 %x471, 0
  %x473 = getelementptr [10000 x i32], [10000 x i32]* @get2, i32 0, i32 %x472
  %x474 = load i32, i32* %x473
  %x475 = icmp eq i32 %x474, 42
  br i1 %x475, label %L100, label %L101

L100:                                             ; preds = %L99
  %x476 = load i32, i32* %x447
  %x477 = load i32, i32* %x449
  %x478 = mul i32 %x476, %x477
  store i32 %x478, i32* %x451
  br label %L102

L101:                                             ; preds = %L99
  br label %L102

L102:                                             ; preds = %L101, %L100
  %x479 = load i32, i32* @i
  %x480 = mul i32 %x479, 1
  %x481 = add i32 %x480, 0
  %x482 = getelementptr [10000 x i32], [10000 x i32]* @get2, i32 0, i32 %x481
  %x483 = load i32, i32* %x482
  %x484 = icmp eq i32 %x483, 47
  br i1 %x484, label %L103, label %L104

L103:                                             ; preds = %L102
  %x485 = load i32, i32* %x449
  %x486 = load i32, i32* %x447
  %x487 = sdiv i32 %x485, %x486
  store i32 %x487, i32* %x451
  br label %L105

L104:                                             ; preds = %L102
  br label %L105

L105:                                             ; preds = %L104, %L103
  %x488 = load i32, i32* @i
  %x489 = mul i32 %x488, 1
  %x490 = add i32 %x489, 0
  %x491 = getelementptr [10000 x i32], [10000 x i32]* @get2, i32 0, i32 %x490
  %x492 = load i32, i32* %x491
  %x493 = icmp eq i32 %x492, 37
  br i1 %x493, label %L106, label %L107

L106:                                             ; preds = %L105
  %x494 = load i32, i32* %x449
  %x495 = load i32, i32* %x447
  %x496 = srem i32 %x494, %x495
  store i32 %x496, i32* %x451
  br label %L108

L107:                                             ; preds = %L105
  br label %L108

L108:                                             ; preds = %L107, %L106
  %x497 = load i32, i32* @i
  %x498 = mul i32 %x497, 1
  %x499 = add i32 %x498, 0
  %x500 = getelementptr [10000 x i32], [10000 x i32]* @get2, i32 0, i32 %x499
  %x501 = load i32, i32* %x500
  %x502 = icmp eq i32 %x501, 94
  br i1 %x502, label %L109, label %L110

L109:                                             ; preds = %L108
  %x503 = load i32, i32* %x449
  %x504 = load i32, i32* %x447
  %x505 = call i32 @power(i32 %x503, i32 %x504)
  store i32 %x505, i32* %x451
  br label %L111

L110:                                             ; preds = %L108
  br label %L111

L111:                                             ; preds = %L110, %L109
  %x506 = load i32, i32* %x451
  call void @intpush(i32 %x506)
  br label %L93

L92:                                              ; preds = %L89
  %x507 = load i32, i32* @i
  %x508 = mul i32 %x507, 1
  %x509 = add i32 %x508, 0
  %x510 = getelementptr [10000 x i32], [10000 x i32]* @get2, i32 0, i32 %x509
  %x511 = load i32, i32* %x510
  %x512 = icmp ne i32 %x511, 32
  br i1 %x512, label %L112, label %L113

L112:                                             ; preds = %L92
  %x513 = load i32, i32* @i
  %x514 = mul i32 %x513, 1
  %x515 = add i32 %x514, 0
  %x516 = getelementptr [10000 x i32], [10000 x i32]* @get2, i32 0, i32 %x515
  %x517 = load i32, i32* %x516
  %x518 = sub i32 %x517, 48
  call void @intpush(i32 %x518)
  store i32 1, i32* @ii
  br label %L115

L115:                                             ; preds = %L116, %L112
  %x519 = load i32, i32* @i
  %x520 = load i32, i32* @ii
  %x521 = add i32 %x519, %x520
  %x522 = mul i32 %x521, 1
  %x523 = add i32 %x522, 0
  %x524 = getelementptr [10000 x i32], [10000 x i32]* @get2, i32 0, i32 %x523
  %x525 = load i32, i32* %x524
  %x526 = icmp ne i32 %x525, 32
  br i1 %x526, label %L116, label %L117

L116:                                             ; preds = %L115
  %x527 = load i32, i32* @i
  %x528 = load i32, i32* @ii
  %x529 = add i32 %x527, %x528
  %x530 = mul i32 %x529, 1
  %x531 = add i32 %x530, 0
  %x532 = getelementptr [10000 x i32], [10000 x i32]* @get2, i32 0, i32 %x531
  %x533 = load i32, i32* %x532
  %x534 = sub i32 %x533, 48
  call void @intadd(i32 %x534)
  %x535 = load i32, i32* @ii
  %x536 = add i32 %x535, 1
  store i32 %x536, i32* @ii
  br label %L115

L117:                                             ; preds = %L115
  %x537 = load i32, i32* @i
  %x538 = load i32, i32* @ii
  %x539 = add i32 %x537, %x538
  %x540 = sub i32 %x539, 1
  store i32 %x540, i32* @i
  br label %L114

L113:                                             ; preds = %L92
  br label %L114

L114:                                             ; preds = %L113, %L117
  br label %L93

L93:                                              ; preds = %L114, %L111
  %x541 = load i32, i32* @i
  %x542 = add i32 %x541, 1
  store i32 %x542, i32* @i
  br label %L88

L90:                                              ; preds = %L88
  %x543 = mul i32 1, 1
  %x544 = add i32 %x543, 0
  %x545 = getelementptr [10000 x i32], [10000 x i32]* @ints, i32 0, i32 %x544
  %x546 = load i32, i32* %x545
  call void @putint(i32 %x546)
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
