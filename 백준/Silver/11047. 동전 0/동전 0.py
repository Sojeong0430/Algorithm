n,k=map(int,input().split())
coinlist=[]
for i in range(n):
    coinlist.append(int(input()))

cnt=0
for i in range(len(coinlist)-1,-1,-1):
    if k // coinlist[i] > 0 :
        cnt += k // coinlist[i]
        k %= coinlist[i]

print(cnt)