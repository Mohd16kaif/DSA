import java.util.*;
public class printLinearly {

public void Linear(int i, int num){

if(i > num){
return;
}
else {
System.out.println(i);

Linear(i + 1, num);
}

}

public static void main (String [] args){

Scanner sc = new Scanner(System.in);

System.out.print("Enter Number : ");

int num = sc.nextInt();

printLinearly pl = new printLinearly();

pl.Linear(1, num);

}
}