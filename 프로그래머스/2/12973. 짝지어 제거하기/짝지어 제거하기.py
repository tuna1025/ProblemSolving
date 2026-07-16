def solution(s):
    """
    #슬라이드 윈도우 2칸씩 움직여서 같은부분만 자르고 붙이기
    n = 0
    while True:
        #종료 조건
        if s == "":
            return 1
        elif n >= len(s)-1:
            return 0
        # 같은 알파벳2개 지워서 문자열 붙이기
        if(len(s)>=2):
            if s[n] == s[n+1]:
                s = s[:n] + s[n+2:]
                n = 0
                continue # 다시 처음부터 검사

        n += 1 # 한칸이동
       """# 너무느린가
    # 1.단 스택에 집어넣어
    # 2.제 다음거랑 비교해서 같으면 pop해
    # 3. 다르면 append해
    # 4. 1~3반복
    stack = []
    for c in s:
        #스택에 원소가있고 top(알파벳 c 에 붙어있는 문자)가 같으면
        if stack and stack[-1] == c: 
            stack.pop()
        else:
            stack.append(c)
    
    if stack: 
        return 0
    else: 
        return 1
    
        
    
    
    