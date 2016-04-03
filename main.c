
#include <stdio.h>
#include <stdlib.h>
#include <string.h>


int ERRRRRROR;
struct monomial
{
    long long p, sgn;
    long long pow;
    struct monomial *next;
};

typedef struct monomial monomial;

struct monomial a[70000];
monomial* begin, *q, *l;
char s[10000];

void insertstr(monomial *add)
{

    if (begin == NULL)
    {
        begin = add;

        return;
    }

    monomial *p = begin;
    if (add->pow > begin->pow)
    {
        add->next = begin;
        begin = add;
        return;
    }

    if (add->pow == begin->pow)
    {
        int r = add->sgn*add->p + begin->sgn*begin->p;
        begin->p = abs(r);
        begin->sgn = r > 0 ? 1 : -1;//////dddd
        return;
    }

    while ((p->next != NULL) && (add->pow > p->next->pow))
    {
        p = p->next;
    }

    if (p->next == NULL)
    {
        add->next = NULL;
        p->next = add;
    }
    else
    {
        if (add->pow == p->next->pow)
        {
            int r = add->sgn*add->p + p->sgn*p->p;
            p->p = abs(r);
            p->sgn = r >= 0 ? 1 : -1;
            return;
        }
        add->next = p->next->next;
        p->next = add;
    }
    return;

}

monomial *get_monomial(char *x)
{
    monomial *tmp = malloc(sizeof(monomial));

    tmp->p = 0;
    tmp->next = NULL;
    tmp->pow = 0;
    tmp->sgn = 1;

    if (x[0] == '\n')
        return tmp;

    unsigned long len = strlen(x);
    int pos = 0;

    if (x[0] == '-')
    {
        tmp->sgn = -1;
        pos++;
    }
    if (x[0] == '+')
    {
        tmp->sgn = 1;
        pos++;
    }

    long long ms = 0;
    int fl = 0;
    while (x[pos] >= '0' && x[pos] <= '9')
    {
        fl = 1;
        ms = ms * 10 + (x[pos] - '0');
        pos++;
    }
    if (ms == 0 && !fl)
        ms = 1;
    tmp->p = ms;

    if (pos >= len)
    {
        return tmp;
    }


    if (x[pos] !=  'x')
    {
        ERRRRRROR = 1;
        return tmp;
    }
    pos++;
    tmp->pow = 1;

    if (x[pos] == '^')
    {
        ms = 0;
        pos++;
        fl = 0;
        while (x[pos] >= '0' && x[pos] <= '9')
        {
            fl = 1;
            ms = ms * 10 + x[pos] - '0';
            pos++;
        }
        if (ms == 0 && !fl)
            ms = 1;
        tmp->pow = ms;

    }

    if (x[pos] != '\0')
    {

        ERRRRRROR = 1;
    }
    return tmp;
}


int main(void)
{
    //monomial *q, *l;

    int n = 0, p = 0;
    int c = 0;


    for (int i = 0; i < 70000; i++)
    {
        a[i].p = 0;

        a[i].pow = 0;
        a[i].sgn = 0;
    }


    //begin = malloc(sizeof(monomial));
    //q = begin;
    //q->next = NULL;

    while ((c = getchar()) != EOF)
    {
        if ((c == '-' || c == '+') && p != 0)
        {

            s[p] = '\0';
            q = get_monomial(s);
            insertstr(q);
            if (ERRRRRROR == 1)
            {
                printf("Ошибка");
                return 1;
            }
            n++;
            p = 0;
        }
        if (c != ' ')
        {
            s[p] = c;
            p++;
        }
    }

    s[p] = '\0';
    if (p > 0)
    {

        q = get_monomial(s);
        insertstr(q);
               if (ERRRRRROR == 1)
        {
            printf("Ошибка");
            return 1;
        }

        n++;
    }
    if (n == 0)
        return 0;
    //printf("%d %d %d\n", begin->p, begin->pow, begin->sgn);
    q = begin;

    int fl = 0;
    //printf("%lld %lld %lld\n", begin->p, begin->pow, begin->sgn);
    printf("\n");
    while(q != NULL)
    {
        if (q->p == 0)
        {
            q=q->next;
            continue;
        }

        if (q->sgn > 0 && fl)
            printf("+");
        else
            if (q->sgn < 0 && fl)
                printf("-");
            else
                if (q->sgn < 0)
                    printf("-");
        fl = 1;
        if (q->p > 1)
            printf("%lld", q->p);


        if (q->pow != 0)
            printf("%c", 'x');

        if (q->pow > 1)
            printf("^%lld", q->pow);
        //printf(" ");
         q = q->next;
    }
    if (fl == 0)
        printf("0");


    printf("\n");

    return 0;
}
