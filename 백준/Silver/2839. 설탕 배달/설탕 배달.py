n = int(input())
p=0
while n > 0 :
    if n % 5 == 0:
        p += n//5
        break
    else:
        n -= 3
        p += 1
if n < -1:
    print(-1)
else:
    print(p)