def solution(want, number, discount):
    
    answer = 0
    item = dict(zip(want, number)) # 원하는 아이템 목록
    window = {}
    #처음 10개 딕셔너리 만들기
    for i in range(10):
        if  discount[i] in window:
            window[discount[i]] += 1
        else:
            window[discount[i]] = 1
    
    #원하는것과 같으면 하루 추가
    if item == window:
            answer += 1
    
    # 한 칸씩 이동하며 전 물건 하나 빼고 후 물건 하나추가
    for i in range(1, len(discount) - 9):
        
        # 하나 빼기
        window[discount[i-1]] -= 1
        
        # 하나 더하기
        if discount[i+9] in window:
            window[discount[i+9]] += 1
        else:
            window[discount[i+9]] = 1
        
        # 0개 되면 키 삭제하기
        if window[discount[i-1]] == 0:
            del window[discount[i-1]]
        
        # 원하는 목록과 비교 
        if item == window:
            answer += 1
    
    return answer