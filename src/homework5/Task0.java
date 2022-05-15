package homework5;

import java.util.Scanner;

public class Task0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        int[] a = {6, 10, 3, 5};
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b) {
                System.out.println("Входит");
                return;
            }
        }
        System.out.println("Не входит");
    }
}
