def digitsProduct(product):
    ans = ""
    if product == 1:
        return 1
    if product == 0:
        return 10
    for i in range (9, 1, -1):
        while product % i == 0:
            ans += str(i)
            product /= i
    lst = [*ans]
    lst.reverse()
    ans = "".join(lst)
    if ans == "":
        return -1
    return int(ans)

product = int(input())
print(digitsProduct(product))