def solution(seoul):
    
    for i in seoul:
        if i == "Kim":
            return("김서방은 "+str(seoul.index("Kim"))+"에 있다")