package com.company;
import java.util.Scanner;

public class Ex1 {

    public int rounding(int arr[], int i) {
        if(arr[i] % 10 > 7.5 && arr[i] > 40) {
            return (int) Math.ceil((double) arr[i] / 10) * 10;
        }else if (arr[i] % 10 < 2.5 && arr[i] > 40){
            return (int) Math.floor((double) arr[i] / 10) * 10;
        }
        else if (arr[i] % 10 > 2.5 && arr[i] > 40){
            return arr[i] +  5 - arr[i] % 10;
        }else if (arr[i] % 10 < 7.5 && arr[i] % 10 > 5 && arr[i] > 40){
            return arr[i] -  5 - arr[i] % 10;
        }else if(arr[i] < 40){
            return arr[i];
        }
        return arr[i];
    }

    public void table(int arr[], int size) {
        System.out.println("|-------------------------------------------|");
        System.out.println("|№\t|Балл        \t|Результат округления \t|");
        for (int i = 0; i < size; i++) {
            System.out.println("|---|---------------|-----------------------|");
            System.out.println( String.format("|%-3d|" , i + 1) +
                    String.format("%-15d|" , arr[i])  +
                    String.format("%-23d|" , rounding(arr, i)));
        }
        System.out.println("|-------------------------------------------|");
    }

    public void exercise() {
        Scanner scannerEx2 = new Scanner(System.in);
        int size;

        System.out.print("Количество оценок: ");
        while (!scannerEx2.hasNextInt()){
            System.out.println("Неправильный ввод");
            scannerEx2.next();
        }
        size = scannerEx2.nextInt();
        int marksArr[] = new int[size];
        System.out.print("Введите оценки: ");
        for (int i = 0; i < size; i++) {
            while (!scannerEx2.hasNextInt()){
                System.out.println("Неправильный ввод");
                scannerEx2.next();
            }
            int mark = scannerEx2.nextInt();

            if (mark > 100 || mark < 0){
                System.out.println("Неправильный ввод");

                while (!scannerEx2.hasNextInt()){
                    System.out.println("Неправильный ввод");
                    scannerEx2.next();
                }
                mark = scannerEx2.nextInt();
            }
            marksArr[i] = mark;
        }

        table(marksArr, size);
    }
}
