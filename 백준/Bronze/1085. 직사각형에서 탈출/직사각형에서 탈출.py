x,y,w,h=map(int,input().split())
a=[]
x1 = w-x
y1 = h-y
a.append(x1)
a.append(y1)
a.append(x)
a.append(y)
print(min(a))