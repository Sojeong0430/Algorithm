n=int(input())

for j in range(n,0,-1):
    for i in range(n-j):
        print(" ",end="")
    for star in range(j):
        print("*",end="")
    print(" ")