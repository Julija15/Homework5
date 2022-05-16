package homework5;

import javax.xml.namespace.QName;
import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
    String[] names = new String[]{"Masha", "Anna", "Julija", "Kate"};
    for (int i = 0; i < names.length; i++) {
        Arrays.sort(names);
        System.out.print(names[i] + "  ");
        }
    }
}
