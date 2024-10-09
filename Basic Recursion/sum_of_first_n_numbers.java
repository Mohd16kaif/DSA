import java.util.*;
public class sum_of_first_n_numbers {

public void printSum(int number, int i, int sum){

if(i < 1){
System.out.print("Sum is : " + sum);
return;
}
else {

sum = sum + number;

printSum(number - 1, i - 1, sum);

}

}

public static void main (String [] args){

Scanner sc = new Scanner(System.in);
System.out.print("Enter number : ");

int number = sc.nextInt();
int i = number, sum = 0;



sum_of_first_n_numbers sofn = new sum_of_first_n_numbers();

sofn.printSum(number, i, sum);


}
}