package ARRStudy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java4344 {
    
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int testCnt = Integer.parseInt(br.readLine());

        for(int i=0; i<testCnt; i++){
            st = new StringTokenizer(br.readLine(), " ");

            int studentCnt = Integer.parseInt(st.nextToken());
            int[] scoreArr = new int[studentCnt];
            int allScore = 0;
            int overStudent = 0;

            for(int j=0; j<studentCnt; j++){
                scoreArr[j] = Integer.parseInt(st.nextToken());
                allScore += scoreArr[j];
            }

            int avg = allScore / studentCnt;

            for(int j=0; j<studentCnt; j++){
                if(scoreArr[j] > avg){
                    overStudent++;
                }
            }
            double overStudentAvg = (double) overStudent / studentCnt * 100;
            sb.append(String.format("%.3f", overStudentAvg) + "%\n");
        }

        System.out.println(sb);
        br.close();
    }
}
