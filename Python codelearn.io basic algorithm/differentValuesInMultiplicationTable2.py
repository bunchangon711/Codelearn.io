def differentValuesInMultiplicationTable2(n,m):
    table = []
    numCheck = []
    count = 0
    for i in range(0, n):
        row = []
        for j in range(0, m):
            row.append((i+1)*(j+1))
            if numCheck.count((i+1)*(j+1)) == 0:
                numCheck.append((i+1)*(j+1))
        table.append(row)
    print(table)
    print(numCheck)
    for i in range(0, len(numCheck)):
        count +=1
    return count

n = int(input())
m = int(input())
print(differentValuesInMultiplicationTable2(n, m))