package homework5;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¬ведите размер массива:");
        int n;
        while (true) {
            n = sc.nextInt();
            if ((n > 5) && (n <= 10)) {
                break;
            } else {
                System.out.println("¬ведите число от 6 до 10");
            }
        }
        int[] mas1 = new int[n];
        int l = 0;
        for (int i = 0; i < mas1.length; i++) {
            mas1[i] = (int) (Math.random() * 100);
            if (mas1[i] % 2 == 0) {
                l++;
            }
        }
        System.out.println(Arrays.toString(mas1));
        if (l > 0 ) {
            int[] mas2 = new int[l];
            int j = 0;
            for (int i = 0; i < mas1.length; i++) {
                if (mas1[i] % 2 == 0) {
                    mas2[j] = mas1[i];
                    j++;
                }
            }

            System.out.println(Arrays.toString(mas2));
        }


    }
}
