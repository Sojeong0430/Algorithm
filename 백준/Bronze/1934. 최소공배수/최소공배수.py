import sys
t = int(sys.stdin.readline())
numlist=[]

for _ in range(t):
    numlist.append(list(map(int,sys.stdin.readline().split())))

for i in numlist:
    k = max(i)
    gon = k
    while True:
        if gon % min(i) == 0 :
            print(gon)
            break
        else:
            gon += k