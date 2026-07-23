def solution(citations):
    n  = len(citations)
    # a번 인용된 논문 a개 이상이면 h임
    # 정렬하고 for문 돌리면 for문의 순서가 논문의 개수가 되고 리스트의 값을 비교하면? 되?지? 안?을까?
    citations.sort()
    for i in range(n):
        H = n - i # n - i = 자기보다 많이 인용된 논문의 개수
        if citations[i] >= H:
            return H
    return 0
