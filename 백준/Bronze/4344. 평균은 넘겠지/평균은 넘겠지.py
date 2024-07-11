stulist=[]
n=int(input())
avelist=[]
for i in range(n):
    newlist=list(map(int,input().split()))
    stulist.append(newlist)

for i in stulist :
    sum = 0
    for k in range(1,len(i)) :
        sum += i[k]
    ave = round(sum/i[0],10)
    avelist.append(ave)

cnt=0
for i in stulist :
    avemem=float(0)
    for k in range(1,len(i)):
        if i[k] > avelist[cnt] :
            avemem+=1
    averate = round(avemem / float(i[0])*100,3)
    print(averate,"%")
    cnt+=1