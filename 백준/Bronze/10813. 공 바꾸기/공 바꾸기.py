N, M = map(int, input().split())
 
b=[ball for ball in range(1,N+1)]

for _ in range(M):
    i,j=map(int,input().split())
    temp=b[i-1]
    b[i-1]=b[j-1]
    b[j-1]=temp

for i in range(N):
    print(b[i],end=" ")