n = int(input())
A = list(map(int,input().split()))

max = A[0]
min = A[0]

for i in range(n):
    if max < A[i]:
        max = A[i]
    if min > A[i]:
        min = A[i]

print("%d %d"%(min,max))