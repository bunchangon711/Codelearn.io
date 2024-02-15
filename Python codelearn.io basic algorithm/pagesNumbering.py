def pagesNumbering(n):
    count = 0
    pageDigitNum = [*str(n)]
    digitNum = len(pageDigitNum)
    count += ((n - 10**(digitNum-1))+1) * digitNum
    for i in range(1, digitNum):
        count += (((10**i-1) - (10**(i-1)))+1)*i
    return count

n = int(input())
print(pagesNumbering(n))

#Cheat solve if number is not large
'''
def pagesNumbering(n):
count = 0
for i in range (1, n + 1):
count += len(str(i))
return count
'''