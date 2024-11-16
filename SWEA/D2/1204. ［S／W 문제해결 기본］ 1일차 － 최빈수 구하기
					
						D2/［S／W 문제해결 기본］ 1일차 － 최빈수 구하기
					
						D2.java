import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int test_case = 1; test_case <= T; test_case++) {
            int testCase = sc.nextInt();
            int[] check = new int[101]; // 점수는 0부터 100까지이므로, 배열 크기는 101로 선언
            int mostMany = Integer.MIN_VALUE;  // 최빈수의 빈도
            int mostManyScore = Integer.MIN_VALUE;  // 최빈수의 점수
            
            // 점수 입력받기 및 빈도 계산
            for (int i = 0; i < 1000; i++) {
                int score = sc.nextInt();
                if (score < 0 || score > 100) {
                    System.out.println("점수는 0점 이상 100점 이하의 숫자만 입력 가능합니다.");
                } else {
                    check[score]++; // 점수에 해당하는 빈도 증가
                }
            }
            
            // 최빈수 계산: 빈도가 가장 높은 점수 찾기
            for (int i = 0; i <= 100; i++) {
                if (check[i] > mostMany) {
                    mostMany = check[i];
                    mostManyScore = i;
                } else if (check[i] == mostMany && i > mostManyScore) {
                    mostManyScore = i; // 빈도가 같으면 더 큰 점수를 선택
                }
            }
            
            // 결과 출력
            System.out.println("#" + testCase + " " + mostManyScore);
        }
        
        sc.close();
    }
}
