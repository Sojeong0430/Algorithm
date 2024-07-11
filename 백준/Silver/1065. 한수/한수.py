n=int(input())
cnt=0

for i in range(10,n+1):
    i = str(i)
    cha = int(i[1]) - int(i[0])
    for k in range(len(i)-1):
        if int(i[k+1])-int(i[k]) == cha :
            pass
        else:
            cnt+=1
if n == 1000:
    n+=1
print(n-cnt)