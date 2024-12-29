def solution(n):
    answer = n
    
    bin_n = str(bin(n)[2:])
    c = bin_n.count('1')
    
    while True :
        answer += 1
        bin_a = str(bin(answer)[2:])
        if bin_a.count('1') == c :
            break
        
    return answer