import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        // 한번에 최대 2명, 무게제한, 최대한 적은 구명보트 사용
        // 2명 이상이라면 합이 limit에 최대한 가깝게, 1명이라도 limit에 최대한 가깝게 채워나간다.
        // 오름차순 정렬 후 맨 끝쪽 빼가면서 limit 초과하는지 검사
        // 카운트 올라가면 그 곳은 0 으로 바꾸고 값이 0 인 곳은 검사에서 제외
        
        int answer = 0;
        int left = 0;
        int right = people.length - 1;
        
        Arrays.sort(people);
        
        while(left <= right) {
            // int loopLimit = limit;
            
            if(people[left] + people[right] <= limit) {
                left++; 
            }
            right--;
            answer++; 
        }
        
        
        
        return answer;
    }
}