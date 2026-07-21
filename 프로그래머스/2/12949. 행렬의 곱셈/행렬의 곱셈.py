def solution(arr1, arr2):
    answer = [[0]*len(arr2[0]) for _ in range(len(arr1))] # 열*행 리스트 컴프리헨션?  근본없네 
    
    # 행렬곱 아 배운지 오래되서 기억이 안나네
    # A의 열과 B의 행을 곱해서 만드는거였나
    # A의 첫째행 * B의 각각의 열
    # answer의 크기 = A의 행 B의 열
    
    for i in range(len(arr1)): # arr1의 행
        for j in range(len(arr2[0])): # arr2의 열
            for k in range(len(arr1[0])): #arr1의 행 or arr2의 열 개수 만큼 반복
                answer[i][j] += arr1[i][k]*arr2[k][j]
                

            
    return answer