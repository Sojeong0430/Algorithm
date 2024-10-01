n = int(input())
s=[0]*n

for i in range(0,n):
    k = int(input())
    s[i] = k
s.sort()

max = s[0]*n

for i in range (0,n):
    if s[i]*(n-i) >= max:
        max = s[i]*(n-i)

print(max)