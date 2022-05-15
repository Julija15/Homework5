import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        int[] a = {6, 10, 3, 5};
        for (int i = 0; i < a.length; i++) {
        if (a[i] == b)
        {
            System.out.println("Входит");
            return;
        }
        }
        System.out.println("Не входит");

        // task 2

        int[] a1 = {6, 10, 3, 5, 9};
        System.out.println(Arrays.toString(a1));
        int b1 = scanner.nextInt();
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] == b1) {
                a1[i] = a1[i++];
                System.out.println(a1[i]);
            } else if ((a1[i] != b1)) {
                a1[i] = a1[i];
                System.out.println(a1[i]);
            }
        }
        System.out.println("Не входит");

        // task 3
        //int[] a3 = (f2,b2);
        //int f2 = scanner.nextInt();
        //int b2 = scanner.nextInt();
        //int[] a3 = new int [new Random().nextInt(a3.length)];
        //float min = 0; float max; float c;
        //for (int i=0; i<a3.length; i++)
        //if (min > a3[i])
        // min = a3[i];
        //System.out.println(min);
        //if (max < a3[i])
        // max = a3[i];
        //System.out.println(max);

        // task 4

        int[] m = {6, 8, 3, 7, 9};
        int[] z = {2, 4, 3, 5, 1};
        for (int i = 0; i < m.length; i++) ;
        for (int i = 0; i < z.length; i++) ;
        System.out.println(Arrays.toString(m));
        System.out.println(Arrays.toString(z));
        int summ = 0;
        int sumz = 0;
        summ = summ + m[i];
        sumz = sumz + z [i];

    }
}

