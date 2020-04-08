package com.company;

import java.util.Random;
import java.util.Scanner;


class Zad1{
    void enter(int a[][], int n){
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }



    void res(int a[][],int n){
        int md = 0, pd = 0;
        for (int i=0;i<n;i++){
            md+=a[i][i];
            pd+=a[i][n-1-i];
        }
        System.out.println(Math.abs(md-pd));
    }
}

class Zad2{

    boolean prov;
    int a;
    int best,worst, kb=0, kw = 0;
    Zad2(int i, int a){
        Random rand1 = new Random();
        best = rand1.nextInt(1000)+1;
        worst = best;
        System.out.print(worst+" ");
        for (int k=1; k<i;k++){

            Random rand = new Random();
            int temp = rand.nextInt(1000+1);
            System.out.print(temp+" ");
            if (temp<worst){
                kw++;
                worst=temp;
            }
            if (temp>best){
                kb++;
                best =temp;
            }
        }
    }
    Zad2(int a){
        best=a;
        worst=a;
    }
    void enter(int i) {
        prov = true;
        do{
            try{
                System.out.println("Введите результат за "+(i+1)+" матч ");
                Scanner sc = new Scanner(System.in);
                a = sc.nextInt();
                if (a>=1 && a<=1000) prov = false;
                else System.out.println("Вводите только числа от 1 до 1000");
                if (a<worst){
                    kw++;
                    worst=a;
                }
                if (a>best){
                    kb++;
                    best =a;
                }

            }catch (Exception e){
                System.out.println("Вводите только числа");
            }
        }while(prov);
    }
    void res(){
        System.out.println("\nКоличество игр с улучшением резутьтата: "+kb+"\nКолчество игр с ухудшением результата: "+kw);

    }


}

class Proverka {

    int n1;
    int i;
    boolean prov;
    void zad1razm(){
        prov = true;
        do{
            try{
                Scanner sc = new Scanner(System.in);
                n1 = sc.nextInt();
                if (n1<=1) System.out.println("Введите нормальное число");
                else prov = false;
            }catch (Exception e){
                System.out.println("Введите число");
            }

        }while(prov);

    }


    void zad1mat(int a[][]){
        prov = true;
        do{
            try{
                for (int i=0;i<n1;i++){
                    for (int j=0;j<n1;j++){
                        Scanner sc = new Scanner(System.in);
                        a[i][j] = sc.nextInt();
                    }

                }
                prov = false;

            }catch (Exception e){
                System.out.println("Вводите числа");
            }
        }while(prov);
    }

    void matR (int a[][]){
        Random rand = new Random();
        for (int i=0;i<n1;i++){
            for(int j=0; j<n1; j++){
                a[i][j] = rand.nextInt(201)-100;
            }
        }
    }

    void zad2n(){
        prov = true;

        do{
            try{
                Scanner sc = new Scanner(System.in);
                i = sc.nextInt();
                if (i>1 && i<100) prov = false;
                else System.out.println("Вводите нормальные числа");
            }catch (Exception e){
                System.out.println("Вводите числа");
            }

        }while(prov);
    }
}
public class Main {

    public static void main(String[] args) {
        Proverka p = new Proverka();
        Zad1 zad1 = new Zad1();
        int a=0;
        boolean err=true;
        do {
            try {
                System.out.println("Введите номер задачи ");
                Scanner sc = new Scanner(System.in);
                a = sc.nextInt();
                if (a==1){
                    System.out.println("Введите размерность матрицы");
                    p.zad1razm();
                    int n=p.n1;
                    System.out.println("Введите 1 для заполения матрицы с клавиатуры или 2 для рандомного заполнения");
                    int i;
                    boolean prov = true;
                    int mas[][] = new int[n][n];
                    do{
                        try{

                            Scanner sc1 = new Scanner(System.in);
                            i = sc1.nextInt();
                            if (i == 1){

                                System.out.println("Введите матрицу");
                                p.zad1mat(mas);
                                prov = false;
                            }
                            else if (i==2){
                                p.matR(mas);
                                prov = false;
                            }
                            else System.out.println("Вводите только 1 или 2");
                        }catch (Exception e){
                            System.out.println("Вводите числа");
                        }
                    }while(prov);
                    zad1.enter(mas,n);
                    zad1.res(mas,n);
                }
                else if (a==2){
                    System.out.println("Введите количсетво игр");
                    p.zad2n();
                    int n = p.i;
                    System.out.println("Введите 1 для заполения значений с клавиатуры или 2 для рандомного заполнения");
                    int ho;
                    boolean prov2 = true;
                    do{
                        try{
                            Scanner sc1 = new Scanner(System.in);
                            ho = sc1.nextInt();
                            if (ho == 1){
                                System.out.println("Введите результат за 1 матч");
                                int b=0;
                                boolean prov = true;
                                do{
                                    try{
                                        Scanner sc2 = new Scanner(System.in);
                                        b = sc2.nextInt();
                                        if (b>=1 && b<=1000) prov = false;
                                        else System.out.println("Вводите только числа от 1 до 1000");
                                    }catch (Exception e){
                                        System.out.println("Вводите только числа");
                                    }
                                }while(prov);
                                Zad2 zad2 = new Zad2(b);

                                for(int i=1;i<n;i++){
                                    zad2.enter(i);
                                }
                                zad2.res();
                                prov2 = false;
                            }
                            else if (ho==2){
                                Zad2 zad2 = new Zad2(n,0);
                                zad2.res();
                                prov2 = false;
                            }
                            else System.out.println("Вводите только 1 или 2");
                        }catch (Exception e){
                            System.out.println("Вводите числа");
                        }
                    }while(prov2);
                }
                else if (a==0) break;
                else System.out.println("ne");
            }catch (Exception e){
                System.out.println("Только 1, 2 и 0 - для выхода");
            }
        }while (err || a!=0);

    }
}
