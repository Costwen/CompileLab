#ifndef DFA_H
#define DFA_H
#include <iostream>
#include <set>
#include <vector>
#include <queue>
#include <map>
#include <cstdlib>
#include <cstring>
class DFA
{
private:
    /* data */
    std::map<std::set<char>, int> m_state;
    int m_index;
    std::map<int, std::map<char, int> > m_next; 
public:
    DFA(/* args */);
    ~DFA();

    std::map<std::set<char>, int> state();
    void setState(const std::map<std::set<char>, int> &state);

    int index();
    void setIndex(int index);
    int addIndex(int i=1);

    std::map<int, std::map<char, int> > next();
    void setNext(const std::map<int, std::map<char, int> > &next);
    bool isFinal(int index);
    bool isFinal(std::set<char> s);
    bool dfa();
};



#endif // DFA_H
