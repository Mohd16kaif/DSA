public class insertionSort {
    public static void main (String [] args){

        int arr [] = {5, 2, 1, 7, 0, 3, 4};

        for(int i = 1; i < arr.length; i++){
            int temp = arr[i];
            int j = i -1;
            while (j >= 0) {
                if (arr[j] > temp) {
                    //shift
                    arr[j + 1] = arr[j];
                }
                else
                break;
            }
            arr[j + 1] = temp;
        }
    }
}
