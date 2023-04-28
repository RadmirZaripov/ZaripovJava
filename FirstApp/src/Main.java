import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        long x;
        Scanner in = new Scanner(System.in);

        System.out.println("Реализация алгоритма 1");
        System.out.println();
        System.out.print("Введите любое целое число в диапазоне от -9223372036854775808 до 9223372036854775807: ");

        x = in.nextLong();

        if (x > 7) System.out.println("Привет!");
    }
}