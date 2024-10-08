import java.util.Scanner;

public class reverseDigit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = sc.nextInt();
        int lastDigit = 0, revNum = 0;

        System.out.print("Given number  :" + number);
        while (number > 0) {
            lastDigit = number % 10;
            number = number / 10;

            revNum = (revNum * 10) + lastDigit;

        }
        System.out.println();
        System.out.print("Reversed Number : " + revNum);

    }

}
