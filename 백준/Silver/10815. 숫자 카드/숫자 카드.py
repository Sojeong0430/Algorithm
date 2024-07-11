import sys
n=int(sys.stdin.readline())
nlist=list(map(int,sys.stdin.readline().split()))
m=int(sys.stdin.readline())
mlist=list(map(int,sys.stdin.readline().split()))

dic={}

for i in mlist:
    dic[i]=0
for c in nlist:
    if c in dic:
        dic[c]=1
for d in dic:
    print(dic[d],end=' ')