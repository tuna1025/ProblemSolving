def solution(progresses, speeds):
    answer = []
    
    # 리스트가 전부 빌때까지 실행
    while progresses:
        cnt = 0
        
        # 리스트가 비지 않고 맨 앞의 과정이 100보다 크면 배포수 +1
        while progresses and progresses[0] >= 100:
            cnt += 1
            progresses.pop(0)
            speeds.pop(0)
        
        # 배포가 됬다면
        if cnt > 0:
            answer.append(cnt) #하루동안 누적된 배포수 답에 더하기
        
        # 하루가 지났으니 speed만큼 전체에 누적
        for i in range(len(progresses)):
            progresses[i] += speeds[i]
        
        
    return answer