import java.util.*;
import java.util.Arrays;

class Solution {
    // 최대한 많은 부서 지원, 신청한 금액 그대로
    // 신청한 금액 배열 d(1~100), 예산 budget
    // 최대 몇 개의 부서에 물품 지원 가능한지 ?
    public int solution(int[] d, int budget) {
        int answer = 0;
        
        Arrays.sort(d);
        
        for(int i = 0; i < d.length; i++) {
            if(budget - d[i] >= 0) {
                budget -= d[i];
                answer++;
            }
        }
        
        return answer;
    }
}