import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] point1 = br.readLine().split(" ");
        String[] point2 = br.readLine().split(" ");
        String[] point3 = br.readLine().split(" ");
        
        int x1 = Integer.parseInt(point1[0]), y1 = Integer.parseInt(point1[1]);
        int x2 = Integer.parseInt(point2[0]), y2 = Integer.parseInt(point2[1]);
        int x3 = Integer.parseInt(point3[0]), y3 = Integer.parseInt(point3[1]);
        
        int x4 = (x1 == x2) ? x3 : (x1 == x3) ? x2 : x1;
        int y4 = (y1 == y2) ? y3 : (y1 == y3) ? y2 : y1;
        
        System.out.println(x4 + " " + y4);
    }
}
