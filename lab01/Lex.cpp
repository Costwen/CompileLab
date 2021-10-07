#include <iostream>
#include <string>
#include <fstream>
#include <ctime>
using namespace std;
char input[100000];
int ptr;
double start, t_end;
void checkTime()
{
    t_end = clock();
    if((t_end-start)/CLOCKS_PER_SEC > 3){
        exit(0);
    }
}
string reserver(string s){
    if (s == "if"){
        return "If";
    }
    if (s == "else"){
        return "Else";
    }
    if (s == "while"){
        return "While";
    }
    if (s == "continue"){
        return "Continue";
    }
    if (s == "return"){
        return "Return";
    }
    if (s == "break"){
        return "Break";
    }
    return "";
};

bool isSpace(char ch){
    return ch == ' ';
};

bool isNewLine(char ch){
    return ch == '\n';
};

bool isTab(char ch){
    return ch == '\t';
}

bool isMult(char ch){
    return ch == '*';
}

bool isDigit(char ch){
    return ch >= '0' && ch <= '9';
};

bool isLetter(char ch){
    return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
};

bool isSemi(char ch){
    return ch == ';';
};

bool isPlus(char ch){
    return ch == '+';
};

bool isMinus(char ch){
    return ch == '-';
};

bool isLpar(char ch){
    return ch == '(';
};

bool isRpar(char ch){
    return ch == ')';
};

bool isRBrace(char ch){
    return ch == '}';
}

bool isLBrace(char ch){
    return ch == '{';
}

bool isEqu(char ch){
    return ch == '=';
};

bool isDiv(char ch){
    return ch == '/';
};

bool isGt(char ch){
    return ch == '>';
};

bool isLt(char ch){
    return ch == '<';
};

bool isUnderLine(char ch){
    return ch == '_';
}

string getsym(ifstream& file)
{
    string answer;
    char ch;
    file.get(ch);

    string buf = "";
    while (isSpace(ch)||isNewLine(ch)||isTab(ch)){
        file.get(ch);
        checkTime();
    }
    if (isLetter(ch) || isUnderLine(ch)){ 
        while(isLetter(ch)||isDigit(ch)|| isUnderLine(ch)){
            buf += ch;
            file.get(ch);
            checkTime();
        }
        file.seekg(-1, ios::cur);
        auto type = reserver(buf);
        if (type != ""){
            answer = type;
        }
        else{
            answer = "Ident(" + buf + ")";
        }
    }
    else if (isDigit(ch)){
        while (isDigit(ch)){
            buf += ch;
            file.get(ch);
            checkTime();
        }
        file.seekg(-1, ios::cur);
        answer = "Number(" + buf + ")";
    }
    else if (isEqu(ch)){
        file.get(ch);
        if (isEqu(ch)){
            answer = "Eq";
        }
        else{
            file.seekg(-1, ios::cur);
            answer = "Assign";
        }
    }
    else if (isPlus(ch)){
        answer = "Plus";
    }
    else if (isLpar(ch)){
        answer = "LPar";
    }
    else if (isRpar(ch)){
        answer = "RPar";
    }
    else if (isLBrace(ch)){
        answer = "LBrace";
    }
    else if (isRBrace(ch)){
        answer = "RBrace";
    }
    else if (isMult(ch)){
        answer = "Mult";
    }
    else if (isDiv(ch)){
        answer = "Div";
    }
    else if (isLt(ch)){
        answer = "Lt";
    }
    else if (isGt(ch)){
        answer = "Gt";
    }
    else if (isSemi(ch)){
        answer = "Semicolon";
    }
    else{
        if (ch == '\0'){
            return "";
        }
        answer = "Err";
    }
    return answer;
}
int main(int argc, char* argv[])
{
    std::ios::sync_with_stdio(false);
    ifstream file(argv[1]);
    file >> noskipws;
    start = clock();
    string answer;

    while ((answer = getsym(file)) != "" && file.is_open()){
        cout << answer <<"\n";
        if (answer == "Err"){
            break;
        }
        checkTime();
    }
    return 0;
}