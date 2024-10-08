import java.util.Scanner;
public class palindrome {
    public static void main (String [] args){

    Scanner sc = new Scanner(System.in);
    System.out.print("enter number : ");
    int number = sc.nextInt();
    int dup = number, lastDigit = 0, revNum = 0;

    while (number > 0) {
        lastDigit = number % 10;
        number = number / 10;

        revNum = (revNum * 10) + lastDigit;
        
    }
    if (revNum == dup ) {
        System.out.println(" is Palindrome ");
    }
    else{
        System.out.println(" not a palindrome ");
    }

    }
}
