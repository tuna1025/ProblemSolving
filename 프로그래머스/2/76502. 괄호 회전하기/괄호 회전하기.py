def solution(s):
    answer = 0
    # 괄호검사? 스택 회전은 슬라이싱인데 (){}[]일 때 [5:] + [:5] = ](){}[
    # x -> 0~x-1 [x:] + [:x]
    pair = {"]":"[",
           "}":"{",
           ")":"("}
    
    
    # 회전
    for x in range(len(s)):
        stack = []
        flag = True
        
        # 괄호검사
        for i in s[x:] + s[:x]:
            
            if i in "([{": # 여는 괄호면 스택에 추가
                stack.append(i)
            else: # 닫는 괄호면 스택이 비어있지않고 탑이 닫는괄호랑 같으면 pop
                if stack and stack[-1] == pair[i]:
                    stack.pop()
                else: # 닫는 괄호때 비어있거나 들어있는것과 맞지않으면 다음 회전 
                    flag = False
                    break
                    
            
        if not stack and flag:
            answer +=1
            
    return answer