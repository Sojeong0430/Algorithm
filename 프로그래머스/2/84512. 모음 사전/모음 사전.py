from itertools import product

def solution(word):
    answer = 0
    dict = [] 
    vowel = ['A', 'E', 'I', 'O', 'U']
    
    for i in range(1,6):
        for v in product(vowel,repeat=i):
            dict.append(''.join(v))
    dict.sort()
    answer = dict.index(word) + 1
    
    return answer