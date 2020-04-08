package com.company;

import java.util.Scanner;

//ПП-12/Жовтецький Роман/Варіант 6
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ex1 ex1 = new Ex1();

        System.out.println(  "1 - ex1\n" +
                "0 - exit");

        while (!scanner.hasNextInt()){
            System.out.println("Wrong input, try again");
            scanner.next();
        }
        int option = scanner.nextInt();

        while (true){
            switch (option){
                case 1:
                    ex1.decision();
                    break;

                case 0:
                    return;

                default:
                    System.out.println("Wrong input, try again");
                    break;
            }
            while (!scanner.hasNextInt()){
                System.out.println("Wrong input, try again");
                scanner.next();
            }
            option = scanner.nextInt();
        }
    }
}

class Ex1{
    public int ToFive(int arr[], int i){
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

    public void Table(int arr[], int size){
        System.out.println("---------------------------------------------");
        System.out.println("| №\t| Вхідний бал\t|Результат округлення \t|");
        for (int i = 0; i < size; i++) {
            System.out.println("|---|---------------|-----------------------|");
            System.out.println( String.format("|%-3d|" , i + 1) +
                    String.format("%-15d|" , arr[i])  +
                    String.format("%-23d|" , ToFive(arr, i)));
        }
        System.out.println("---------------------------------------------");
    }

    public void decision(){
        Scanner scannerEx1 = new Scanner(System.in);
        int size;

        System.out.println("Enter number of marks: ");
        while (!scannerEx1.hasNextInt()){
            System.out.println("Wrong input, try again");
            scannerEx1.next();
        }
        size = scannerEx1.nextInt();
        int marksArr[] = new int[size];
        System.out.println("Enter marks");
        for (int i = 0; i < size; i++) {
            while (!scannerEx1.hasNextInt()){
                System.out.println("Wrong input, try again");
                scannerEx1.next();
            }
            int mark = scannerEx1.nextInt();

            if (mark > 100 || mark < 0){
                System.out.println("Wrong input, try again");

                while (!scannerEx1.hasNextInt()){
                    System.out.println("Wrong input, try again");
                    scannerEx1.next();
                }
                mark = scannerEx1.nextInt();
            }
            marksArr[i] = mark;
        }

        Table(marksArr, size);
    }
}