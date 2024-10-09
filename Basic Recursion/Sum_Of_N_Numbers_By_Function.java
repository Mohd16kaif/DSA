import java.util.*;
public class Sum_Of_N_Numbers_By_Function {


public int printSumByFunc(int n){

if(n == 0){
return 0;
}

return n + printSumByFunc(n - 1);


}

public static void main(String [] args){

Scanner sc = new Scanner(System.in);
System.out.print("Enter number : ");
int n = sc.nextInt();

Sum_Of_N_Numbers_By_Function sonnbf = new Sum_Of_N_Numbers_By_Function();

System.out.println("sum of " + n + " is : " + sonnbf.printSumByFunc(n));


}
}