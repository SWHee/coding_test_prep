import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[][] points = new int[N][2];

        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");

            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);

            points[i][0] = x;
            points[i][1] = y;

        }

        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]){
                    return o1[1] - o2[1];
                } else {
                    return o1[0] - o2[0];
                }
            }
        });

//        Arrays.sort(points, (o1, o2) -> {
//            if(o1[0] == o2[0]){
//                return o1[1] - o2[1];
//            } else {
//                return o1[0] - o2[0];
//            }
//        });

        for(int[] point : points) {
            System.out.println(point[0] + " " + point[1]);
        }
    }
}
