from collections import Counter 

t = int(input())
all =[]
for k in range(t):
    n = int(input())
    now = input()
    goal = input()
    list = ""
    count = 0

    for i in range (len(goal)) :
        if now[i]!= goal[i]:
            list += now[i]
    
    clist = Counter(list)

    if clist['W'] >= 1 and clist['B'] >= 1 :
        count += (min(clist['W'],clist['B']))
        count += (max(clist['W'],clist['B']))-count
    else:
        count = len(list)

    all.append(count)

for i in all :
    print(i)