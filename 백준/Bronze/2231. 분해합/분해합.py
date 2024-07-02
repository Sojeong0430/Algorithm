def sum_of_numbers(i):
    sum = 0
    while i > 0:
        sum += i%10
        i = i//10
    return sum

def get_m(n):
    for i in range(n):
        if n == i + sum_of_numbers(i):
            return i
    return 0

n = int(input())
print(get_m(n))