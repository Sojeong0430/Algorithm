from itertools import permutations

def solution(k, dungeons):
    result = []
    for perm in permutations(dungeons,len(dungeons)):
        max_answer = 0
        temp_k = k
        for min_fatigue, minus in perm:
            if min_fatigue <= temp_k :
                temp_k-=minus
                max_answer += 1
        result.append(max_answer)
    answer = max(result)
    return answer