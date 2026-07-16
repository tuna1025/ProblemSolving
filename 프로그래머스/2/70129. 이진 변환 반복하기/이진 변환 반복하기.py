def solution(s):
    zero = 0 # 빼버린 0의 총 개수
    cnt = 0 #변환횟수
    
    while s != '1':
        zero_cnt = 0
        # 0 제거 횟수
        for i in s:
            if i == '0':
                zero_cnt += 1
        
        zero += zero_cnt # 총 0의 개수 누적합
        num = len(s) - zero_cnt # 0제거후 길이
        s = "" #문자열 초기화
        # 십진수 -> 이진수
        while num > 0:
            s +=str(num%2)
            num = num//2
        
        s = s[::-1] #이진수 뒤집기
        cnt += 1
        
        
    result =[cnt, zero]
    return result