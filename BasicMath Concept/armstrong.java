import java.util.Scanner;
public class armstrong {
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int number = sc.nextInt();
        int dup = number, lastDigit = 0, sum = 0;

        while (number > 0) {
            
            lastDigit = number % 10;
            number = number / 10;
            sum = sum + (lastDigit * lastDigit * lastDigit);
        }
        if (dup == sum)
        System.out.println("Armstrong number");
        else 
        System.out.println("Not an Armstrong number");
    }
}
