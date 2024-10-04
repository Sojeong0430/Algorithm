def re (n):
    k = 1
    if n == 0 :
        return 1
    else:
        while n > 0 :
            k = k*n
            n-=1
        return k 


n = int(input())
pec = re(n)
new_pec = str(pec)
cnt=0

for i in range(len(new_pec)-1,-1,-1):
    if new_pec[i] == '0' :
        cnt += 1
    else:
        break

print(cnt)