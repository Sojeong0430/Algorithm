def solution(s):
    
    front =[]
    back =[]
    
    for i in s :
        if i.isupper() == True :
            back.append(i)
        else:
            front.append(i)
    front.sort(reverse=True)
    back.sort(reverse=True)
    
    result = ''
    
    for i in front :
        result += i
    for i in back :
        result += i
        
    return result