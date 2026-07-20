def choi(num1, num2):
    cnt = 1
    while True:
        if (num1*cnt) % num2 == 0:
            return num1 * cnt
        cnt += 1
    
        
        
        
def solution(arr):
    if len(arr) == 1:
        return arr[0]
    answer = choi(arr[0],arr[1])
    if len(arr) ==2:
        return answer
    for i in range(2, len(arr)):
        answer = choi(answer,arr[i])
    
    return answer