import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int [] array = {13,46,24,52,20,9};
        System.out.println(Arrays.toString(array));
        int n = array.length;
        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j>0; j--){
                if(array[j]<array[j-1]){
                    int temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
                else{
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
