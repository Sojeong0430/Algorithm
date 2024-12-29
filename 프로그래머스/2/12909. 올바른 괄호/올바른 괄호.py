def solution(s):
    answer = True
    
    stack = []
    
    for i in s :
        if i == '(':
            stack.append(i)
        else:
            try:
                stack.pop()
            except:
                answer = False
                break
    if len(stack) != 0 :
        answer = False
    return answer
                
            
            