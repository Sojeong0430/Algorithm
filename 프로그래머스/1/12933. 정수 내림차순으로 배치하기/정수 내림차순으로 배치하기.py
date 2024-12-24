def solution(n):
    answer = []
    n = str(n)
    for i in n:
        answer.append(int(i))
    answer.sort(reverse=True)
    result = ''
    for i in answer:
        result += str(i)
    result = int(result)
    return result