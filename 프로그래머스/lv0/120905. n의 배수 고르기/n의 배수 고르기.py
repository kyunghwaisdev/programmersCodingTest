result = []
def solution(n, numlist):
    for i in numlist :
        if i % n == 0 :
            result.append(i)
    return result