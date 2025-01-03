n, k = map(int, input().split())
man = list(range(1, n + 1))

answer = []
index = 0 

while man:
    index = (index + k - 1) % len(man)
    answer.append(man[index])
    man.pop(index)

result = '<' + ', '.join(map(str, answer)) + '>'
print(result)
