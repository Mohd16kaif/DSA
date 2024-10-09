import java.util.*;
public class printReverse {

public void rev(int i, int num){

if ( i > num){
return;
} else {
System.out.println(num);
rev(i, num - 1);
}

}

public static void main (String [] args){

Scanner sc = new Scanner(System.in);
System.out.println("Enter number : ");
int num = sc.nextInt();

printReverse pr = new printReverse();
pr.rev(1, num); // 1 3

}
}