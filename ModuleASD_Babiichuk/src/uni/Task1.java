package uni;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        chooseOption();
    }

    public static void chooseOption() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size (1 - 10) of massive A:");
        int sizeA = sc.nextInt();
        System.out.println("Enter size (1 - 10) of massive B:");
        int sizeB = sc.nextInt();
        if (sizeA > 10 || sizeA < 0 || sizeB < 0 || sizeB > 10) {
            System.out.println("Wrong data entered!");
            System.out.println("Enter size (1 - 10) of massive A:");
            sizeA = sc.nextInt();
            System.out.println("Enter size (1 - 10) of massive B:");
            sizeB = sc.nextInt();
        }

        int[] a = new int[sizeA];
        int[] b = new int[sizeB];

        System.out.println("1. Enter all elements. \n" +
                "2. Randomly fill the massives");
        Scanner sc1 = new Scanner(System.in);
        String choose = sc1.nextLine();
        switch (Integer.parseInt(choose)) {
            case 1:
                manualFill(a, b);
                break;
            case 2:
                autoFill(a);
                autoFill(b);
                break;
            default:
                System.out.println("Wrong data entered!");
        }


        ArrayList<Integer> result = new ArrayList<>();
        Checked(a, b, result);

        System.out.println("Result : " + result);
        chooseOption();
    }

    public static void manualFill(int[] a, int[] b) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter A[" + i + "] :");
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < b.length; i++) {
            System.out.println("Enter B[" + i + "] :");
            b[i] = sc.nextInt();
        }

    }

    public static boolean Checked(int[] a, int[] b, ArrayList<Integer> result) {
        boolean x = true;
        for (int current = a[a.length - 1]; current <= b[0]; current++) {
            for (int value : a) {
                if (current % value != 0) {
                    x = false;
                    break;
                }
            }
            for (int value : b) {
                if (value % current != 0) {
                    x = false;
                    break;
                }
            }
            if (x) {
                result.add(current);
            }
            x = true;
        }

        return true;
    }

    public static void autoFill(int[] a) {
        Random rand = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(100) + 1;
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }
}
