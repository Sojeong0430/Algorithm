list1=[list(map(int,input().split()))for _ in range(9)]
m = max(list1[0])
for i in range(9):
    if m <= max(list1[i]):
        m = max(list1[i])
        jul = i
        index = list1[i].index(m)
print(m)
print(jul+1,index+1)