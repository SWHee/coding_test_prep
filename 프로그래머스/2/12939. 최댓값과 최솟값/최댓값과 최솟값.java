class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        
        String[] str = s.split(" ");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        
        for(String item : str) {
            int cur = Integer.parseInt(item);
            
            if (cur > max) max = cur;
            if (cur < min) min = cur;
        }
        
        answer.append(min).append(" ").append(max);
        
        return answer.toString();
    }
}