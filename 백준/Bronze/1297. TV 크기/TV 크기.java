import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int D = Integer.parseInt(input[0]);
        int H = Integer.parseInt(input[1]);
        int W = Integer.parseInt(input[2]);

        double ratio = Math.sqrt((double) D * D / (H * H + W * W));
        int height = (int) (H * ratio);
        int width = (int) (W * ratio);

        System.out.println(height + " " + width);
    }
}
