def solution(x):
    k = str(x)
    cnt=0
    for i in k :
        cnt += int(i)
    
    if x % cnt == 0:
        return True
    else:
        return False