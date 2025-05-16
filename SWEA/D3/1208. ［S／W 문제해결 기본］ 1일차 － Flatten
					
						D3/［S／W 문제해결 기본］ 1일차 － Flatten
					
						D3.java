import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
//       덤프 = 가장 높은 곳에 있는 상자를 가장 낮은 곳으로 옮기는 작업
//       덤프 횟수 1이상 1000 이하
//       최고점과 최저점의 차이도 매번 계산

        Scanner sc = new Scanner(System.in);

        for (int test_case = 1; test_case <= 10; test_case++) {
            int dumpCount = sc.nextInt();
            int[] height = new int[100];

            for (int i = 0; i < 100; i++) {
                height[i] = sc.nextInt();
            }

            for (int i = 0; i < dumpCount; i++) {
                int maxIdx = 0;
                int minIdx = 0;

                for (int j = 0; j < 100; j++){
                    if (height[j] > height[maxIdx]) {
                        maxIdx = j;
                    }
                    if (height[j] < height[minIdx]) {
                        minIdx = j;
                    }
                }

                if (height[maxIdx] - height[minIdx] <= 1) {
                    break;
                }

                // 실제 덤프
                height[maxIdx]--;
                height[minIdx]++;
            }

//          최고점과 최저점의 차이 계산
            int max = height[0];
            int min = height[0];
            for (int i = 1; i < 100; i++) {
                if (height[i] > max) {
                    max = height[i];
                }
                if (height[i] < min) {
                    min = height[i];
                }
            }

            System.out.println("#" + test_case + " " + (max - min));
        }
    }
}
