def checkStrongPassword(password):
    if len(password) < 6:
        return False
    passwordSplit = [*password]
    existNum = 0
    existLower = 0
    existUpper = 0
    existSpecial = 0
    for i in range(0, len(passwordSplit)):
        if str(passwordSplit[i]).isnumeric():
            existNum = 1
        if str(passwordSplit[i]).islower():
            existLower = 1
        if str(passwordSplit[i]).isupper():
            existUpper = 1
        if not str(passwordSplit[i]).isalnum():
            existSpecial =1
    if existNum == 1 and existLower == 1 and existUpper == 1 and existSpecial == 1:
        return True
    else:
        return False

password = input()
print(checkStrongPassword(password))