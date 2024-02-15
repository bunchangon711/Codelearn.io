def commonCharacterCount(s1,s2):
    count = 0
    countList = []
    for i in range(0, len(s2)):
        countList.append(0)
    for i in range(0, len(s1)):
        for j in range(0, len(s2)):
            if s1[i] == s2[j] and countList[j] != 1:
                countList[j] = 1
                count +=1
                print(countList)
                break
    return count

s1 = input()
s2 = input()
print(commonCharacterCount(s1, s2))