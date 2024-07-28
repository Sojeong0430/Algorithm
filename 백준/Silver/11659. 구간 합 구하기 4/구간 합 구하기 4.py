import sys

input = sys.stdin.readline
n,m=map(int,input().split())
num=list(map(int,input().split()))
section_sum=[] 

for i in range(len(num)):
    if i == 0 :
        section_sum.append(num[i])
    else:
        section_sum.append(section_sum[-1]+num[i])

for _ in range(m):
    i, j = map(int,sys.stdin.readline().split())
    if i == 1:
        print(section_sum[j-1])
    else:
        print(section_sum[j-1]-section_sum[i-2])