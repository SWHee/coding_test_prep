import java.util.*;

class Solution {
    public int solution(int[] nums) {
        // n마리 중에서 n/2마리를 가져가도 좋다.
        // 최대한 다양한 종류를 가지기 원함*
        // 가장 많은 종류, 종류 번호의 개수 return
        // n/2와 nums에서 중복 제거 한 길이중에서 큰 수를 반환
        int answer = 0;
        
        Set<Integer> set = new HashSet<>();
        for(int num : nums) set.add(num);
        
        int n1 = nums.length/2;
        int n2 = set.size();
        
        return (n1 < n2) ? n1 : n2;
    }
}