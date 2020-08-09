import java.io.*;
import java.util.StringTokenizer;

public class Java10952{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        while(true){
            st = new StringTokenizer(br.readLine()," ");
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            if(num1 == 0 && num2 == 0) {
                break;
            }
            sb.append((num1+num2)).append('\n');
        }
        System.out.println(sb);
        br.close();
    }
}