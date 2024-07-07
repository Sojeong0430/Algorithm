count = int(input())
list=[]
for _ in range (count):
    num = int(input())
    list.append(num)

while len(list)!=0:
    min = list[0]
    for i in range(len(list)):
        if min > list[i]:
            min = list[i]
    print(min)
    list.remove(min)