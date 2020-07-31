package FORStudy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Java10950 {
    public static void main(String[] args) throws Exception{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       
       int dataLen = Integer.parseInt(br.readLine());
        
       StringBuilder sb = new StringBuilder();
       for(int i=0; i<dataLen; i++){
           StringTokenizer st = new StringTokenizer(br.readLine());
           int num1 = Integer.parseInt(st.nextToken());
           int num2 = Integer.parseInt(st.nextToken());

           sb.append(num1+num2+"\n");
       }
       System.out.println(sb);
    }
}