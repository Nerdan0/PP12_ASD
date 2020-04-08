package uni;

import java.util.Random;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        chooseOption();
    }

    static void chooseOption() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("1. Generate games automatically \n2. Enter games manually \n0. Exit");
            int m = sc.nextInt();
            switch (m) {
                case 1:
                    autoFill();
                case 2:
                    manualFill();
                case 0:
                    System.exit(0);
                default:
                    System.out.println("error");
                    chooseOption();
            }
        } catch (Exception e) {
            System.out.println("Wrong data entered!");
            chooseOption();
        }
    }

    static void autoFill() {
        int n, resultCurrent, resultBest = 0, resultWorst = 0, countMin = 0, countMax = 0;
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the quantity of games :");
            n = sc.nextInt();

            for (int i = 0; i < n; i++) {
                resultCurrent = rand.nextInt(1000) + 1;
                if (i != 0) {
                    if (resultCurrent > resultBest) {
                        resultBest = resultCurrent;
                        countMax++;
                    }
                    if (resultCurrent < resultWorst) {
                        resultWorst = resultCurrent;
                        countMin++;
                    }
                } else {
                    resultBest = resultCurrent;
                    resultWorst = resultCurrent;
                }
                System.out.println("Game " + (i + 1) + ".\nResult " + resultCurrent + ", Best: " + resultBest + ", Worst: " + resultWorst);
            }
            System.out.println("\nBest result changed " + countMax + " times, Worst result changed " + countMin + " times.\n");
            chooseOption();
        } catch (Exception e) {
            System.out.println("Wrong data entered!");
            autoFill();
        }
    }

    static void manualFill() {
        int n, resultCurrent, resultBest = 0, resultWorst = 0, countMax = 0, countMin = 0;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the quantity of games :");
            n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                System.out.println("Enter result of game " + (i + 1) + " : ");
                resultCurrent = sc.nextInt();
                if (i != 0) {
                    if (resultCurrent > resultBest) {
                        resultBest = resultCurrent;
                        countMax++;
                    }
                    if (resultCurrent < resultWorst) {
                        resultWorst = resultCurrent;
                        countMin++;
                    }
                } else {
                    resultBest = resultCurrent;
                    resultWorst = resultCurrent;
                }
                System.out.println("Game " + (i + 1) + ".\nResult " + resultCurrent + ", Best: " + resultBest + ", Worst: " + resultWorst);
            }
            System.out.println("\nBest result changed " + countMax + " times, Worst result changed " + countMin + " times.\n");
            chooseOption();
        } catch (Exception e) {
            System.out.println("Wrong data entered!");
            manualFill();
        }
    }


}
