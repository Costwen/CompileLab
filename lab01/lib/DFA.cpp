#include "DFA.h"

std::map<std::set<char>, int> DFA::state() { return DFA::m_state; }

void DFA::setState(const std::map<std::set<char>, int> &state) { DFA::m_state = state; }

int DFA::index() { return DFA::m_index; }

void DFA::setIndex(int index) { DFA::m_index = index; }

int DFA::addIndex(int i) {
    m_index += i;
    return m_index;
}

std::map<int, std::map<char, int> > DFA::next() { return DFA::m_next; }

void DFA::setNext(const std::map<int, std::map<char, int> > &next) { DFA::m_next = next; }


bool DFA::isFinal(std::set<char> s) {
    for (auto ch: s){
        if (ch == 'Z'){
            return true;
        }
    }
    return false;
}

bool DFA::isFinal(int index) {
    std::set<char> s;
    for (auto iter: m_state){
        if (index == iter.second){
            s = iter.first;
            break;
        }
    }
    return isFinal(s);
}

bool DFA::dfa(char str[]) {
    int len = strlen(str);
    int cur_state = 1;
    for (int i = 0; i < len; i++){
        cur_state = dfa[cur_state][str[i]];
        if (!cur_state){
            return false;
        }
    }
    if (isFinal(cur_state)){
        return true;
    }
    return false;
}