while True:
    n = int(input())
    if n == -1:
        break
    a=[]
    ss=''
    sum = 0
    k=0
    for i in range(1,n):
        if n % i ==0:
            a.append(i)
            sum+=i
    if sum == n :
        for i in range(len(a)+len(a)-1):
            if i %2 == 0:
                ss=ss+str(a[k])+" "
                k+=1
            else :
                ss=ss+"+"+" "
        print(n,"=",ss)
    else:
        print("%d is NOT perfect."%n)