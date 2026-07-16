def solution(s):
    words = s.split(" ")
    for i,word in enumerate(words):
        words[i] = word[:1].upper() + word[1:].lower()
    
    return " ".join(words)