#include <iostream>
#include <fstream>
#include "DFA.h"
#include "NFA.h"

int main()
{
    std::ifstream input;
    input.open("文法.txt");
    char ch;
    char str[100];
    NFA* nfa = new NFA();
    while (input>>ch>>str){
        nfa->addState(ch, str);
    }
    DFA* dfa = nfa->toDFA();
    return 0;
}