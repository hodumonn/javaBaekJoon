package ARRStudy;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Java8958 {
    
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int count = Integer.parseInt(br.readLine());
        String[] scoreArr = new String[count];

        
        for(int i=0; i<count; i++){
            scoreArr[i] = br.readLine();
        }

        for(int i=0; i<count; i++){
            int result = 0;     //총합
            int sameCnt = 0;    //연속 횟수
            for(int j=0; j<scoreArr[i].length(); j++){
                if(scoreArr[i].charAt(j) == 'O'){
                    sameCnt++;
                }else{
                    sameCnt = 0;
                }
                result += sameCnt;
            }

            sb.append(result + "\n");
        }


        System.out.println(sb);
        br.close();
    }
}
