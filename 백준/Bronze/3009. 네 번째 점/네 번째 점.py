a=[]
b=[]
for _ in range(3):
    x,y=map(int,input().split())
    a.append(x)
    b.append(y)
a_1 = list(set(a))
b_1 = list(set(b))
for i in range(len(a_1)):
    if a.count(a_1[i]) == 1:
        x = a_1[i] 
for i in range(len(b_1)):
    if b.count(b_1[i]) == 1:
        y = b_1[i] 
print("%d %d"%(x,y))