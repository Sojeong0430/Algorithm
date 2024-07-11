fn = input()

if len(fn) == 1:
    fn = '0' + fn

n=fn
cnt = 0
while True :
    new=0
    for i in n:
        new += int(i)
    n = n[1]+(str(new))[len(str(new))-1]
    cnt+=1
    if n == fn :
        break

print(cnt)