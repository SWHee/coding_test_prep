import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        // 1번 ->12345 2번 -> 21232425 3번 -> 3311224455
        // 동점자 있으면 오름차순 return
        int[] supo1 = {1,2,3,4,5};
        int[] supo2 = {2,1,2,3,2,4,2,5};
        int[] supo3 = {3,3,1,1,2,2,4,4,5,5};
        
        int supo1Correct = 0;
        int supo2Correct = 0;
        int supo3Correct = 0;
        
        for(int i = 0; i < answers.length; i++) {
            if(answers[i] == supo1[i % supo1.length]) supo1Correct++;
            if(answers[i] == supo2[i % supo2.length]) supo2Correct++;
            if(answers[i] == supo3[i % supo3.length]) supo3Correct++;
        }
        
        List<Integer> result = new ArrayList<>();
        int max = Math.max(supo1Correct, Math.max(supo2Correct, supo3Correct));

        if (supo1Correct == max) result.add(1);
        if (supo2Correct == max) result.add(2);
        if (supo3Correct == max) result.add(3);

        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        
        return answer;
    }
}