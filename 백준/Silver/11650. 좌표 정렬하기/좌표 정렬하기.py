cordinate=[]
n = int(input())
for i in range(n):
    x,y = map(int,input().split())
    cordinate.append([x,y])
cordinate.sort(key=lambda x : (x[0],x[1]))
for i in cordinate:
    print(i[0],i[1])