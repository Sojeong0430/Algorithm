list=[]
testcase = int(input())

for _ in range (testcase):
    list.append(input())

for i in list:
    sum=0
    cnt=1
    for k in i:
        if k =='O':
            sum+=cnt
            cnt+=1
        else:
            cnt=1
    print(sum)