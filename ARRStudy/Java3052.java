package ARRStudy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Java3052 {
    
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int arrCnt = 10;
        int arr[] = new int[arrCnt];
        int overlapCnt = 0;
        int result=0;
        
        for(int i=0; i<arrCnt; i++){
            st = new StringTokenizer(br.readLine(), " ");
            arr[i] = Integer.parseInt(st.nextToken()) % 42;
        }
        
        for(int j=0; j<arrCnt; j++){
            overlapCnt = 0;
            for(int z=j+1; z<arrCnt; z++){
                if(arr[j] == arr[z]){
                    overlapCnt++;
                }
            }
            if(overlapCnt == 0){
                result++;
            }
        }

        System.out.println(result);
        br.close();
    }
}
