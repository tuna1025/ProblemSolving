def solution(triangle):
    # 해당 층에서 좌우 중 큰거 더해서 올리기?[층][위치]
    floor = len(triangle) - 1
    while floor > 0:
        for i in range(floor):
            triangle[floor-1][i] += max(triangle[floor][i], triangle[floor][i+1]) # 윗층에 아랫층2개중에서 큰거 더해서 누적합
        floor -= 1 # 한층 올라가기
            
    return triangle[0][0]