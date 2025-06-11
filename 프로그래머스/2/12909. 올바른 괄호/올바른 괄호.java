import java.util.*;

class Solution {
    boolean solution(String s) {
        // 조건을 충족하기 위한 조건
        // 연속된 "("의 개수만큼 ")"이 나온 이후에 다른 "("가 나올 수 있다
        // 연속된 "("의 개수만큼 ")"이 나오지 않는다면 false 처리
        Stack<Character> st = new Stack<>();
        boolean answer = true;
        
        char[] words = s.toCharArray();
        for(int i = 0; i < s.length(); i++) {
            if(words[i] == '('){
                st.push(words[i]);
            } else if(words[i] == ')') {
                if(st.isEmpty()) return false;
                st.pop();
            }
        }
                      
        return st.isEmpty();
    }
}