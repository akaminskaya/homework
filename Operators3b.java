package homework1;

import java.util.Scanner;

public class Operators3b {
    public static void main(String[] args) {

        String name1 = "Вася";
        String name2 = "Анастасия";

        Scanner in = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String name = in.nextLine();

        if (name.equals(name1)) {
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал");
        } else if (name.equals(name2)) {
                System.out.println("Я тебя так долго ждал");
        } else {
            System.out.println("Добрый день, а вы кто?");
        }
    }
}


