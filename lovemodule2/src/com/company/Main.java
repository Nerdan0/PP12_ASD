package com.company;

import java.util.Scanner;

//ПП12/Жовтецький Роман/Варіант 6/ 2 завдання

public class Main {


    public static void main(String args[]) {

        int a, b;

        Scanner in = new Scanner(System.in);

        System.out.println("1 - manual filling");

        System.out.println("2 - autofill");

        if (in.hasNextInt()) {

            b = in.nextInt();

            if (b < 1 && b > 2) {

                System.out.println("Try again");

                return;

            } else {

                if (b == 1) {




                    System.out.println("How many games?");

                    if (in.hasNextInt()) {

                        a = in.nextInt();

                        if (a <= 0 || a > 100) {

                            System.out.println("Try again");

                            return;

                        }

                    } else {

                        System.out.println("Try again");

                        return;

                    }

                    double[][] game = new double[a][3];

                    for (int i = 0; i < a; i++) {

                        System.out.println("Enter the result of the game " + (i + 1));

                        if (in.hasNextInt()) {

                            game[i][0] = in.nextInt();

                        } else {

                            System.out.println("Try again");

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

                    System.out.println("Game| Result.| Best | Worst");
                    for (int i = 0; i < a; i++) {
                        System.out.println(String.format("%d   |%4.0f    |%4.0f  |%4.0f", i + 1, game[i][0], game[i][1], game[i][2]));

                    }

                }

                else if(b==2){

                    a=9;

                    double[][] game = new double[a][3];

                    for (int i = 0; i < a; i++) {

                        game[i][0] = Math.random()*1000;




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

                    System.out.println("Game| Result.| Best | Worst");
                    for (int i = 0; i < a; i++) {
                        System.out.println(String.format("%d   |%4.0f    |%4.0f  |%4.0f", i + 1, game[i][0], game[i][1], game[i][2]));

                    }

                }

            }

        }

        else{System.out.println("Try again");}

    }

}
