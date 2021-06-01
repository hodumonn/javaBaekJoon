package ARRStudy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Java2562 {
    
    public static void main(String[] args) throws Exception{
        int[] arr = new int[9];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int maxVal = 0;
        int seq = 0;
        
        for(int i=0; i<9; i++){
            st = new StringTokenizer(br.readLine(), " ");
            arr[i] = Integer.parseInt(st.nextToken());
            if(maxVal < arr[i]){
                maxVal = arr[i];
                seq = i+1;
            }
        }
        System.out.println(maxVal);
        System.out.println(seq);
        br.close();
    }
}
