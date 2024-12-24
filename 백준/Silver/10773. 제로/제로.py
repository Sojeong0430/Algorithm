k = int(input())
num=[]

for i in range (k):
    k = int(input())
    if k == 0 :
        num.pop()
    else:
        num.append(k)

print(sum(num))
