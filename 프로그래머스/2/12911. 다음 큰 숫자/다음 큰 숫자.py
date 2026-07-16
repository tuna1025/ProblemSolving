def solution(n):
    answer = 0
    # n보다 큰 자연수를 전부 이진수로 바꿔서 1개수 새기?
    a = n
    s = ""
    n_one = 0
    # n이진수 변환
    while a>0:
            s += str(a%2)
            a //=2
    
    # n이진수의1개수 새기 
    for i in s:    
        if i == '1':
            n_one += 1 
            
    while True:
        n += 1
        a=n
        s = ""
        cnt_one = 0
        # 이진수 변환하고 1개수 새기
        while a>0:
            s += str(a%2)
            a //=2
        for i in s:    
            if i == '1':
                cnt_one += 1

        # 1의 개수가 같으면 출력
        if n_one == cnt_one:
            answer = n
            break
            
        
    return answer