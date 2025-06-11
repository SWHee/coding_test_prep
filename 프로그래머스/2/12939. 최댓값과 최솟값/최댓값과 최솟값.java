import java.util.*;

class Solution {
    public String solution(String s) {
        int max = Integer.MIN_VALUE; 
        int min = Integer.MAX_VALUE;
        
        String[] nums = s.split(" ");
        
        for(int i = 0; i < nums.length; i++) {
            if (max < Integer.parseInt(nums[i])) max = Integer.parseInt(nums[i]);
            if (min > Integer.parseInt(nums[i])) min = Integer.parseInt(nums[i]);
        }
        
        StringBuilder answer = new StringBuilder();
        answer.append(Integer.toString(min)).append(" ").append(Integer.toString(max));
        
        return answer.toString();
    }
}