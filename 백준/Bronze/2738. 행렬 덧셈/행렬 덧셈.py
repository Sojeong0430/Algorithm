n,m=map(int,input().split())
list11=[]
list22=[]

for i in range(n):
        list1=[]
        list1=list(map(int,input().split()))
        list11.append(list1)
for i in range(n):
        list2=[]
        list2=list(map(int,input().split()))
        list22.append(list2)
list4=[]
for i in range(n):
    list3=[]
    for k in range(m):
         sum = 0
         sum = list11[i][k]+list22[i][k]
         list3.append(sum)         
    list4.append(list3)

for i in range(n):
    for k in range(m):
        print(list4[i][k],end=" ")
    print("")