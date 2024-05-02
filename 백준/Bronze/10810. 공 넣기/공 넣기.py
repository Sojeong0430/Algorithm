n,m=map(int,input().split())
ball=[]
for _ in range(n):
    ball.append(0)

for _ in range(m):
    i,j,k=map(int,input().split())
    for h in range(i-1,j):
        ball[h]=k

for i in range(n):
    print(ball[i],end=" ")