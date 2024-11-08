import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	// 문자열 30, 마디 10
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		sc.nextLine();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			String input = sc.nextLine();
			if (input.length() != 30) System.out.println("문자열의 길이는 30 이여야 합니다.");
			int repetlen = 0;
			
			for (int i = 1; i <= 10; i++) {
				String repet = input.substring(0, i);
				String repetNext = input.substring(i, 2 * i);
				if (repet.equals(repetNext)) {
					repetlen = repet.length();
					System.out.println("#" + test_case + " " + repetlen);
					break;
				}
			}
			
		}
	}
}