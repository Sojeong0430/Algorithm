def solution(price, money, count):
    answer = 0
    sum = 0
    
    for i in range(1,count+1):
        sum = sum + (price*i)
        
    if (money - sum < 0):
        answer = sum - money
        
    return answer