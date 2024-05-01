n = int(input())

if n == 4:
    print("long int")
else :
    s = n // 4
    for i in range (s):
        print('long'+" ",end="")
    print('int')