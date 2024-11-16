import java.util.Scanner;

class Solution {
	public static void main(String args[]) throws Exception {
//		입력으로 9 X 9 크기의 스도쿠 퍼즐의 숫자들이 주어졌을 때
//		위와 같이 겹치는 숫자가 없을 경우, 1을 정답으로 출력하고 그렇지 않을 경우 0 을 출력한다.
//
//		[제약 사항]
//		1. 퍼즐은 모두 숫자로 채워진 상태로 주어진다.
//		2. 입력으로 주어지는 퍼즐의 모든 숫자는 1 이상 9 이하의 정수이다.

		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			int[][] sudoku = new int[9][9];
			int proveNum = 1;
		
			for (int i = 0; i < sudoku.length; i++) {
				for (int j = 0; j < sudoku.length; j++) {
					sudoku[i][j] = sc.nextInt();
				}
			}
			
			// 가로 줄 검사
			for (int i = 0; i < sudoku.length; i++) {
				int[] visited = new int[9];
				for (int j = 0; j < sudoku.length; j++) {
					int num = sudoku[i][j];
					
					if (visited[num - 1] == 1) {
						proveNum = 0;
						break;
					} else visited[num - 1] = 1;
				}
				if (proveNum == 0) break;
			}
			
			// 세로 줄 검사
			for (int i = 0; i < sudoku.length; i++) {
				int[] visited = new int[9];
				for (int j = 0; j < sudoku.length; j++) {
					int num = sudoku[j][i];
					
					if (visited[num - 1] == 1) {
						proveNum = 0;
						break;
					} else visited[num - 1] = 1;
				}
				if (proveNum == 0) break;
			}
			
			// 3x3 격자 검사
			if (proveNum == 1) {
				for (int row = 0; row < sudoku.length; row += 3) {
					for (int col = 0; col < sudoku.length / 3; col += 3) {
						int[] visited = new int[9];
                        for (int i = 0; i < 3; i++) {
                            for (int j = 0; j < 3; j++) {
                                int num = sudoku[row + i][col + j];
                                if (visited[num - 1] == 1) { // 중복된 숫자가 발견되면
                                    proveNum = 0;
                                    break;
                                }
                                visited[num - 1] = 1; // 숫자 방문 표시
                            }
                            if (proveNum == 0) break; // 중복 발견 시 검사 종료
                        }
                        if (proveNum == 0) break; // 중복 발견 시 검사 종료
					}
					if (proveNum == 0) break;
				}				
				
			}
			System.out.println("#" + test_case + " " + proveNum);
		}

		sc.close();
	}
}
