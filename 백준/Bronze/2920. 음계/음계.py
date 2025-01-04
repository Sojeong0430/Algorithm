import sys

play = list(map(int, sys.stdin.readline().split()))

start = play[0]
if (start == 1):
    for i in range(1, 9):
        if (i != play[i - 1]):
            print('mixed')
            break
        if (i == 8):    
            print('ascending')
elif (start == 8):
    for i in range(8, 0, -1):
        if (i != play[8 - i]):
            print('mixed')
            break
        if (i == 1):
            print('descending')
else:
    print('mixed')