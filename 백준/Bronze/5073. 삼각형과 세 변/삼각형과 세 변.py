while True:
    klist=[]
    a,b,c= map(int,input().split()) 
    klist.append(a)
    klist.append(b)
    klist.append(c)
    if list(set(klist))[0]==0:
        break
    if max(klist) >= sum(klist)-max(klist):
        print("Invalid")
    else:
        if len(set(klist))==1:
            print("Equilateral")
        elif len(set(klist))==2:
            print("Isosceles")
        elif len(set(klist))==3:
            print("Scalene")