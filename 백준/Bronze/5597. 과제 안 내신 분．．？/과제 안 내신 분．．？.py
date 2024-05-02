stu = []
for _ in range(28):
    num = int(input())
    stu.append(num)

all = [a for a in range(1,31)]

for i in range(28):
    all.remove(stu[i])

print(min(all))
print(max(all))