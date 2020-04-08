package com.company;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
public class main {
    static int get_int() {
        int choise_num;
        while (true) {
            final Scanner num = new Scanner(System.in);
            if (num.hasNextInt()) {
                choise_num = num.nextInt();
                break;
            }
            System.out.println("enter integer number");
        }
        return choise_num;
    }
    static boolean get_boolean() {
        boolean choise_num;
        while (true) {
            final Scanner num = new Scanner(System.in);
            if (num.hasNextBoolean()) {
                choise_num=num.nextBoolean();
                break;
            }
            System.out.println("enter true or false");
        }
        return choise_num;
    }
    public static void main(String[] args) {
        System.out.println("Введите размер квадрата");
        int sizeSquare = get_int();
        int [][]square = new int[sizeSquare][sizeSquare];
        System.out.println("Заполнить массив автоматически?\ntrue-да\nfalse-нет");
        Random random = new Random();
        if(get_boolean()) {
            for (int i=0; i<sizeSquare; i++) {
                for (int j=0; j<sizeSquare; j++) {
                    square[i][j]=(random.nextInt(201))-100;
                }
            }
        }
        else {
            for (int i=0; i<sizeSquare; i++) {
                for (int j=0; j<sizeSquare; j++) {
                    square[i][j]=get_int();
                }
            }
        }
        int differenceSumDiagonales=0;
        for (int i=0; i<sizeSquare; i++) {
            differenceSumDiagonales+=square[i][i];
            differenceSumDiagonales-=square[i][sizeSquare-1-i];
        }
        differenceSumDiagonales=Math.abs(differenceSumDiagonales);
        for (int i=0; i<sizeSquare; i++) {
            for (int j=0; j<sizeSquare; j++) {
                System.out.print(square[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println("\n"+differenceSumDiagonales);

        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Введите количество значений: ");
            int n = input.nextInt();
            System.out.printf("Введите %d значений(я):\n", n);
            int[] values = new int[n];
            int[] results = new int[n];
            for (int i = 0; i < n; i++) {
                int value = input.nextInt();
                if (value < 0 || value > 100) {
                    System.out.println("Вы ввели неправильное значение");
                    return;
                }
                values[i] = value;
                int rounded = 5 * (int) Math.round(value / 5.0);
                if (rounded >= 40)
                    results[i] = rounded;
                else
                    results[i] = value;
            }

            System.out.println("Результат:");
            for (int i = 0; i < n; i++)
                System.out.printf("%d\t%d\t%d\n", i + 1, values[i], results[i]);
        } catch (InputMismatchException e) {
            System.out.println("Вы ввели что-то не так!");
        }
    }
}