public class reverseArrayByRecursion {


public void swap(int [] arr, int left, int right){

if ( left >= right)
return;

int temp = arr[left];
arr[left] = arr[right];
arr[right] = temp;


swap(arr, left+1, right-1);

}


public static void main (String [] args){

int [] arr = {2, 22, 222, 2222};
int temp = 0, left = arr[0], right = arr.length-1;

reverseArrayByRecursion rabr = new reverseArrayByRecursion();

System.out.println("Original Array");

for (int org : arr){
System.out.print(org + " ");
}
System.out.println();

rabr.swap(arr, 0, arr.length-1);

System.out.println("Reversed Array");

for (int rev : arr){
System.out.print(rev + " ");
}

}
}