def solution(clothes):
    s = {}
    # 옷 종류별로 더해주기
    for i in clothes:
        if i[1] in s:
            s[i[1]] +=1
        else:
            s[i[1]] = 1
        
    
    answer = 1
    
    # 안입은 경우까지 포함해서 곱해주기
    for i in s.values():
        answer *= (i+1)
    
    return answer - 1 # 전부 안입은 경우는 제외