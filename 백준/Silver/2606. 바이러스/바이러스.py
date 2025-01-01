com = int(input())
ss = int(input())
rel = []
for i in range(ss):
    rel.append(list(map(int,input().split())))

dp = [0] * (com+1)

def virus(n):
    if dp[n] == 1:
        return 0

    dp[n] = 1
    count = 0

    for i in rel:
        if i[0] == n and dp[i[1]] == 0:  
            count += virus(i[1])
        elif i[1] == n and dp[i[0]] == 0:  
            count += virus(i[0])
            
    return count + 1

result = virus(1) - 1
print(result)