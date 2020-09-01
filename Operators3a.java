package homework1;

import java.util.Scanner;

public class Operators3a {
    public static void main(String[] args) {

        String name1 = "Вася";
        String name2 = "Анастасия";

        Scanner in = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String name = in.nextLine();

        switch (name) {
            case "Вася":
                System.out.println("Привет!");
            case "Анастасия":
                System.out.println("Я тебя так долго ждал");
                break;
            default:
                System.out.println("Добрый день, а вы кто?");
        }
    }

}

