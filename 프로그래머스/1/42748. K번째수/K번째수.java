import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        // i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수
        // 배열에 담아 return
        int[] answer = new int[commands.length];
        
        for(int i = 0; i < commands.length; i++) {
            int[] newArray = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            Arrays.sort(newArray);
            answer[i] = newArray[commands[i][2] - 1];
        }
        
        return answer;
    }
}