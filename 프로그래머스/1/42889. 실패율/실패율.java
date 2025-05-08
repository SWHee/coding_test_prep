import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];

        HashMap<Integer, Double> failrate = new HashMap<>();

        // N개의 스테이지 실패율 계산
        for (int i = 1; i <= N; i++) {
            int thisStagePeople = 0;
            int successPeople = 0;

            for (int j = 0; j < stages.length; j++) {
                if (stages[j] >= i) { // 도달한 유저
                    successPeople++;
                    if (stages[j] == i) thisStagePeople++; // 아직 클리어 못한 유저
                }
            }

            if (successPeople == 0) {
                failrate.put(i, 0.0);
            } else {
                failrate.put(i, (double) thisStagePeople / successPeople);
            }
        }

        List<Map.Entry<Integer, Double>> list = new ArrayList<>(failrate.entrySet());

        list.sort((a, b) -> Double.compare(b.getValue(), a.getValue()));

        for (int i = 0; i < N; i++) {
            answer[i] = list.get(i).getKey();
        }
        
        return answer;
    }
}