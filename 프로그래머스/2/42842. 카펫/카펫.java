class Solution {
    public int[] solution(int brown, int yellow) {
        // 노란색과 갈색으로 색칠된 격자의 개수는 기억했지만, 전체 카펫의 크기는 기억하지 못함
        // 갈색 격자 수 brown, 노란색 격자 수 yellow
        // 카펫의 가로, 세로 크기를 배열에 담아 return
        // 가로길이 >= 세로길이
        
        // 1st. (brown+yellow) = n * k 를 만족하는 모든 쌍 찾는다
        // 12 = (1,12), (2,6), (3,4)
        // * 사각형이 되려면, 최소 가로 >=세로에서 세로는 3이상이여야 테두리를 감쌀 수 있음
        // 48 = (3,16), (4,12), (6,8)
        // ㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇ    ㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇ
        // ㅇㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅇ    ㅇㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅇ
        // ㅇㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅇ    ㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇ    
        // ㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇ
            
        // 2nd. b=24, y=24에서 나온 쌍의 (3-2,14-2) = (1,12),
        // 1*12 = yellow 개수를 만족해야함.
        
        int[] answer = new int[2];
        int row = 0;
        int col = 0;

        for(int i = 3; i < (brown + yellow) / 2; i++) {
            if((brown + yellow) % i == 0) {
                col = i;
                row = (brown + yellow) / i;
                
                if((col - 2) * (row - 2) == yellow) {
                    answer[0] = row;
                    answer[1] = col;
                    break;
                }
            }
        }
        
        return answer;
    }
}