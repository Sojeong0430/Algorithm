alist=[]
for _ in range(3):
    angle = int(input())
    alist.append(angle)
if sum(alist)!=180:
    print('Error')
else:
    if len(set(alist))==1:
        print("Equilateral")
    elif len(set(alist))==2:
        print("Isosceles")
    elif len(set(alist))==3:
        print("Scalene")