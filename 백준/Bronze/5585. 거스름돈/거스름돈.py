s = int(input())
money = 1000-s
cnt = 0

if money >= 500 :
    cnt += money // 500
    money %= 500

if money >= 100 :
    cnt += money // 100
    money %= 100

if money >= 50 :
    cnt += money // 50
    money %= 50

if money >= 10 :
    cnt += money // 10
    money %= 10

if money >= 5 :
    cnt += money // 5
    money %= 5

if money >= 1 :
    cnt += money // 1
    money %= 1

print(cnt)