import java.util.*;

class Solution {
    public int solution(int[][] routes) {
        // 모든 차량이 카메라 한 번은 만나도록
        // 경로 routes, 최소 몇 대의 카메라 설치해야 하는지 return
        
        // routes[i][0]에는 i번째 차량이 고속도로에 진입한 지점
        // routes[i][1]에는 i번째 차량이 고속도로에서 나간 지점
        
        Arrays.sort(routes, (o1, o2) -> {
            return o1[1] - o2[1];
        });
        
        int camera = Integer.MIN_VALUE;
        int camCount = 0;
        
        for(int i = 0; i < routes.length; i++) {
            if(camera < routes[i][0]) {
                camera = routes[i][1];
                camCount++;
            }
        }
        
        return camCount;
    }
}