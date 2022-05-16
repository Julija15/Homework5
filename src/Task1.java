import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        int[] a1 = {6, 10, 3, 5, 9};
        System.out.println(Arrays.toString(a1));
        int q = 0;
        for (int i = 0; i < a1.length; i++) {
            if (b == a1[i]) {
                q++;
            }
        }
        if (q > 0) {
            int[] a2 = new int[a1.length - q];
            int j = 0;
            for (int i = 0; i < a1.length; i++) {
                if ((a1[i] != b)) {
                    a2[j] = a1[i];
                    j++;
                }
            }
            System.out.println(Arrays.toString(a2));
        } else {
            System.out.println(" Число не входит в массив");
        }
    }
}

