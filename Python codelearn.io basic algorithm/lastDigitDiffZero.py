def lastDigitDiffZero(n):
    ans = 1
    for i in range(1, n+1):
        ans *= i
    numCut = str(ans)
    count = 1
    while numCut[-count] == "0":
        count += 1
    return int(numCut[-count])

n = int(input())
print(lastDigitDiffZero(n))