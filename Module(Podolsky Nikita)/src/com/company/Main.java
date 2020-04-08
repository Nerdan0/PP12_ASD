package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int vvid = 0;
        boolean exception;
        Task1 Task1;
        Task2 Task2;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Виберіть один із пунктів: 1.Завдання №1 2.Завдання №2 0.Вихід з программи");
            do {
                try {
                    vvid = input.nextInt();
                    exception = false;
                } catch (InputMismatchException e) {
                    System.out.println("Пункт меню має бути цілим числом");
                    exception = true;
                    input.next();
                }
            } while (exception);
            switch (vvid) {
                case 1:
                    Task1 = new Task1();
                    break;
                case 2:
                    Task2 = new Task2();
                    break;
                case 0:
                    break;
                default:System.out.println("Треба було вводити щось з переліченого");break;
            }
        }while(vvid != 0);
    }
}
