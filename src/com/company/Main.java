package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String NoName = "";
        int num = 0;
        String word = "NoName";
        System.out.println("NoName " + num);

        if (num < 0 ) {
            System.out.println("Вы сохранили отрицательное число");
        }
        else  if (num > 0) {
            System.out.println("Вы сохранили положительное число");
        }
        else if (num == 0) {
            System.out.println("Вы сохранили нуль");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя:");
        String name = scanner.nextLine();
        System.out.println("Ассаламу Алейкум " + name);



    }
}
