# from operator import itemgetter
# def solution(strings, n):
#     answer = []
#     finalAnswer = []
#     for i in strings:
#         i =i[n]
#         answer.append(i)
#     answer.sort(key=itemgetter(1))
#     return answer


def solution(string, n):
    return sorted(strings, key=lambda a: (a[n],a))