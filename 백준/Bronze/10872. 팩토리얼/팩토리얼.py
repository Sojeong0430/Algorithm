def factorial(num) :
    if num == 0:
        return 1
    elif num <= 0 :
        return num
    else :
        return num * factorial(num-1)

N = int(input())
result = factorial(N)

print(result)