a = int(input())
b = int(input())

b1 = b % 10
b10 = b % 100 - b1
b100 = (b // 100) * 10

print(a*b1)
print(int((a*b10)/10))
print(int((a*b100)/10))
print(a*b)
