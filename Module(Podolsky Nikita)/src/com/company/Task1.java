package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1
{
    Task1()
    {
        int n = 0, sum1 = 0, sum2 = 0, vvid = 0;
        boolean exception = false;
        System.out.println("Введіть розмір квадратної матриці:");
        Scanner input = new Scanner(System.in);
        do {
            try {
                n = input.nextInt();
                exception = false;
                if(n <= 0)
                {
                    System.out.println("Розмір квадратної матриці має бути більше 0");
                    exception = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Розмір квадратної матриці має бути цілим числом");
                exception = true;
                input.next();
            }
        } while (exception);
        int matrix[][] = new int[n][n];
        System.out.println("Виберіть один із пунктів: 1.Ввести матрицю вручну 2.Заповнити матрицю випадковими числами від -100 до 100");
        do {
            try
            {
                vvid = input.nextInt();
                exception = false;
            } catch (InputMismatchException o)
            {
                System.out.println("Пункт меню має бути цілим числом");
                exception = true;
                input.next();
            }
        }while (exception);
        switch (vvid)
        {
            case 1: {
                System.out.println("Заповніть квадратну матрицю:");
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        do {
                            try {
                                matrix[i][j] = input.nextInt();
                                exception = false;
                            } catch (InputMismatchException a) {
                                System.out.println("Елемент квадратної матриці має бути цілим числом");
                                exception = true;
                                input.next();
                            }
                        } while (exception);
                    }
                }
                break;
            }
            case 2:{
                for(int i = 0; i < n; i++)
                {
                    for( int j = 0; j < n; j++)
                    {
                        matrix[i][j] = (int) (Math.random() * 200 - 100);
                    }
                }
                break;
            }
            default:System.out.println("Треба було вводити щось з переліченого");break;
        }
        if((vvid > 2)||(vvid < 0))
            return;
        for(int i = 0; i < n; i++)
        {
            sum1 = sum1 + matrix[i][i];
        }
        for(int i = 0; i < n; i++)
        {
            sum2 = sum2 + matrix[i][n-i-1];
        }
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println(Math.abs(sum1 - sum2));
    }
}
