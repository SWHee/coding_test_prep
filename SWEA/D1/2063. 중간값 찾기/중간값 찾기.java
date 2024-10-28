import java.util.Arrays;
import java.util.Scanner;
 
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int N = sc.nextInt();
 
        int[] arrayNum = new int[N];
 
        for (int i = 0; i < N; i++) {
            arrayNum[i] = sc.nextInt();
        }
 
        Arrays.sort(arrayNum);
 
        int middleNum = arrayNum[N / 2];
        System.out.println(middleNum);
 
    }
}