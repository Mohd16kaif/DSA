import java.util.*;

public class print1toNbyBacktrack {


public void print1toN(int number, int i){

if ( i < 1){
return;
}
else {
print1toN(number, i - 1);
System.out.println(i);
}
}

public static void main (String [] args){

Scanner sc = new Scanner(System.in);

System.out.print("Enter number : ");
int number = sc.nextInt();
int i = number;
print1toNbyBacktrack pn = new print1toNbyBacktrack();

pn.print1toN(i, number);


}
}