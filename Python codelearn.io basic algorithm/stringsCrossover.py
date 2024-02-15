def stringsCrossover(inputArray,result):
    count = 0
    for i in range(0, len(inputArray)):
        for j in range(i+1, len(inputArray)):
            equalChar = 0
            for k in range(0, len(result)):
                if result[k] != inputArray[i][k] and result[k] != inputArray[j][k]:
                    break
                equalChar += 1
            if equalChar == len(result):
                count += 1
    return count

inputStrings = input().split()
result = input()
print(stringsCrossover(inputStrings, result))