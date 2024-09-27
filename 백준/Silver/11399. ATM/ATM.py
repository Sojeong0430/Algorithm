n = int(input())
p = list(map(int,input().split()))
p.sort()

total = 0
wait = 0

for k in p :
    wait += k
    total += wait

print(total)