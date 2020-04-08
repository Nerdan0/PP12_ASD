package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {
    Task2() {
        int roz1 = 0, roz2 = 0;
        int vvid = 0;
        boolean exception = false;
        System.out.println("Введіть розмір масиву n:");
        Scanner input = new Scanner(System.in);
        do {
            try {
                roz1 = input.nextInt();
                exception = false;
                if (roz1 <= 0) {
                    System.out.println("Розмір має бути більше 0");
                    exception = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Розмір має бути цілим числом");
                exception = true;
                input.next();
            }
        } while (exception);
        System.out.println("Введіть розмір масиву m:");
        do {
            try {
                roz2 = input.nextInt();
                exception = false;
                if (roz2 <= 0) {
                    System.out.println("Розмір має бути більше 0");
                    exception = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Розмір має бути цілим числом");
                exception = true;
                input.next();
            }
        } while (exception);
        int n[] = new int[roz1];
        int m[] = new int[roz2];
        System.out.println("Виберіть один із пунктів: 1.Ввести матрицю вручну 2.Заповнити матрицю випадковими числами від 1 до 100");
        do {
            try {
                vvid = input.nextInt();
                exception = false;
            } catch (InputMismatchException o) {
                System.out.println("Пункт меню має бути цілим числом");
                exception = true;
                input.next();
            }
        } while (exception);
        switch (vvid) {
            case 1: {
                System.out.println("Заповніть n:");
                for (int i = 0; i < roz1; i++) {
                    do {
                        try {
                            n[i] = input.nextInt();
                            exception = false;
                        } catch (InputMismatchException a) {
                            System.out.println("Елемент масиву n має бути цілим числом");
                            exception = true;
                            input.next();
                        }
                    } while (exception);
                }
                System.out.println("Заповніть m:");
                for (int i = 0; i < roz2; i++) {
                    do {
                        try {
                            m[i] = input.nextInt();
                            exception = false;
                        } catch (InputMismatchException a) {
                            System.out.println("Елемент масиву m має бути цілим числом");
                            exception = true;
                            input.next();
                        }
                    } while (exception);

                }
                break;
            }
            case 2: {
                for (int i = 0; i < roz1; i++) {
                    n[i] = (int) (Math.random() * 100 + 1);
                }
                for (int i = 0; i < roz2; i++) {
                    m[i] = (int) (Math.random() * 100 + 1);
                }
                break;
            }
            default:
                System.out.println("Треба було вводити щось з переліченого");
                break;
        }
        if((vvid > 2)||(vvid < 0))
            return;
        int counter1;
        int counter2;
        int k = 0;
        int i = 0;
        if (n[roz1 - 1] > m[0]) {
            i = m[0];
            k = n[roz1 - 1];
        }
        else
        {
            k = m[0];
            i = n[roz1 - 1];
        }
            for (; i <= k; i++) {
                counter1 = 0;
                counter2 = 0;
                for (int j = 0; j < roz1; j++) {
                    if (i % n[j] == 0)
                        counter1++;
                }
                for (int j = 0; j < roz2; j++) {
                    if (m[j] % i == 0)
                        counter2++;
                }
                if((counter1 == roz1)&&(counter2 == roz2))
                    System.out.print(i + " ");
            }
            System.out.println();
    }
}
