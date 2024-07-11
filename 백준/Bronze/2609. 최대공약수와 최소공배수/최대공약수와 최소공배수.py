number = list(map(int,input().split()))

for i in range(min(number),0,-1):
    if number[0]%i==0 and number[1]%i==0:
        print(i)
        break

g = max(number)
while True :
    if g % number[0] == 0 and g%number[1]==0:
        print(g)
        break
    g+=max(number)