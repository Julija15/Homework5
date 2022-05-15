package homework5;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int[] arr1 = {8,5,7,3,2};
        System.out.println(Arrays.toString(arr1));
        for (int i = 0; i < arr1.length; i++) {
            if (i % 2 != 0) {
                arr1[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr1));
    }
}
