def solution(n):
    answer = 1
    
    for i in range(1,n):
        list=[]
        for k in range(n):
            if sum(list) < n :
                list.append(i+k)
            else:
                break
        if sum(list) == n :
            answer += 1
        
    return answer