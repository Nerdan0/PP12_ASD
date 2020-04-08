//ПП-12
//Черниш Дмитро
//Варіант 4(19)


package Module;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args)
    {

        ArrayList<Integer> lowArr = new ArrayList<Integer>();
        ArrayList<Integer> highArr = new ArrayList<Integer>();

        lowArr.add(0);
        highArr.add(-1);

        byte sw = 0;

        while(true)
        {
            System.out.printf("1 - Enter first array size and values\n2 - Enter second array size and values\n3 - Get data\n4 - Exit\nEnter num:");

            try
            {

                Scanner sc = new Scanner(System.in);

                sw = sc.nextByte();

                if (sw==4)
                {

                    break;

                }

                if (sw<1 && sw>3)
                {

                    System.out.println("Please, enter valid number");

                }
                else
                {

                    switch (sw)
                    {

                        case 1:



                            lowArr.clear();

                            lowArr = setArr(1);

                            break;
                        case 2:

                            highArr.clear();

                            highArr = setArr(2);

                            break;
                        case 3:

                            if (lowArr.get(lowArr.size()-1)>highArr.get(0))
                            {

                                throw new java.util.InputMismatchException();

                            }

                            System.out.println("Data:");

                            boolean valid;
                            boolean exists = false;


                            for (int i = lowArr.get(lowArr.size()-1); i<=highArr.get(0);i++)
                            {

                                valid = true;

                                for (int j = 0; j< lowArr.size();j++)
                                {

                                    if (i%lowArr.get(j) !=0)
                                    {

                                        valid = false;

                                    }

                                }

                                for (int j = 0; j< highArr.size();j++)
                                {

                                    if (highArr.get(j)%i !=0)
                                    {

                                        valid = false;

                                    }

                                }

                                if (valid == true)
                                {

                                    System.out.println(i);
                                    exists = true;


                                }

                            }

                            if (exists == false)
                            {

                                System.out.println("No values are suitable");

                            }

                            break;

                    }

                }
            }
            catch (java.util.InputMismatchException e)
            {

                System.out.println("Non-valid arrays value");

            }




        }

    }

    public static ArrayList<Integer> setArr(int sw)
    {

        ArrayList<Integer> arr = new ArrayList<Integer>();

        if(sw==1)
        {

            System.out.print("Please, enter size of first array: ");

        }
        else
        {

            System.out.print("Please, enter size of second array: ");

        }


        Scanner sc = new Scanner(System.in);

        try
        {

            int size = sc.nextInt();

            if (size>10 || size<1)
            {

                throw new java.util.InputMismatchException();

            }

            if(sw==1)
            {

                System.out.print("Please, enter elements of first array: ");

            }
            else
            {

                System.out.print("Please, enter elements of second array: ");

            }


            for (int i = 0; i<size;i++)
            {

                arr.add(sc.nextInt());

                if (arr.get(i)>100 || arr.get(i)<1)
                {

                    throw new java.util.InputMismatchException();

                }


            }

            Collections.sort(arr);

        }
        catch (java.util.InputMismatchException e)
        {

            System.out.println("Please, enter valid number");

        }

        return arr;

    }

}

