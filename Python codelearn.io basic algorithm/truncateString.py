def truncateString(s):
    splitStr = [*s]
    while splitStr:
        if int(splitStr[0]) % 3 == 0:
            splitStr.pop(0)
        elif int(splitStr[-1]) % 3 == 0:
            splitStr.pop(-1)
        elif (int(splitStr[0]) + int(splitStr[-1])) % 3 == 0:
            splitStr.pop(0)
            splitStr.pop(-1)
        else:
            break
    s = "".join(str(i) for i in splitStr)
    return s

inputString = input()
print(truncateString(inputString))