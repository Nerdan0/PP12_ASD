import java.util.LinkedList;
import java.util.Scanner;

public class Ex1{
    private Scanner scannerEx1 = new Scanner(System.in);

    public void fillArray(int[] arr, int size){
        int option;

        System.out.println(" 1 - fill by yourself\n" +
                " 2 - fill with random numbers");
        while (!scannerEx1.hasNextInt()){
            System.out.println("Wrong input, try again");
            scannerEx1.next();
        }
        option = scannerEx1.nextInt();

        while (true) {
            switch (option) {
                case 1:
                    for (int i = 0; i < size; i++) {
                        System.out.println("Array(" + i + ")");
                        while (!scannerEx1.hasNextInt()) {
                            System.out.println("Wrong input, try again");
                            scannerEx1.next();
                        }
                        arr[i] = scannerEx1.nextInt();
                    }
                    return;

                case 2:
                    for (int i = 0; i < size; i++) {
                        arr[i] = (int) (Math.random() * 100 + 1);
                    }
                    return;

                default:
                    System.out.println("Wrong input, try again");
                    while (!scannerEx1.hasNextInt()){
                        System.out.println("Wrong input, try again");
                        scannerEx1.next();
                    }
                    option = scannerEx1.nextInt();
                    break;
            }
        }
    }

    public void showArray(int[] arr, int size){
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + ", ");
        }
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

        System.out.print("Result: ");
        if (result.isEmpty()){
            System.out.println("*Empty*");
        }else {
            for (int i = 0; i < result.size(); i++) {
                System.out.print(result.get(i) + ", ");
            }
        }
        System.out.println();
    }

    public void solution (){
        int sizeArr1;
        int sizeArr2;
        int[] arr1;
        int[] arr2;

        // Array 1
        System.out.println("Enter size of array: ");
        while (!scannerEx1.hasNextInt()){
            System.out.println("Wrong input, try again");
            scannerEx1.next();
        }
        sizeArr1 = scannerEx1.nextInt();
        while (sizeArr1 < 1 || sizeArr1 > 10) {
            System.out.println("Wrong input, try again");
            while (!scannerEx1.hasNextInt()) {
                System.out.println("Wrong input, try again");
                scannerEx1.next();
            }
            sizeArr1 = scannerEx1.nextInt();
        }

        arr1 = new int[sizeArr1];
        fillArray(arr1, sizeArr1);

        System.out.print("Array1: ");
        this.showArray(arr1, sizeArr1);
        System.out.println();

        // Array 2
        System.out.println("Enter size of array: ");
        while (!scannerEx1.hasNextInt()){
            System.out.println("Wrong input, try again");
            scannerEx1.next();
        }
        sizeArr2 = scannerEx1.nextInt();
        while (sizeArr2 < 1 || sizeArr2 > 10) {
            System.out.println("Wrong input, try again");
            while (!scannerEx1.hasNextInt() ) {
                System.out.println("Wrong input, try again");
                scannerEx1.next();
            }
            sizeArr2 = scannerEx1.nextInt();
        }

        arr2 = new int[sizeArr2];
        fillArray(arr2, sizeArr2);
        System.out.print("Array2: ");
        this.showArray(arr2, sizeArr2);
        System.out.println();

        this.result(arr1, arr2);

    }
}