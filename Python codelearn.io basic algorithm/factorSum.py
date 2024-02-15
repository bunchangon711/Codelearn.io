def factorSum(n):
    tmp = n
    a = 0
    divisor = 2
    count = 0
    while n != 1:
        if n == divisor and count == 0:
            return n
        while n % divisor == 0:
            a += divisor
            n /= divisor
            count += 1
        divisor +=1
    if tmp == a:
        return a
    return factorSum(a)

n = int(input())
print(factorSum(n))