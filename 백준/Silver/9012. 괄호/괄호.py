t = int(input())

for i in range(t):
    stack =[]
    status = 0
    s = input()

    for k in s:
        if k == '(':
            stack.append(k)
        else:
            try:
                stack.pop()
            except:
                status = 1
    
    if status == 0 and len(stack)==0 :
        print('YES')
    else :
        print('NO')