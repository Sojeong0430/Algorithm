m = int(input())

list=[1,0,0]
cha = 0
for i in range (0,m):
    x,y=map(int,input().split())
    x=x-1
    y=y-1
    cha = list[y]
    list[y]=list[x]
    list[x]=cha

for i in range(3):
    if list[i]==1:
        print(i+1)
