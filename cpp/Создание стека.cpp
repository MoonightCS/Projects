#include <iostream>
using namespace std;
#define const 10

// создание стека
class stack {
    
    char stck[const];
    int tos;
    
public:
    
    stack();
    void push(char ch);
    char pop();
};
// конструктор
stack::stack()
{
    tos = 0;
}

void stack::push(char ch)
{
    if (tos == const)
    {
        cout << "Стек полон";
        return;
    }
    stck[tos] = ch;
    tos++;
}

char stack::pop()
{
    if (tos == 0)
    {
        cout << "Стек пуст";
        return 0;
    }
    tos--;
    return(stck[tos]);
}

int main()
{
    stack s1, s2;
    int i;
    
    s1.push('a');
    s2.push('x');
    s1.push('b');
    s2.push('y');
    s1.push('c');
    s2.push('z');
    
    for (i = 0; i < 3; i++)
        cout << "символ из s1:" << s1.pop() <<"\n";
    for (i = 0; i < 3; i++)
        cout << "символ из s2:" << s2.pop() <<"\n";
    return 0;
    
}
