numlist=[]
num=''

while True:
    num = input()
    if num == '0' :
        break
    numlist.append(num)

for i in numlist:
    newnum=''
    for k in range(len(i)-1,-1,-1):
        newnum += i[k]
    if newnum == i :
        print('yes')
    else:
        print('no')