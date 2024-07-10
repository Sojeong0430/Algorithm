n = int(input())
memberlist=[]
order=0
for i in range(n):
    order+=1
    age,name=input().split()
    memberlist.append([int(age),name,order])
memberlist.sort(key = lambda x : (x[2]) )
memberlist.sort(key = lambda x : (x[0]) )
for i in memberlist:
    print("%d %s"%(i[0],i[1]))