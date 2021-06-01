package ARRStudy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Java2577 {
    
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int arr[] = new int[3];
        int result;

        for(int i=0; i<3; i++){
            arr[i] = Integer.parseInt(new StringTokenizer(br.readLine(), " ").nextToken());
        }

        result = arr[0] * arr[1] * arr[2];

        String resultStr = Integer.toString(result);
        int resultArr[] = new int[10];

        for(int i=0; i<resultStr.length(); i++){
            int seq = Integer.parseInt(resultStr.substring(i, i+1));
            resultArr[seq]++;
        }
        
        for(int i=0; i<resultArr.length; i++){
            System.out.println( resultArr[i]);
        }
        br.close();
    }
}
