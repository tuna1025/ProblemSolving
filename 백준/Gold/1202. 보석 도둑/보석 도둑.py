import sys
import heapq

N, K = map(int, sys.stdin.readline().split())
jewels = []
for _ in range(N):
    heapq.heappush(jewels, list(map(int, sys.stdin.readline().split())))
bag_sizes = []
for _ in range(K):
    bag_sizes.append(int(sys.stdin.readline()))
bag_sizes.sort()

answer = 0
tmp_jew = []
for bag in bag_sizes:
    while jewels and bag >= jewels[0][0]:
        heapq.heappush(tmp_jew, -heapq.heappop(jewels)[1])
    if tmp_jew:
        answer -= heapq.heappop(tmp_jew)

print(answer)
