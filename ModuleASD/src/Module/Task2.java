//ПП-12
//Черниш Дмитро
//Варіант 4(19)


package Module;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args)
    {

        ArrayList<Integer> studentArr = new ArrayList<Integer>();
        ArrayList<Integer> studentArrRound = new ArrayList<Integer>();

        byte sw = 0;

        while(true)
        {
            System.out.printf("1 - Enter number of students and their marks\n2 - Print table\n3 - Exit\nEnter num:");

            try
            {

                Scanner sc = new Scanner(System.in);

                sw = sc.nextByte();
                int size;

                if (sw==3)
                {

                    break;

                }

                if (sw<1 && sw>2)
                {

                    throw new java.util.InputMismatchException();

                }
                else
                {

                    switch (sw)
                    {

                        case 1:

                            studentArr.clear();

                            System.out.println("Enter number of students: ");

                            size = sc.nextInt();

                            System.out.println("Enter marks: ");

                            if (size<1)
                            {

                                throw new java.util.InputMismatchException();

                            }

                            for (int i = 0; i<size;i++)
                            {

                                studentArr.add(sc.nextInt());

                                if (studentArr.get(i)>100 || studentArr.get(i)<0)
                                {

                                    throw new java.util.InputMismatchException();

                                }

                            }

                            studentArrRound.clear();

                            for (int i = 0; i<size;i++)
                            {

                                studentArrRound.add(studentArr.get(i));

                            }

                            for (int i = 0; i<size;i++)
                            {

                                if (studentArrRound.get(i)>40)
                                {

                                   if (studentArrRound.get(i)%10>=0 && studentArrRound.get(i)%10<=2)
                                   {

                                       studentArrRound.set(i,studentArrRound.get(i) - studentArrRound.get(i)%10);

                                   }

                                   if (studentArrRound.get(i)%10>=3 && studentArrRound.get(i)%10<=7)
                                   {

                                       studentArrRound.set(i,studentArrRound.get(i) - studentArrRound.get(i)%10+5);

                                   }

                                   if (studentArrRound.get(i)%10>=8 && studentArrRound.get(i)%10<=9)
                                   {

                                       studentArrRound.set(i,studentArrRound.get(i)/10+10);

                                   }

                                }

                            }


                            break;
                        case 2:

                            if (studentArr.size()==0)
                            {

                                System.out.println("Empty array of students");
                                break;

                            }

                            System.out.printf("№\tMark\tRounded mark\n");

                            for (int i = 0; i<studentArr.size();i++)
                            {

                                System.out.printf((i+1)+"\t"+studentArr.get(i)+"\t"+studentArrRound.get(i)+"\n");

                            }

                            break;

                    }

                }
            }
            catch (java.util.InputMismatchException e)
            {

                System.out.println("Please, enter valid number");

            }




        }

    }



}

