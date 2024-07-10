n = int(input())
Alist=list(map(int,input().split()))
Blist=list(map(int,input().split()))

Alist.sort()
sum = 0
k=0
while k<len(Alist):
    Bmax = Blist[0]
    for i in range(len(Blist)):
        if Bmax < Blist[i]:
            Bmax = Blist[i]
    sum += Bmax * Alist[k]
    Blist.remove(Bmax)
    k+=1

print(sum)

