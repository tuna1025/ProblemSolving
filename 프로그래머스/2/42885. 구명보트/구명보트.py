def solution(people, limit):
    answer = 0
    left = 0
    right = len(people)-1
    # 그리디? 일단 정렬해
    people.sort(reverse = True)
    
    # 젤 무거운사람 고르고 제한에 안걸릴때까지 다음으로 무거운사람 고르기 없으면 혼자 ㄱㄱ
    while left<=right:
                
        # 위치 찾은후 리스트에서 제거 반복문 순회하는 도중 지우게 되면 인덱스가 꼬일 수 있음
        # 삭제 로직을 넣게 되면 시간초과됨 아마 삭제하고 다시 앞으로 땡겨질때가 문제인듯
        # 생각해보니 제일 무거운사람 + 제일 가벼운사람 했을때 못타면 혼자밖에 안되는구나
        if people[left] + people[right] <= limit:
            left += 1
            right -= 1
            answer += 1
        else:
            left += 1
            answer += 1
    
    return answer