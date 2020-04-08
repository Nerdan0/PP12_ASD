package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ex1 ex1 = new Ex1();
        Ex2 ex2 = new Ex2();

        System.out.println(  "1 - Задание 1\n" + "2 - Задание 2\n" + "0 - Выход");

        while (!scanner.hasNextInt()){
            System.out.println("Неправильный ввод");
            scanner.next();
        }
        int option = scanner.nextInt();

        while (true){
            switch (option){
                case 1:
                    ex1.exercise();
                    break;

                case 2:
                    ex2.exercise2();
                    break;

                case 0:
                    return;

                default:
                    System.out.println("Неправильный ввод");
                    break;
            }
            while (!scanner.hasNextInt()){
                System.out.println("Неправильный ввод");
                scanner.next();
            }
            option = scanner.nextInt();
        }
    }
}

