lst = []
for i in range(150):
    lst.append(1)
def sieve(a):
    for i in range(2,a):
        if lst[i] == 1 and i*i < a:
            j = i
            while j*i <= a:
                lst[i*j] = 0
                j += 1

def greatestCommonPrimeDivisor(a,b):
    sieve(min(a,b))
    for i in range(min(a,b), 2, -1):
        if lst[i] == 1 and a % i == 0 and b % i ==0:
            return(i)
    return -1

a = int(input())
b = int(input())
print(greatestCommonPrimeDivisor(a,b))