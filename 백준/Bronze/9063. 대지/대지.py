a=[]
b=[]
n = int(input())
for _ in range(n):
    x,y=map(int,input().split())
    a.append(x)
    b.append(y)
maxx=max(a)
minx=min(a)
maxy=max(b)
miny=min(b)

print((maxx-minx)*(maxy-miny))