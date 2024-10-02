n,m=map(int,input().split())
jul_set = []
jul_one = []
cost=0

for i in range(m):
    six,one=map(int,input().split())
    jul_set.append(six)
    jul_one.append(one)

jul_set.sort()
jul_one.sort()

k = n // 6
n_sub = n%6

cost1 = k*jul_set[0] + n_sub*jul_one[0] #세트 + 낱개
cost2 = (k+1)*jul_set[0] #세트로만
cost3 = n*jul_one[0] #낱개로만

cost = min(cost1,cost2,cost3)

print(cost)