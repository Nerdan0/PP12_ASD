// ПП-12
// Гаврилян Лідія
// Варіант 4 (3)
package com.company;
import java.util.LinkedList;
import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
    Array array = new Array();
        array.print();
}
    public static class Array{
        private Scanner in = new Scanner(System.in);
        public void fillArray(int[] arr, int size){
            int option;
            System.out.println("Виберіть:\n 1) заповнити з клавіатури\n" +
                    " 2) випадкові числа");
            while (!in.hasNextInt()){
                System.out.println("Неправильний ввід");
                in.next();
            }
            option = in.nextInt();

            while (true) {
                switch (option) {
                    case 1:
                        for (int i = 0; i < size; i++) {
                            System.out.println("Елемент(" + i + ")");
                            while (!in.hasNextInt()) {
                                System.out.println("Неправильний ввід");
                                in.next();
                            }
                            arr[i] = in.nextInt();
                        }
                        return;

                    case 2:
                        for (int i = 0; i < size; i++) {
                            arr[i] = (int) (Math.random() * 100 + 1);
                        }
                        return;

                    default:
                        System.out.println("Неправильний ввід");
                        while (!in.hasNextInt()){
                            System.out.println("Неправильний ввід");
                            in.next();
                        }
                        option = in.nextInt();
                        break;
                }
            }
        }
        public void showArray(int[] arr, int size){
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + ", ");
            }
        }
        public void print(){
            int sizeArr1;
            int sizeArr2;
            int[] arr1;
            int[] arr2;

            System.out.println("Введіть розмір першого масиву: ");
            while (!in.hasNextInt()){
                System.out.println("Неправильний ввід");
                in.next();
            }
            sizeArr1 = in.nextInt();
            while (sizeArr1 < 1 || sizeArr1 > 10) {
                System.out.println("Неправильний ввід");
                while (!in.hasNextInt()) {
                    System.out.println("Неправильний ввід");
                    in.next();
                }
                sizeArr1 = in.nextInt();
            }
            arr1 = new int[sizeArr1];
            fillArray(arr1, sizeArr1);

            System.out.print("Масив 1: ");
            this.showArray(arr1, sizeArr1);
            System.out.println();

            System.out.println("Введіть розмір другого масиву: ");
            while (!in.hasNextInt()){
                System.out.println("Неправильний ввід");
                in.next();
            }
            sizeArr2 = in.nextInt();
            while (sizeArr2 < 1 || sizeArr2 > 10) {
                System.out.println("Неправильний ввід");
                while (!in.hasNextInt() ) {
                    System.out.println("Неправильний ввід");
                    in.next();
                }
                sizeArr2 = in.nextInt();
            }
            arr2 = new int[sizeArr2];
            fillArray(arr2, sizeArr2);
            System.out.print("Масив 2: ");
            this.showArray(arr2, sizeArr2);
            System.out.println();
            this.result(arr1, arr2);
        }

        public void result(int[] arr1, int[] arr2){
            LinkedList result = new LinkedList();
            boolean match;

            for (int current = arr1[arr1.length - 1]; current <= arr2[0]; current++){
                match = true;
                for (int value : arr1){
                    if (current % value != 0){
                        match = false;
                        break;
                    }
                }
                for (int value : arr2){
                    if (value % current != 0 ){
                        match = false;
                        break;
                    }
                }
                if (match){
                    result.add(current);
                }
            }
            System.out.print("Відповідь: "+result);
                for (int i = 0; i < result.size(); i++) {
                    System.out.print(result.get(i) + ", ");
                }
        }
    }}




