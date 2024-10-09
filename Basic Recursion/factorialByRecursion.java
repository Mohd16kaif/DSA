import java.util.*;
public class factorialByRecursion {

public void fact(int n, int f){

if (n == 0 || n == 1) {
System.out.println("factorial is  : " + f);
return ;
}

f = f * n;

fact(n -1, f);
}

public static void main (String [] args){

Scanner sc = new Scanner(System.in);
System.out.print("Enter number : ");
int n = sc.nextInt();
int f = 1;

factorialByRecursion fr = new factorialByRecursion();
fr.fact(n,f);

}
}