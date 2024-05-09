list1=[]
list2=[]
for i in range(5):
    ss=input()
    list1.append(ss)
    list2.append(len(ss))
ml = max(list2)
for i in range(ml):
    for k in range(5):
        if len(list1[k]) < i+1 :
            continue
        else: 
            print(list1[k][i],end="")