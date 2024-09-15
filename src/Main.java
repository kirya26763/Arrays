import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Задача 1
        int[] a = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        double[] y = {1.57, 7.654, 9.986};
        int[] x = {12, 35, 42, 57};
        //Задача 2
        System.out.println("Задача 2");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i < a.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < y.length; i++) {
            System.out.print(y[i]);
            if (i < y.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println(Arrays.toString(x));
        //Задача 3
        System.out.println("Задача 3");
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = y.length - 1; i >= 0; i--) {
            System.out.print(y[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = x.length - 1; i >= 0; i--) {
            System.out.print(x[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        //Задача 4
        System.out.println("Задача 4");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                a[i]++;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}