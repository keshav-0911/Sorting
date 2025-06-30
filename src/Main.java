import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int [] array = {13,46,24,52,20,9};
        System.out.println(Arrays.toString(array));
        int n = array.length;
        for(int i = 0; i < n-1; i++) {
            int minimum = i;
            for (int j = i; j < n; j++) {
                if (array[j] < array[minimum]) {
                    minimum = j;
                }
            }
            int temp = array[minimum];
            array[minimum] = array[i];
            array[i] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}