ss=input()
ss=ss.lower()
cnt=[]
list = list(set(ss))
for i in range(len(list)):
    c=0
    c = ss.count(list[i])
    cnt.append(c)
m = max(cnt)
if cnt.count(m)!=1:
    print('?')
else:
    print(list[cnt.index(m)].upper())