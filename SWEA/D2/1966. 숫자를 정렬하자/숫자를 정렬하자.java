import java.util.Arrays;
import java.util.Scanner;

class Solution {
	public static void main(String args[]) throws Exception {
//		주어진 N 길이의 숫자열을 오름차순으로 정렬하여 출력하라.
//
//		[제약 사항]
//
//		N 은 5 이상 50 이하이다.
		
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();
		sc.nextLine();

		for (int test_case = 1; test_case <= T; test_case++) {
			int numLen = sc.nextInt(); sc.nextLine();
			if (numLen > 50 || numLen < 5) System.out.println("숫자의 길이는 5 이상 50 이하만 입력 가능합니다.");

			int[] numbers = new int[numLen];
			for (int i = 0; i < numLen; i++) {
				numbers[i] = sc.nextInt();
			}
			
			Arrays.sort(numbers);
			
			System.out.print("#" + test_case + " ");
			for (int i = 0; i < numLen; i++) {
				System.out.print(numbers[i] + " ");
			}
			System.out.println();
		}

		sc.close();
	}
}
