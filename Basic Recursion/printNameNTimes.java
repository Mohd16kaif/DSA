import java.util.*;
public class printNameNTimes {

public void print_name(String name, int n){

if (n > 5 ){
return;
}
else{
System.out.println(name);
print_name(name, n + 1);
}
}

public static void main (String [] args){

Scanner sc = new Scanner(System.in);

System.out.print("Enter Name : ");

String name = sc.nextLine();

printNameNTimes pn = new printNameNTimes();

pn.print_name(name, 1);

}
}