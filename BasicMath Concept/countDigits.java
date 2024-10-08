import java.util.Scanner;

public class countDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number : ");
        int number = sc.nextInt();
        int  count = 0;

        while (number > 0) {
            //lastDigit = number % 10;
            number = number / 10;
            count = count+1;
           
        }

        System.out.println("Digits : " + count);
        
 
    }
}
