m=int(input())
n=int(input())
a=[]
sum=0
for i in range(m,n+1):
    count=0
    for k in range(1,i+1):
        if i % k == 0 :
            count+=1
    if count == 2:
        a.append(i)
        sum+=i
if sum == 0:
    print(-1)
else:
    print(sum)
    print(min(a))