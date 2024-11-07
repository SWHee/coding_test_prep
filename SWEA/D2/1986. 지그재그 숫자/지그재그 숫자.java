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
			int num = sc.nextInt();
			if (num < 1 || num > 10) System.out.println("N은 1 이상 10 이하의 정수만 입력 가능합니다.");
			int sum = 0;
			
			for(int i = 1; i <= num; i++) {
				if (i % 2 == 1) {
					sum += i;
				} else if (i % 2 == 0){
					sum -= i;
				}
			}		
			System.out.println("#" + test_case + " " + sum);
		}
	}
}