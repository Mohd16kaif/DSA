import java.util.*;
public class palindromeByRecursion {

public void Palindrome(String str, int i){

String rev = null;

rev = str.charAt(i);

}

public static void main (String [] args){

Scanner sc = new Scanner(System.in);

System.out.print("Enter String : " );

String str = sc.nextLine();

int i = str.length -1;



palindromeByRecursion pbr = new palindromeByRecursion();

pbr.Palindrome(str, i);


}
}