import math

a,b,v = map(int,input().split())
date = (v-b)/(a-b)

print(math.ceil(date))