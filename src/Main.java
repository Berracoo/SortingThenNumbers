import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //applying the scanner class
       Scanner scanner = new Scanner(System.in);
       int f,s,t;
        System.out.print("Enter the first number : ");
        f = scanner.nextInt();
        System.out.println("********************");

        System.out.print("Enter the second number : ");
        s = scanner.nextInt();
        System.out.println("********************");

        System.out.print("Enter the third number : ");
        t = scanner.nextInt();
        System.out.println("********************");

      
        if(f > s && f > t){
            if(s > t){
                System.out.println("Sorting numbers as : f > s > t .");
            }else{
                System.out.println("Sorting numbers as : f > t > s .");
            }

        }else if(s > f && s > t){
            if(f > t){
                System.out.println("Sorting numbers as : s > f > t .");
            }else{
                System.out.println("Sorting numbers as : s > t > f .");
            }
        }else if(t > f && t > s){
            if (f > s){
                System.out.println("Sorting numbers as : t > f > s .");
            }else{
                System.out.println("Sorting numbers as : t > s > f .");
            }
        }else if( f == s && s == t){
            System.out.println("Please be sure that you don't enter equal numbers !");
        }



    }
}
