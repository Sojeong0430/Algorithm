def solution(s):
    answer = list(map(int, s.split()))
    result = str(min(answer)) + ' ' + str(max(answer))
    return result