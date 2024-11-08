import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();  // 테스트 케이스의 개수
        sc.nextLine();  // 줄바꿈 문자 처리

        for (int test_case = 1; test_case <= T; test_case++) {
            // 사각형 크기 N과 파리채 크기 M 입력 받기
            String[] input = sc.nextLine().split(" ");
            int N = Integer.parseInt(input[0]);  // 배열의 크기 N
            int M = Integer.parseInt(input[1]);  // 파리채의 크기 M

            // N x N 배열에 파리 수 입력 받기
            int[][] flySquare = new int[N][N];
            for (int i = 0; i < N; i++) {
                String[] row = sc.nextLine().split(" ");
                for (int j = 0; j < N; j++) {
                    flySquare[i][j] = Integer.parseInt(row[j]);
                }
            }

            // M x M 크기의 파리채로 잡을 수 있는 최대 파리 수 찾기
            int maxFlyCount = 0;
            for (int i = 0; i <= N - M; i++) {  // 파리채가 들어갈 수 있는 시작 행
                for (int j = 0; j <= N - M; j++) {  // 파리채가 들어갈 수 있는 시작 열
                    int currentFlyCount = 0;

                    // M x M 영역의 파리 수 합 계산
                    for (int x = 0; x < M; x++) {
                        for (int y = 0; y < M; y++) {
                            currentFlyCount += flySquare[i + x][j + y];
                        }
                    }

                    // 최대 파리 수 갱신
                    maxFlyCount = Math.max(maxFlyCount, currentFlyCount);
                }
            }

            // 결과 출력
            System.out.println("#" + test_case + " " + maxFlyCount);
        }
    }
}
