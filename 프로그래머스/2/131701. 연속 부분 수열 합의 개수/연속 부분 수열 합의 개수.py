def solution(elements):
    answer = 0
    n = len(elements) # 최대 원소 개수
    circle = elements + elements
    s = set() # 부분합 중복제거용
    total = 0
    
    for length in range(1,n+1): # 윈도우 크기
        total = sum(circle[:length])
        s.add(total) # 처음 윈도우 총합 추가
        
        # 윈도우 이동 과정
        for start in range(1,n): #  윈도우 시작 위치
            total -= circle[start-1] #기존 값 빼기
            total += circle[length + start-1] # 새로운값 더하기
            s.add(total)
    
    answer = len(s)        
        
    return answer