import java.util.*;

public class print_N_to_1_byBacktracking {


public void printNto1(int number, int i){

if (i > number){
return;
}else{
printNto1(number, i + 1);
System.out.println(i);
}

}


public static void main (String [] args){

Scanner sc = new Scanner(System.in);
System.out.println("Enter number : ");
int number = sc.nextInt();
int i = 1;

print_N_to_1_byBacktracking pn = new print_N_to_1_byBacktracking();

pn.printNto1(number, i);


}
}