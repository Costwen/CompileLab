#Makefile
.PHONY: compile run all clean

input = input.c
output = main.ll

all: compile run clean

compile:
	javac -cp "./bin:./lib/antlr-4.9-complete.jar" -d "./bin" src/*.java
	java -Dfile.encoding=UTF-8 -cp "./bin:./lib/antlr-4.9-complete.jar" App $(input) $(output)

run:
	clang-10 -emit-llvm -S libsysy.c -o lib.ll
	llvm-link-10 main.ll lib.ll -S -o out.ll
	lli-10 out.ll
	@echo $?

clean:
	rm lib.ll
	rm main.ll