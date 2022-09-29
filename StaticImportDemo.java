import static java.util.Arrays.sort;

import java.util.Calender;

public class StaticImportDemo {
    public static void main(String[] args) {
        int[] data = { 3, 5, 1, 7 };
        sort(data);
        System.out.println(Calender.JANUARY);
        Calender.getInstance();
    }
}