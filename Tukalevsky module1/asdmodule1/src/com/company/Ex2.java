package com.company;
import java.util.Scanner;

public class Ex2 {

    public void exercise2() {

        int n, m;

        Scanner in = new Scanner(System.in);

        System.out.println("1 - Ручное заполнение");
        System.out.println("2 - Автозаполнение");

        if (in.hasNextInt()) {
            m = in.nextInt();
            if (m < 1 || m > 2) {
                System.out.println("Неправильный ввод");
                return;
            } else {
                if (m == 1) {

                    System.out.print("Введите количество игр: ");
                    if (in.hasNextInt()) {
                        n = in.nextInt();
                        if (n < 1 || n > 100) {
                            System.out.println("Неправильный ввод");
                            return;
                        }
                    } else {
                        System.out.println("Неправильный ввод");
                        return;
                    }
                    double[][] game = new double[n][3];
                    for (int i = 0; i < n; i++) {
                        System.out.print("Введите результат " + (i + 1) + " игры: ");
                        if (in.hasNextInt()) {
                            game[i][0] = in.nextInt();
                        } else {
                            System.out.println("Неправильный ввод");
                            return;
                        }
                        game[0][1] = game[0][0];
                        game[0][2] = game[0][0];
                        if (i > 0 && game[i][0] > game[i - 1][1]) {
                            game[i][1] = game[i][0];
                        } else if (i == 0) {
                        } else {
                            game[i][1] = game[i - 1][1];
                        }
                        if (i > 0 && game[i][0] < game[i - 1][2]) {
                            game[i][2] = game[i][0];
                        } else if (i == 0) {
                        } else {
                            game[i][2] = game[i - 1][2];
                        }
                    }
                    System.out.println("Игра|Рeзульт.|Лучший|Худший");
                    for (int i = 0; i < n; i++) {
                        System.out.println(String.format("%d   |%4.0f    |%4.0f  |%4.0f", i + 1, game[i][0], game[i][1], game[i][2]));
                    }
                } else if (m == 2) {
                    n = 9;
                    double[][] game = new double[n][3];
                    for (int i = 0; i < n; i++) {
                        game[i][0] = Math.random() * 1000;

                        game[0][1] = game[0][0];
                        game[0][2] = game[0][0];
                        if (i > 0 && game[i][0] > game[i - 1][1]) {
                            game[i][1] = game[i][0];
                        } else if (i == 0) {
                        } else {
                            game[i][1] = game[i - 1][1];
                        }
                        if (i > 0 && game[i][0] < game[i - 1][2]) {
                            game[i][2] = game[i][0];
                        } else if (i == 0) {
                        } else {
                            game[i][2] = game[i - 1][2];
                        }
                    }
                    System.out.println("Игра|Рeзульт.|Лучший|Худший");
                    for (int i = 0; i < n; i++) {
                        System.out.println(String.format("%d   |%4.0f    |%4.0f  |%4.0f", i + 1, game[i][0], game[i][1], game[i][2]));
                    }
                }
            }
        } else {
            System.out.println("Неправильный ввод");
        }
    }
}