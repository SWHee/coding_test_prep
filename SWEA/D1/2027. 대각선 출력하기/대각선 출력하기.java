import java.util.Arrays;
import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		for (int i = 0; i < 5; i++) {
			String[] base = new String[5];
			Arrays.fill(base, "+");
			base[i] = "#";
			
			for(int j = 0; j < base.length; j++) {
				System.out.print(base[j]);				
			}
			System.out.println();
		}
		
	}
}