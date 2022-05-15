package homework5;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] m = {6, 8, 3, 7, 9};
        int[] z = {1, 3, 8, 5, 10};
        System.out.println(Arrays.toString(m));
        System.out.println(Arrays.toString(z));
        int summ = 0;
        int sumz = 0;
        for (int i = 0; i < m.length; i++) {
            summ = summ + m[i];
            sumz = sumz + z[i];
        }
        int sredneeM = summ / m.length;
        int sredneeZ = sumz / z.length;
        if (sredneeM > sredneeZ) {
            System.out.println(" sredneeM > sredneeZ");
        } else if (sredneeM < sredneeZ) {
            System.out.println(" sredneeM < sredneeZ");
        } else {
            System.out.println("sredneeM = sredneeZ");
        }
    }
}
