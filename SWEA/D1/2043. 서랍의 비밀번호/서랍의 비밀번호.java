import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		int k = sc.nextInt();
		int answer = p - k + 1;
		
		System.out.print(answer);
	}
}