import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (num > 100000) System.out.println("100,000 이하의 숫자를 입력하세요.");
		
		for(int i = 1; i <= num; i++)
		{
			System.out.print("#");
		}
	}
}