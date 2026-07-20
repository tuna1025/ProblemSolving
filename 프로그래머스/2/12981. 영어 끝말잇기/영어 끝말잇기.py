def solution(n, words):
    answer = []
    s = set()
    for i, word in enumerate(words):
            if i != 0: # 첫번째 단어가 아닐때
                if word[0] != words[i-1][-1] or word in s: # 현재 단어의 처음과 이전단어의마지막이 다르거나 단어가 중복될 때 
                    return [i%n + 1,i//n + 1] # 몇번째 사람의 몇번째 단어인지 반환
            s.add(word) # 단어 더하기

    return [0,0]