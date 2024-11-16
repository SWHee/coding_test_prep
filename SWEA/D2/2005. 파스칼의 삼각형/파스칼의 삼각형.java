import java.util.Scanner;

class Solution {
	public static void main(String args[]) throws Exception {
//		1. 첫 번째 줄은 항상 숫자 1이다.
//
//		2. 두 번째 줄부터 각 숫자들은 자신의 왼쪽과 오른쪽 위의 숫자의 합으로 구성된다.
		
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			int pascalSize = sc.nextInt();
			if (pascalSize < 1 || pascalSize > 10) System.out.println("삼각형의 크기는 1 이상 10 이하의 숫자만 입력 가능합니다.");
			
			int[][] pascal = new int[pascalSize][pascalSize];
			
			for (int i = 0; i < pascalSize; i++) {
				if(i==0) pascal[0][i] = 1;
				if(i==1) {
					pascal[1][0] = 1;
					pascal[1][1] = 1;
				}
				if(i>1) {
					for (int j = 1; j <= i - 1; j++) {
						pascal[i][0]=1;
						pascal[i][i]=1;
						pascal[i][j] = pascal[i-1][j-1] + pascal[i-1][j];
					}					
				}
			}
			
			System.out.println("#" + test_case);
			for (int i = 0; i < pascalSize; i++) {
				for (int j = 0; j <= i; j++) {
					System.out.print(pascal[i][j] + " ");
				}
				System.out.println();
			}
			
		}
		sc.close();
	}
}