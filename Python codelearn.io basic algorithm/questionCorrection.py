def questionCorrection(s):
    s = s.replace("?", " ")
    s = s.lower()
    count = 0
    for i in range(0, len(s)):
        if s[i].isalnum():
            count = 0
        if s[i].isalnum() == False and count == 1:
            s = s[:i] + " " + s[i+1:]
        if s[i] == ",":
            count = 1
    for i in range(0, len(s)):
        if s[i].isalnum() == False and s[i] != ",":
            s = s.replace(s[i], " ", 1)
        if s[i] == "," and s[i-1].isalnum() != True:
            for j in range(i-1, 0, -1):
                if s[j].isalnum() != True:
                    s = s[:j] + s[j+1:]
                    s += " "
                else:
                    break
    for i in range(len(s)-1, 0, -1):
        if s[i].isalnum() and s[i-1] == ",":
            s = s[:i] + " " + s[i:]
    lst = s.split()
    answer = " ".join(lst)
    while answer[-1].isalnum() != True:
        answer = answer[:-1]
    answer = answer.replace(answer[0], answer[0].upper(), 1)
    answer += "?"
    return answer

inputString = input()
print(questionCorrection(inputString))