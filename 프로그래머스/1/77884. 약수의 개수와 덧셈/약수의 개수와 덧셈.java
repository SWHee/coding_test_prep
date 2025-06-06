class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        // 1. 약수의 개수가 짝수인 수는 더하고
        // 2. 약수의 개수가 홀수인 수는 뺀 수
    
        for(int i=left; i<=right; i++) {
            int divisorCount = 0;        
            
            for(int j=1; j<=i; j++) {
                if(i % j == 0) divisorCount++;
            }
            
            if(divisorCount % 2 == 0) answer += i;
            if(divisorCount % 2 != 0) answer -= i;
        }
        
        return answer;
    }
}