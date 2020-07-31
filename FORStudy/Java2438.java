package FORStudy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Java2438 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        for(int i=1; i<=num; i++){
            for(int j=0; j<i; j++){
                bw.write("*");
            }
            bw.write("\n");
        }

        bw.flush();

        br.close();
        bw.close();
    }
}