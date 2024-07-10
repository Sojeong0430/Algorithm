cordinate=[]
n = int(input())
for i in range(n):
    x,y = map(int,input().split())
    cordinate.append([y,x])
cordinate.sort()
for i in cordinate:
    print(i[1],i[0])