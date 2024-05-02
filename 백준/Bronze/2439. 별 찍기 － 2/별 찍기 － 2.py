n = int(input())

for jul in range(1,n+1):
    for g in range(n-jul):
        print(" ",end="")
    for star in range(jul):
        print("*",end="")
    print("")