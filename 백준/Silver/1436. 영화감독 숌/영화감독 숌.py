n = int(input())
num = 0
while True:
    num += 1
    strnum = str(num)
    if '666' in strnum:
        n -= 1
        if n == 0 :
            print(num)
            break