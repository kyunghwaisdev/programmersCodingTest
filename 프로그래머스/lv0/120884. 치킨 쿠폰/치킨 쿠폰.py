def solution(chicken):
    answer = 0
    while chicken >= 10 :
        serviceCoupon = chicken//10
        remainCoupon = chicken%10
        answer += serviceCoupon
        chicken = serviceCoupon + remainCoupon
    return answer