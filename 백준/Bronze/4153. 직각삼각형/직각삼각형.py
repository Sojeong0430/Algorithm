slist=[]
while True:
    newlist=[]
    newlist=list(map(int,input().split()))
    if newlist[1]==0:
        break
    else:
        newlist.sort()
        slist.append(newlist)
for i in slist:
    if i[0]**2 + i[1]**2 == i[2]**2:
        print('right')
    else:
        print('wrong')