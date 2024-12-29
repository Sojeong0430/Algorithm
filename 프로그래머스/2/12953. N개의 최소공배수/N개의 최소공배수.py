def solution(arr):
    answer = 0
    num=1
    
    while True:
        status = 0
        answer = num*max(arr)
        for i in arr :
            if answer % i != 0 :
                status = 1
                num +=1
                break
        if status == 1:
            continue
        else:
            break
                
    return answer