package WHILEStudy;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Java1110 {
    
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        int num1, num2 = 0;
        int sum = n;
        
        
        if(n < 10){
            n*=10;
        }
        
        while(true){
            num1 = sum / 10;
            num2 = sum % 10;
            sum = num1 + num2;
            
            sum = num2 * 10 + sum % 10;
            cnt++;
            
            if(sum == n)
                break;
        }
        
        System.out.println(cnt);
        br.close();
        
    }
}
