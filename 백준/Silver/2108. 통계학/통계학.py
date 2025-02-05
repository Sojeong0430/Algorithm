from collections import Counter
import sys

n = int(sys.stdin.readline().strip())
numList = sorted([int(sys.stdin.readline().strip()) for _ in range (n)])
result = []

result.append(round(sum(numList)/n)) 

result.append(numList[n//2]) 

count = Counter(numList)
maxFre = max(count.values())
modes = sorted([num for num, freq in count.items() if freq == maxFre])
result.append(modes[1] if len(modes) > 1 else modes[0])

result.append(abs(numList[len(numList)-1]-numList[0]))

for i in result:
    print(i)