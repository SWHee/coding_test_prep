import java.util.Scanner;

class Solution {
	public static void main(String args[]) throws Exception {
//		N x N 행렬이 주어질 때,
//		시계 방향으로 90도, 180도, 270도 회전한 모양을 출력하라.
//
//		[제약 사항]
//		N은 3 이상 7 이하이다.

		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();
		
		for (int test_case = 1; test_case <= T; test_case++) {
			int squareSize = sc.nextInt();
			if (squareSize < 3 || squareSize > 7) System.out.println("행렬의 크기는 3 이상 7 이하의 정수만 입력 가능합니다.");
			
			int[][] square = new int[squareSize][squareSize];
			int[][] rotate90 = new int[squareSize][squareSize];
			int[][] rotate180 = new int[squareSize][squareSize];
			int[][] rotate270 = new int[squareSize][squareSize];
			
			int maxIndex = squareSize - 1;
			
			// 입력 받기
			for(int i = 0; i < squareSize; i++) {
				for(int j = 0; j < squareSize; j++) {
					square[i][j] = sc.nextInt();
				}
			}
			
//			square[maxIndex - j][i]
//			square[maxIndex - i][maxIndex - j]
//			square[j][maxIndex - i]
			
			// 회전한 2차원 배열로 저장
			for(int i = 0; i < squareSize; i++) {
				for(int j = 0; j < squareSize; j++) {
					rotate90[i][j] = square[maxIndex - j][i];
					rotate180[i][j] = square[maxIndex - i][maxIndex - j];
					rotate270[i][j] = square[j][maxIndex - i];
				}
			}
			System.out.println("#" + test_case);
			for(int i = 0; i < squareSize; i++) {
				// 90도 출력
				for(int j = 0; j < squareSize; j++) {
					System.out.print(rotate90[i][j]);
				} System.out.print(" ");
				
				// 180도 출력
				for(int j = 0; j < squareSize; j++) {
					System.out.print(rotate180[i][j]);
				} System.out.print(" ");
				
				// 270도 출력
				for(int j = 0; j < squareSize; j++) {
					System.out.print(rotate270[i][j]);
				} System.out.print(" ");
				
				System.out.println();
			}	
		}

		sc.close();
	}
}