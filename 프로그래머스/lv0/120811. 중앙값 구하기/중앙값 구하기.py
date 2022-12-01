def solution(array):
    array.sort()
    midNum = len(array) // 2
    return array[midNum]