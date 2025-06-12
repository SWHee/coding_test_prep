import java.util.*;

class Solution {
    public int solution(int[] citations) {
        // n편의 논문, h번 이상 인용, h편 이상이고 나머지는 h번 이하 인용 => h의 최댓값이 H-Index
        // 결국, 찾아야 하는 건 정렬된 배열의 중간지점 id
        // 길이가 홀수라면 len - 1 / 2, 짝수라면 n / 2
        
        int n = citations.length;
        int idx = 0;
        
        Arrays.sort(citations);
        
        for(int i = 0; i < n; i++) {
            int h = n - i;
            
            if(citations[i] >= h) return h;  
        }
        
        return 0;
    }
}