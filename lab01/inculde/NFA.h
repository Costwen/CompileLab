#ifndef NFA_H
#define NFA_H
#include <iostream>
#include <set>
#include <cstring>
#include <map>
#include "DFA.h"
#include <queue>

class NFA
{
private:
    /* data */
    std::set<char> m_Vn; 
    std::set<char> m_Vt;
    int m_cnt;
    char head[10000], next[10000], to[10000], value[1000];

public:
    NFA(/* args */);
    ~NFA();
    void addState(char ch, char* str);
    void addEdge(char s, char t, char v);
    DFA* toDFA();
    std::set<char> getClosure(std::queue<ch> q);
};

#endif // NFA_H
