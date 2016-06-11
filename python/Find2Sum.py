# coding=utf-8

numbers = [1, 3, 5, 3, 3, 2, 8, 2, 11, 15, 32, 23, 7, 5, 7, 0, -1, 16]
hashMap = {}
answers = []

for i in numbers:
    hashMap[i] = True

print(hashMap)

t = 15

for i in numbers:
    if t - i in hashMap:
        if i == t - i:
            continue
        if i < t - i:
            if (i, t - i) not in answers:
                answers.append((i, t - i))
        else:
            if (t - i, i) not in answers:
                answers.append((t - i, i))

# Решил еще отсортировать по первому аргументу
answers.sort()
print (answers)
