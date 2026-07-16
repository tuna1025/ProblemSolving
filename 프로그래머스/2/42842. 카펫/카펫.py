def solution(brown, yellow):
    answer = []
    # 갈색은 바깥 한 줄 노랑은 중간
    # 그럼 카펫 가로세로 길이는 노랑의 상하좌우 + 1, 노랑의 가로+2 세로+2
    # 출력은 [가로,세로]
    # 아 노랑은 어케구하냐 때려맞춰야하나 브루트포스?
    y_w = 0;
    y_h = 0;
    
    for i in range(1,yellow+1): # 노랑이 범위 탐색
        if yellow % i == 0:
            y_w = yellow/i
            y_h = i
            if y_w*2 + y_h*2 + 4 == brown:
                answer.append(y_w+2) # 갈색 포함 길이
                answer.append(y_h+2)
                break
    answer.sort() # 가로세로 구분
    answer.reverse()
    
    return answer