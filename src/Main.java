import java.util.Scanner;

/**
 * Created by Dariya on 06.10.2015.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a natural three-digit number");
        int number=sc.nextInt();
        int n1=number/100;
        int n2=number/10%10;
        int n3=number%10;
        System.out.println("Summery="+(n1+n2+n3));
        //System.out.println(Math.round(number));
    }
}
