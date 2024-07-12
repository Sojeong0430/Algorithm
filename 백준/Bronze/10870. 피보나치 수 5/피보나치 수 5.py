n=int(input())
numlist=[0,1]
for i in range (n-1):
    new = numlist[i]+numlist[i+1]
    numlist.append(new)
print(numlist[n])