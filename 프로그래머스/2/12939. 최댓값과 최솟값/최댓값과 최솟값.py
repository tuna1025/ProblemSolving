import sys

def solution(s):
    min = sys.maxsize
    max = -sys.maxsize - 1
    for i in s.split():
        if int(i) > max:
            max = int(i)
        if int(i) < min:
            min = int(i)
    return str(min)+" "+str(max)