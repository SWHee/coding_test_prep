class Solution {
    boolean solution(String s) {
        // 조건을 충족하기 위한 조건
        // 연속된 "("의 개수만큼 ")"이 나온 이후에 다른 "("가 나올 수 있다
        // 연속된 "("의 개수만큼 ")"이 나오지 않는다면 false 처리
        boolean answer = true;
        
        String[] words = s.split("");
        
        int seqLeft = 0;
        int seqRight = 0;
        
        for(int i = 0; i < words.length; i++) {
            // ')'이 바로 나올경우 무조건 false 이므로 시간 절약
            if(words[0].equals(")")) return false;
            
            if(words[i].equals("(")) {
                seqLeft++;
            } else if(words[i].equals(")")) {
                seqRight++;
            }
            
            if(seqRight > seqLeft) {
                answer = false;
                break;
            }
        }
        if(seqLeft != seqRight) answer = false;

        return answer;
    }
}