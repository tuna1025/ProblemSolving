def solution(k, tangerine):
    answer = 0
    cnt = {}
    amount = 0
    
    # 크기 별로 딕셔너리에 추가
    for i in tangerine:
        if i in cnt:
            cnt[i] += 1
        else:
            cnt[i] = 1
    
    
    
    # 많은 순으로 종류 더해주기
    for i in sorted(cnt.items(), key = lambda x: x[1],reverse = True):
        amount += i[1]
        answer += 1
        if amount >= k:
            break
    
    
    return answer