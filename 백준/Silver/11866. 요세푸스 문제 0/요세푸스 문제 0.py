n,k=map(int,input().split())
queue = list(range(1,n+1))
answer = []
index = 0

while queue:
    index = (index + k - 1) % len(queue) 
    answer.append(queue.pop(index))

result = '<'
for i in answer:
    if i != answer[len(answer)-1]:
        result += str(i) + ',' + ' '
    else:
        result += str(i) + '>'
print(result)