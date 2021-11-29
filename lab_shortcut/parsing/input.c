    int global_variable = 0;  // 全局变量

    int add() {
        global_variable = global_variable + 1;
        return global_variable;
    }

    int main() {
        while (1 == add() || 1 == 0) {
            putint(global_variable);
        } // 我们并不想 add() 函数被调用
        return global_variable;
    }