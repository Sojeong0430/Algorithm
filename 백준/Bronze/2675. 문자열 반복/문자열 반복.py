t=int(input())

for _ in range(t):
    ss=''
    r,s=input().split()
    r = int(r)
    for i in range(len(s)):
        for _ in range(r):
            ss+=s[i]
    print(ss)