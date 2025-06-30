import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] array = {13,46,24,52,20,9};
        System.out.println(Arrays.toString(array));
        int n = array.length;
        for(int i = n-1; i >= 0; i--){
            for(int j = 0; j <= i-1; j++){
                if(array[j] > array [j+1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
