def solution(n,a,b):
    answer = 0

    # 대진표를 통합해서 숫자가 같아지면 만나는 느낌?
    # 1 2 3 4 5 6 7 8  시작전
    #  1   2   3   4    1
    #    1       2      2
    #        1          3
    while a!=b:
        a = a//2 + a%2
        b = b//2 + b%2
        answer +=1

    return answer