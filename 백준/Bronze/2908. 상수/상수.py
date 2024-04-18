num1,num2=input().split()

nnum1=""
nnum2=""

for i in range(2,-1,-1):
    nnum1 = nnum1+ num1[i]
for i in range(2,-1,-1):
    nnum2 = nnum2+ num2[i]

if int(nnum1)>int(nnum2):
    print(nnum1)
else:
    print(nnum2)