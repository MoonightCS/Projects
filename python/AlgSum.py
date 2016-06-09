def recsum(i):
    if i > 0:
        return i + recsum(i - 1)
    return 0


def itersum(i, result):
    if i > 0:
        return itersum(i - 1, result + i)
    return result


print("Sum of first 100 numbers is: %d" % recsum(100))
print("Sum of first 100 numbers is: %d" % itersum(100, 0))
