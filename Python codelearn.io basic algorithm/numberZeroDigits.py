def numberZeroDigits(n):
    if n<0:
        return -1
    count = 0
    k = 5
    while k<=n:
        count += int(n/k)
        k*=5
    return count
    
n = int(input())
print(numberZeroDigits(n))