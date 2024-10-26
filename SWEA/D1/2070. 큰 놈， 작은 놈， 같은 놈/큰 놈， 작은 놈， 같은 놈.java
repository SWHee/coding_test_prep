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
            String[] parts = input.split(" ");
            int a = Integer.parseInt(parts[0]);
            int b = Integer.parseInt(parts[1]);
            String compare = "";
            
           if (a > b) {
                compare = ">";
            } else if (a == b) {
                compare = "=";
            } else {
                compare = "<";
            }
            
			System.out.println("#" + test_case + " " + compare);
		}
	}
}