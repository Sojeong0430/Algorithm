numlist = list(map(int,input().split()))
minnum = min(numlist)
nn = min(numlist)
    
while True:
    cnt=0
    for i in numlist:
        if nn%i==0:
            cnt+=1
    if cnt >= 3 :
        print(nn)
        break
    else:
        nn+=1