def solution(n, left, right):
    '''
    # 0,0을 기준으로 오른쪽(x,x+1) 아래(x+1,x), 대각선(x+1,x+1)진행 할때마다 + 1
    # 1 2 3   1,1 1,2 1,3
    # 2 2 3   2,1 2,2 2,3
    # 3 3 3   3,1 3,2 3,3
    # 행과 열중 더 큰거 고르는게 편할 듯
    
    arr=[]
    
    # 조건에 맞는 2차원 배열 생성
    for i in range(n):
        row = [] # 2차원 배열을 위한 리스트 초기화
        for j in range(n):
            row.append(max(i,j)+1) # 행과 열 중에서 더 큰숫자로 
        arr.append(row)
    answer = []
    
    # left부터 right까지 탐색
    while left <= right:
        answer.append(arr[left // n][left % n]) # 순서 기준으로 나눠서 인덱싱
        left += 1
            ''' # 시간 초과 left~right자리의 수만 골라야하나
    answer = []
    
    for i in range(left, right+1):
        x = i // n 
        y = i % n
        
        answer.append(max(x,y)+1)
    
    return answer