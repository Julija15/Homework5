package homework5;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¬ведите размер массива:");
        int p = scanner.nextInt();
        int[] b = new int[p];
        for (int i = 0; i < b.length; i++) {
            b[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(b));
        Arrays.sort(b);
        System.out.println("min = " + b[0]);
        System.out.println("max = " + b[b.length - 1]);
        System.out.println("average = " + b[b.length/2]);
    }
}

