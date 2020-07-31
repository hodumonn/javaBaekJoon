package FORStudy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(final String[] args) throws Exception{
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(br.readLine());
        int total = 0;

        for(int i=1; i<=num; i++){
            total += i;
        }

        System.out.println(total);
    }
}