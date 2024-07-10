n = int(input())
coorlist=list(map(int,input().split()))
arr=sorted(set(coorlist))
dic={arr[i]:i for i in range(len(arr))}
for i in coorlist:
    print(dic[i],end=" ")