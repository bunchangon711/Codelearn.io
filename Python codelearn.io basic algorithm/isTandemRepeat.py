def isTandemRepeat(inputString):
    if len(inputString) % 2 != 0:
        return False
    first = inputString[:int(len(inputString)/2)]
    second = inputString[int(len(inputString)/2):]
    if first == second:
        return True
    else:
        return False

inputString = input()
print(isTandemRepeat(inputString))