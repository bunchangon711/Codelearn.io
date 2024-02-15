def checkPalindrome(inputString):
    inputString = inputString.lower()
    reverseString = [*inputString]
    reverseString.reverse()
    reversed = "".join(reverseString)
    if inputString == reversed:
        return True
    else:
        return False

str = input()
print(checkPalindrome(str))