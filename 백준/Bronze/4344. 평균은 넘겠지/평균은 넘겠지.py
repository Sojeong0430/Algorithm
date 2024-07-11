num = int(input())
stulist=[]

for _ in range(num):
    scores = list(map(int,input().split()))
    avg = sum(scores[1:]) / scores[0]

    cnt=0
    for i in range(1,len(scores)):
        if scores[i] > avg :
            cnt+=1
    stulist.append(round(cnt/scores[0]*100,3))

for i in stulist:
    print(i,"%")
