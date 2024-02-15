def lineEncoding(s):
    lowerLimit = 0
    splitString = []
    ans = ""
    for i in range(1, len(s)):
        if s[i] != s[i-1]:
            splitString.append(s[lowerLimit:i])
            lowerLimit = i
        if i == len(s)-1:
            splitString.append(s[lowerLimit:i+1])
    for smallString in splitString:
        if smallString.count(smallString[0]) == 1:
            ans += smallString
        elif smallString.count(smallString[0]) > 1:
            ans += str(smallString.count(smallString[0]))
            ans += smallString[0]
    return ans
inputString = input()
print(lineEncoding(inputString))