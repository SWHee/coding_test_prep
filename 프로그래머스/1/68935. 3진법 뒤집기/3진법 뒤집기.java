class Solution {
    public int solution(int n) {
        String three = Integer.toString(n, 3);
        String reverse = "";
        
        for(int i = three.length()-1; i >= 0; i--) {
            reverse += three.charAt(i);
        }
        
        int answer = Integer.parseInt(reverse, 3);
        
        return answer;
    }
}