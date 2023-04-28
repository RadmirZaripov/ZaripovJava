import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n;
        Scanner in = new Scanner(System.in);
        int[] arr;

        System.out.println("Реализация алгоритма 3");
        System.out.println();
        System.out.print("Введите количество элементов массива: ");
        n = in.nextInt();
        System.out.println("Введите элементы массива в количестве " + n + " шт.: ");

        arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = in.nextInt();
        }
        System.out.print("Элементы массива кратные 3:");

        for (int i = 0; i < n; i++)
        {
            int m = i + 1;
            if (arr[i] % 3 == 0) System.out.print(" №" + m + " = " + arr[i]);
        }

    }
}