import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int number = Integer.parseInt(sc.nextLine().trim());
		int sumDigit = 0;
		
		while (number > 0) {
            sumDigit += (number % 10);
            number /= 10;
        }
		
		System.out.print(sumDigit);
	}
}