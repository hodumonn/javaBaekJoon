import java.util.Scanner;

public class Java14681{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if((-1000 <= num1 && num1 <= 1000) && (-1000 <= num2 && num2 <= 1000)){
            if(num1 > 0){
                //첫번째 자리가 양수
                if(num2 > 0){
                    System.out.println("1");
                }else if(num2 < 0){
                    System.out.println("4");
                }
            }else if(num1 < 0){
                if(num2 > 0){
                    System.out.println("2");
                }else if(num2 < 0){
                    System.out.println("3");
                }
            }
        }
    }
}