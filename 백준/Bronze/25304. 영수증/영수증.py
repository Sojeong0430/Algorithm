x = int(input())
n = int(input())
list1=[]
list2=[]

for i in range(n):
    a,b=map(int,input().split())
    list1.append(a)
    list1.append(b)
    list2.append(list1)
    list1=[]
sum = 0
for i in range(n):
    sum += list2[i][0]*list2[i][1]

if sum == x :
    print('Yes')
else:
    print('No')