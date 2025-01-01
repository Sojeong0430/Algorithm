n = int(input())
podo = [0]

for _ in range(n):
    podo.append(int(input()))

dp = [0] * (n+1)

if n >= 1:
    dp[1] = podo[1]
if n >= 2:
    dp[2] = podo[1] + podo[2]
if n >= 3:
    dp[3] = max(podo[1] + podo[2], podo[1] + podo[3], podo[2] + podo[3])
    
for i in range(4,n+1):
    dp[i] = max(dp[i-1],dp[i-3]+podo[i-1]+podo[i],dp[i-2]+podo[i])

print(dp[n])