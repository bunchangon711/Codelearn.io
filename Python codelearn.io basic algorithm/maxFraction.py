def maxFraction(numerators,denominators):
    ans = []
    for i in range(0, len(numerators)):
        ans.append(float(float(numerators[i])/float(denominators[i])))
    max = ans[0]
    index = 0
    for i in range(1, len(ans)):
        if ans[i] > max:
            max = ans[i]
            index = i
    return index

numerators = input().split()
denominators = input().split()
print(maxFraction(numerators, denominators))