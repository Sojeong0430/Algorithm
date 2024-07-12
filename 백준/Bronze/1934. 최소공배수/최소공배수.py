import sys
import math

t = int(sys.stdin.readline())
numlist=[]

for _ in range(t):
    numlist.append(list(map(int,sys.stdin.readline().split())))

for i in numlist:
    a,b=i[0],i[1]
    gcd = math.gcd(a,b)
    result = abs(a*b)//gcd
    print(result)