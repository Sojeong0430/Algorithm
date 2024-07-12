import sys
import math

t = int(sys.stdin.readline())
numlist=[]

for _ in range(t):
    numlist.append(list(map(int,sys.stdin.readline().split())))

for i in numlist:
    print(math.lcm(i[0],i[1]))