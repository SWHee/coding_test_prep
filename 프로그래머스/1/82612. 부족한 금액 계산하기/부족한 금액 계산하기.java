class Solution {
    // 이용로 price원, N번째 이용 시 price * N
    // 놀이기구 탄 횟수 count번 타고 원래 본인 돈에서 부족한 부분
    // 부족하지 않으면(양수) 0을 return
    public long solution(int price, int money, int count) {
        long answer = -1;
        long totalPrice = 0;
        
        for(long i = price; i <= price * count; i += price) {
            totalPrice += i;    
        }
        
        if((money - totalPrice) > 0) answer = 0;
        else answer = Math.abs(money - totalPrice);
        
        return answer;
    }
}