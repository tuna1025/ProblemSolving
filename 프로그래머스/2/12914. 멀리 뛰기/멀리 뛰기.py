def solution(n):
    answer = 0
    # n = 2일때 2
    # n = 3일때 1,1,1, 1,2  2,1 = 3가지
    # n = 4일때 5
    # n = 5일때 11111 2111*4 221*3 = 8
    # 피보나치?
    fib1 = 1
    fib2 = 2
    fib3 = 0
    if n==1: 
        return 1
    elif n==2:
        return 2
    
    for i in range(2,n):
        fib3 = fib1 + fib2
        fib1 = fib2
        fib2 = fib3
    
    return fib3 % 1234567