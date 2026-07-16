def solution(s):
    stack = []
    for i in s:
        if i == "(":
            stack.append("(")
        else:
            if i == ")":
                if len(stack) == 0:
                    return False
                stack.pop()
        
            
    if(len(stack) != 0):
        return False
    return True