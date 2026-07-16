def solution(n):
    answer = 0
    
    for start in range(1, n+1):
        total = 0
        
        # 한칸씩 전진하면서 전체 탐색
        for i in range(start, n+1):
            total += i
            
            if total == n:
                answer += 1
                break
            elif total > n: # 넘으면 탈출
                break
            
    return answer