def solution(A,B):
    A.sort()
    B.sort()
    sum = 0
    for i in range(len(A)):
        sum += A[i] * B[len(A)-1 - i]
    return sum