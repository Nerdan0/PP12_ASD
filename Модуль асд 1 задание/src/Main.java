
import java.util.Random;

public class Main{
    private static int i,j;

    public static void main(String[]args ){
     int[][] mas2d=new int[10][10];
     Random rand = new Random();
     for( i=0; i<10;i++)
         for ( j=0;j<10;j++)
             for ( j=0;j<10;j++)
             mas2d[i][j] = rand.nextInt(200)-100;
         for( i=0; i<10; i++)
     {
         for( j=0; j< 10; j++)
             System.out.println(mas2d[i][j]);
         System.out.println();
     }
 }
        }