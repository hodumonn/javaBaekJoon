import java.util.Scanner;

public class Java2884{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int mi = sc.nextInt();

        if(mi < 45){
            mi += 60;
            if(hour == 0) hour = 23;
            else hour -= 1;
        }

        System.out.print(hour);
        System.out.print(" ");
        System.out.println(mi-45);
    }
}