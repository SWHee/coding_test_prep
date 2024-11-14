import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int puzzleSize = sc.nextInt();
            int wordLength = sc.nextInt();
            int[][] puzzle = new int[puzzleSize][puzzleSize];

            // 퍼즐 배열 입력
            for (int i = 0; i < puzzleSize; i++) {
                for (int j = 0; j < puzzleSize; j++) {
                    puzzle[i][j] = sc.nextInt();
                }
            }

            int canWord = 0;

            // 가로 방향 체크
            for (int i = 0; i < puzzleSize; i++) {
                int proveLen = 0;
                for (int j = 0; j < puzzleSize; j++) {
                    if (puzzle[i][j] == 1) {
                        proveLen++;
                    } else {
                        if (proveLen == wordLength) canWord++;
                        proveLen = 0;
                    }
                }
                if (proveLen == wordLength) canWord++;  // 마지막 연속된 1의 길이 체크
            }

            // 세로 방향 체크
            for (int j = 0; j < puzzleSize; j++) {
                int proveWidth = 0;
                for (int i = 0; i < puzzleSize; i++) {
                    if (puzzle[i][j] == 1) {
                        proveWidth++;
                    } else {
                        if (proveWidth == wordLength) canWord++;
                        proveWidth = 0;
                    }
                }
                if (proveWidth == wordLength) canWord++;  // 마지막 연속된 1의 길이 체크
            }

            System.out.println("#" + test_case + " " + canWord);
        }
        
        sc.close();
    }
}
