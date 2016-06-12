# coding=utf-8
# Дано целое число integer. Необходимо вывести всемозомжные 'balanced' комбинации
# скобок (Сбалансированные комбинации скобок)
# Количество скобок лежит в первом параметре при первом вызове функции parantesis

def parantesis(open, closed, answer):
    if open == 0 and closed == 0:
        print("%s" % answer)
    if open > 0:
        parantesis(open - 1, closed + 1, answer + "(")
    if closed > 0:
        parantesis(open, closed - 1, answer + ")")

parantesis(4, 0, "")
