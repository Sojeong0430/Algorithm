def solution(array, commands):
    answer = []
    
    for i in commands :
        narray = array[i[0]-1:i[1]]
        narray.sort()
        answer.append(narray[i[2]-1])
    
    return answer