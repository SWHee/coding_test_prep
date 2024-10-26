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
			int snailNum = sc.nextInt();
            if(snailNum <= 0 || snailNum >= 10 ) {
                System.out.print("1부터 10 이하의 정수를 입력해주세요");
                continue;
        	}
            
            // 달팽이 알고리즘 snailSquare 호출
            int[][] snailSquare = makeSnailSquare(snailNum);
            
            // 출력
            System.out.println("#" + test_case);
            for (int i = 0; i < snailNum; i++) {
                for (int j = 0; j < snailNum; j++) {
                    System.out.print(snailSquare[i][j] + " ");
                }
            	System.out.println();
            }    
		}
	}
    
    public static int[][] makeSnailSquare(int N) {
        int snailSquare[][] = new int[N][N];
        // 방향 배열 : 오른쪽, 아래, 왼쪽, 위
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int x = 0; int y = 0;
        int num = 1;
        int dirIdx = 0;
        
		while (num <= N * N) {
            snailSquare[x][y] = num++;
            
            int dirX = x + directions[dirIdx][0];
            int dirY = y + directions[dirIdx][1];
            
            if (dirX < 0 || dirX >= N || dirY < 0 || dirY >= N || snailSquare[dirX][dirY] != 0) {
            	dirIdx = (dirIdx + 1) % 4; // 시계 방향으로 전환
                dirX = x + directions[dirIdx][0];
                dirY = y + directions[dirIdx][1];
            }
            
            x = dirX;
            y = dirY;
        }    
                                                           
    	return snailSquare;
    }    
}