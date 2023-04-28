import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String str;
        Scanner in = new Scanner(System.in);

        System.out.println("Реализация алгоритма 2");
        System.out.println();
        System.out.print("Введите Ваше имя: ");

        str = in.next();

        if (str.equals("Вячеслав")) System.out.println("Привет, Вячеслав!");
            else System.out.println("Нет такого имени");
    }
}