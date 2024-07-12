import math
numlist = list(map(int,input().split()))
sum=0
for i in numlist:
    sum += pow(i,2)
print(sum%10)