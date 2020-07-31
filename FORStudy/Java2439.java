package FORStudy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Java2439 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num1 = Integer.parseInt(br.readLine());

        for(int i=0; i<num1; i++){
           
            for(int j=i+1; j<num1; j++ ){
                bw.write(" ");
            }

            for(int k=0; k<i+1; k++){
                bw.write("*");
            }

            bw.write("\n");
        }

        bw.flush();

        br.close();
        bw.close();
    }
}