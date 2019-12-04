def fact(n):
    res = 1
    i = 1
    while i <= n:
        res *= i
        i += 1
    return res

for i in range(6):
    print(str(fact(i)).center(8, '*'))
