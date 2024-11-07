import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		sc.nextLine();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			String input = sc.nextLine();
			char[] palindrome = input.toCharArray();
			int check = 0;
			
			for (int i = 0; i < palindrome.length / 2; i++) {
				if (palindrome[i] == palindrome[palindrome.length - i - 1]) {
					check = 1;
				}
			}
			
			System.out.println("#" + test_case + " " + check);
		}
	}
}