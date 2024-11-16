import java.util.Scanner;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			if(N<1 || N>100) System.out.println("N은 1 이상 100 이하의 숫자만 입력 가능합니다.");
			
			System.out.println("#" + test_case + " " + N*N);
		}
		
		sc.close();
	}
}
