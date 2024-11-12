import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt(); // Command 수
            int speed = 0; // 초기 속도
            int distance = 0; // 초기 이동 거리
            
            for (int i = 0; i < N; i++) {
                int command = sc.nextInt();
                
                if (command == 1) { // 가속
                    int acceleration = sc.nextInt();
                    speed += acceleration;
                } else if (command == 2) { // 감속
                    int deceleration = sc.nextInt();
                    speed -= deceleration;
                    if (speed < 0) speed = 0; // 속도가 음수가 되지 않도록 설정
                }
                
                // 이동 거리 계산
                distance += speed;
            }
            
            System.out.println("#" + test_case + " " + distance);
        }
        
        sc.close();
    }
}
