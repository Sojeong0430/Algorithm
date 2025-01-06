def solution(s):
    l = len(s)
    answer = 0
    stack = [s[0]]
    
    for i in range(1,l):
        if len(stack) == 0:
            stack.append(s[i])
        else:
            if s[i] == stack[-1]:
                stack.pop()
            else:
                stack.append(s[i])
            
    if len(stack) == 0 :
        answer = 1
        
    return answer