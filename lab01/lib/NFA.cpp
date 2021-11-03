#include "NFA.h"


void NFA::addState(char ch, char* str) {
    if (m_Vn.find(ch) != m_Vn.end()){
        m_Vn.insert(ch);  // 添加新的Vn状态
    }
    if (m_Vt.find(str[0]) != m_Vt.end()){
        m_Vt.insert(str[0]); // 添加新的Vt状态
    }
    if (strlen(str) == 2){ 
        addEdge(ch, str[1], str[0]);
    }
    else {
        addEdge(ch, 'Z', str[0]);
    }
}

void NFA::addEdge(char s, char t, char v) {
    next[++m_cnt] = head[int(s)];
    head[int(s)] = m_cnt;
    to[m_cnt] = v;
    value[m_cnt] = v;
}

DAF* NFA::toDFA() {
    DFA* dfa = new DFA();
    auto closure = getClosure(std::queue<char> ('S'));
    DFA::state()[closure] = DFA::addIndex();
    
    std::queue<std::set<char> > q;
    q.push(closure);
    while (!q.empty()){
        auto A = q.front();
        q.pop();
        std::map<char, std::set<char>> closures;
        for (auto iter = A.begin(); iter != A.end(); iter++){
            for (int i = head[int(*iter)]; i ; i =next[i]){
                    auto closure = closures[value[i]]; // 当前值的闭包
                    if (closure.find(to[i]) != closure.end()){
                        closure.insert(to[i]);
                    }
                }
        }
        for (auto iter =  closures.begin(); iter != closures.end(); iter++){
            auto closure = getClosure(iter->second);
            if (dfa.state().find(closure) != dfa.state().end()){
                dfa.state()[closure] = dfa.addIndex();
                q.push(closure);
            }
            dfa.next()[dfa.state()[A]][iter->first] = dfa->state()[closure];
        }
    }
    return dfa;
}

std::set<char>& NFA::getClosure(std::queue<char> q) {
    std::set<char> s;
    while(!q.empty()){
        char ch = q.front();
        s.insert(ch);
        q.pop();
        for (int i = head[int(ch)]; i ; i = next[i]){
            if (value[i] == '~'){
                if (s.find(to[i]) != s.end()){
                    q.push(to[i]);
                }
            }
        }
    }
    return s;
}
