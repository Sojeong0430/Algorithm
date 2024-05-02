N = int(input())
score = list(map(int,input().split()))
sum = 0
for i in range(N):
    number = score[i]/max(score)*100
    sum += number

print(sum/N)