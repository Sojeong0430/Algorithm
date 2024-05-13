n = int(input())
a=list(map(int,input().split()))
for i in range(len(a)):
    count=0
    if a[i]==1 or a[i]==0:
        n-=1
        pass
    for k in range(1,a[i]+1):
        if a[i] % k ==0:
            count+=1
    if count > 2 :
        n-=1
print(n)