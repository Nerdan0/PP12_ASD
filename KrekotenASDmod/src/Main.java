import java.util.Scanner;

//ПП-12
//Крекотень Микита
//Вариант 4 (8)
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ex1 ex1 = new Ex1();
        Ex2 ex2 = new Ex2();

        System.out.println("1 - ex1\n" +
                "2 - ex2\n" +
                "0 - exit");

        while (!scanner.hasNextInt()){
            System.out.println("Wrong input, try again");
            scanner.next();
        }
        int option = scanner.nextInt();

        while (true){
            switch (option){
                case 1:
                    ex1.solution();
                    break;

                case 2:
                    ex2.solution();
                    break;

                case 0:
                    return;

                default:
                    System.out.println("Wrong input, try again");
                    break;
            }
            System.out.println("1 - ex1\n" +
                    "2 - ex2\n" +
                    "0 - exit");
            while (!scanner.hasNextInt()){
                System.out.println("Wrong input, try again");
                scanner.next();
            }
            option = scanner.nextInt();
        }
    }
}


