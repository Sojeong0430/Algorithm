N = int(input())
num = 1
time = 0

while True :
    if N<num:
        num=1

    N = N - num
    time += 1
    num += 1

    if N==0:
        break

print(time)