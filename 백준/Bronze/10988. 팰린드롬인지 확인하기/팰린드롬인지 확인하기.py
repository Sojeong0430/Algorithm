ss = input()
k=''
for i in range(len(ss)-1,-1,-1):
    k+=ss[i]

if k == ss:
    print(1)
else:
    print(0) 