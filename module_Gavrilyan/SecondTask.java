// ПП-12
// Гаврилян Лідія
// Варіант 4 (3)
package com.company;
import java.util.LinkedList;
import java.util.Scanner;

public class SecondTask {
   public static void main(String args[]){
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Введіть кількість оцінок ");
        if(in.hasNextInt()){
            n = in.nextInt();
            if(n <= 0 || n > 100){
                System.out.println("Неправильний ввід");
                System.exit(0);
            }
        }
        else{
            System.out.println("Неправильний ввід");
            return;
        }
        double[][] mark = new double[n][3];
        for(int i = 0; i < n; i++){
            System.out.println("Введіть "+(i+1)+"-у оцінку ");
            if(in.hasNextDouble()) {
                mark[i][1]= in.nextDouble();
            }
            else{
                mark[i][1]=0;
            }
            if (mark[i][1]<=100||mark[i][1]>0) {
                if (mark[i][1] > 40) {
                    if (mark[i][1] % 5 == 0)
                        mark[i][2] = mark[i][1];
                    else if (mark[i][1] % 5 < 2.5)
                        mark[i][2] = mark[i][1] - mark[i][1] % 5;
                    else
                        mark[i][2] = mark[i][1] + (5 - mark[i][1] % 5);
                } else {
                    mark[i][2] = mark[i][1];
                }
            } else {
                System.out.println("неправильний ввід");
                System.exit(0);
            }
        }
       System.out.println("№з/п|\tВхідний бал\t\t| Результат округлення ");
       System.out.println("-------------------------------------------");
        for(int i = 0; i < n; i++){
            System.out.println(i+1 + "\t|\t\t"+mark[i][1]+"\t\t|\t\t"+mark[i][2]);
        }
    }
}


