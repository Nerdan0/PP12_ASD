import java.util.Scanner;

class Ex2{
    public int findRoundToFive(int[] arr, int i){
        if(arr[i] % 10 > 7.5 && arr[i] > 40) {
            return (int) Math.ceil((double) arr[i] / 10) * 10;
        }else if (arr[i] % 10 < 2.5 && arr[i] > 40){
            return (int) Math.floor((double) arr[i] / 10) * 10;
        }else if (arr[i] % 10 > 2.5 && arr[i] > 40){
            return arr[i] +  5 - arr[i] % 10;
        }else if (arr[i] % 10 < 7.5 && arr[i] % 10 > 5 && arr[i] > 40){
            return arr[i] -  5 - arr[i] % 10;
        }else if(arr[i] < 40){
            return arr[i];
        }
        return arr[i];
    }

    public void showTable(int[] arr, int size){
        System.out.println("---------------------------------------------");
        System.out.println("| №\t| Вхідний бал\t|Результат округлення \t|");
        for (int i = 0; i < size; i++) {
            System.out.println("|---|---------------|-----------------------|");
            System.out.println( String.format("|%-3d|" , i + 1) +
                    String.format("%-15d|" , arr[i])  +
                    String.format("%-23d|" , findRoundToFive(arr, i)));
        }
        System.out.println("---------------------------------------------");
    }

    public void solution(){
        Scanner scannerEx2 = new Scanner(System.in);
        int size;

        while (true) {
            System.out.println("Enter number of marks: ");
            while (!scannerEx2.hasNextInt()) {
                System.out.println("Wrong input, try again");
                scannerEx2.next();
            }
            size = scannerEx2.nextInt();
            if (size > 0) {
                break;
            }else{
                System.out.println("Wrong input, try again");
            }
        }
        int[] marksArr = new int[size];
        System.out.println("Enter marks");
        for (int i = 0; i < size; i++) {
            while (!scannerEx2.hasNextInt()){
                System.out.println("Wrong input, try again");
                scannerEx2.next();
            }
            int mark = scannerEx2.nextInt();

            while (mark > 100 || mark < 0){
                System.out.println("Wrong input, try again");

                while (!scannerEx2.hasNextInt()){
                    System.out.println("Wrong input, try again");
                    scannerEx2.next();
                }
                mark = scannerEx2.nextInt();
            }
            marksArr[i] = mark;
        }

        showTable(marksArr, size);
    }
}