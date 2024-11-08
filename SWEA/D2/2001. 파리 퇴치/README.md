# [D2] 파리 퇴치 - 2001 

[문제 링크](https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV5PzOCKAigDFAUq) 

### 성능 요약

메모리: 20,720 KB, 시간: 142 ms, 코드길이: 1,748 Bytes

### 제출 일자

2024-11-09 00:55



> 출처: SW Expert Academy, https://swexpertacademy.com/main/code/problem/problemList.do

---

'''Java
import java.util.Random;
import java.util.Scanner;
import java.io.FileInputStream;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();
		sc.nextLine();

		// Fly = 파리
		for (int test_case = 1; test_case <= T; test_case++) {
			// 사각형 사이즈와 파리채 사이즈 string 배열에 저장
			String[] input = sc.nextLine().split(" ");
			
			// 사각형 사이즈 정의
			int squareSize = Integer.parseInt(input[0]);
			if (squareSize > 15) System.out.println("첫번째 인수는 15 이하만 가능합니다.");
			
			// 파리채 사이즈 정의
			int swatterSize = Integer.parseInt(input[1]);
			if (swatterSize < 2 || swatterSize > squareSize) System.out.println("두번째 인수는 2 이상 첫번째 인수 이하만 가능합니다.");
			
			// 파리채로 잡은 파리 수 초기화
			int catchedFly = 0;

			// 배열 안 30 이하의 난수 생성을 위한 랜덤 클래스 객체 생성
			Random rand = new Random();

			// 입력받은 사각형 사이즐를 이용해 2차원 배열에 30 이하의 랜덤한 파리값 배정 
			int[][] flySquare = new int[squareSize][squareSize];
			for (int i = 0; i < squareSize; i++) {
				for (int j = 0; j < squareSize; j++) {
					flySquare[i][j] = rand.nextInt(31);
				}
			}
			
			// **누적합, 슬라이딩 윈도우 알고리즘 중 슬라이딩 윈도우.
			for (int i = 0; i <= squareSize - swatterSize; i++) {
				for (int j = 0; j <= squareSize - swatterSize; j++) {
					int currentFlyCount = 0;
					
					for (int x = 0; x < swatterSize; x++) {
						for (int y = 0; y < swatterSize; y++) {
							currentFlyCount += flySquare[i + x][j + y];
						}
					}
					
					catchedFly = Math.max(catchedFly, currentFlyCount);
				}
			}

			System.out.println("#" + test_case + " " + catchedFly);
		}
	}
}
'''
