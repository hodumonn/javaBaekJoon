package ARRStudy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Java10818 {
    
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int numMax= 0, numMin = 0;

        int cnt = Integer.parseInt(br.readLine());
        int[] arr = new int[cnt];
        
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<cnt; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            // if(numMin < Integer.parseInt(st.nextToken())){

            // }
        }

        for(int i=0; i<cnt; i++){
            if(i == 0){
                numMin = arr[i];
                numMax = arr[i];
            }else{
                if(arr[i] > numMax) numMax = arr[i];
                if(arr[i] < numMin) numMin = arr[i];
            }
        }
        System.out.println(numMin);
        System.out.println(numMax);
        System.out.println(numMin + " " + numMax);
        br.close();

    }
}
