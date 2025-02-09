def solution(brown, yellow):
    
    for x in range(1, yellow + 1):
        if yellow % x == 0:
            y = yellow // x 
            if x >= y :
                if (x + 2) * (y + 2) == brown + yellow:
                    return [x + 2, y + 2]