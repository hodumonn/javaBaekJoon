package ARRStudy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Java1546 {
    
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        double maxScore = 0;
        int count = Integer.parseInt(br.readLine());
        int[] scoreArr = new int[count];
        double allScore = 0;

        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<count; i++){
            scoreArr[i] = Integer.parseInt(st.nextToken());
            if(scoreArr[i] > maxScore) 
                maxScore = scoreArr[i];
        }
        for(int i=0; i<count; i++){
            allScore += scoreArr[i] / maxScore * 100;
        }

        System.out.println(allScore/count);
        br.close();
    }
}
