def primeSum(n):
    n = sieve(n)
    return n

def sieve(n):
    check = []
    for i in range(0, n+1):
        check.append(2)
    sumSieve = 0
    for i in range(2, n+1):
        count = i
        if check[i] != 0:
            check[i] = 1
            while i*count <= n:
                check[i*count] = 0
                count += 1
    for i in range(2, n+1):
        if check[i] == 1:
            sumSieve += i
    return sumSieve

n = int(input())
print(primeSum(n))