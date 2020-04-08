


/////Варіант 5



package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean error = true;
        int i = 0;
        do {
            try {
                System.out.println("Введіть: \n1) для задачі №1\n2) для задачі №2\n0) для виходу");
                i = scan.nextInt();
                switch(i)
                {
                    case 1:
                        Task1 task1 = new Task1();
                        break;
                    case 2:
                        Task2 task2 = new Task2();
                        break;
                    case 0:
                        error = false;
                        break;
                    default: break;
                }
            }
            catch(InputMismatchException e)
            {
                System.out.println("Введіть ціле число");
                error = true;
                scan.next();
            }
        }while(error);
    }
}
