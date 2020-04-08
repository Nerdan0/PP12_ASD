package me.endfolder;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Table2 implements Table {
    private Scanner input;
    private ArrayList<Integer> marks;

    public Table2(Scanner input) {
        this.input = input;
    }

    @Override
    public String title() {
        return "Rating";
    }

    @Override
    public void solve() {
        this.marks = new ArrayList<>();
        inputMarks();
//  System.out.println(Arrays.toString(marks.toArray(Integer[]::new)));
        System.out.println("+------+------------+------------+");
        System.out.printf("|%6s|%12s|%12s|\n", "Number", "First mark", "Final mark");
        System.out.println("+------+------------+------------+");
        for (int i = 0; i < marks.size(); i++) {
            int mark = marks.get(i);
            System.out.printf("|% 6d|% 12d|% 12d|\n", i, mark, roundMark(mark));
        }
        System.out.println("+------+------------+------------+");
    }

    private <AnswerOutOfBoundsException extends Throwable> void inputMarks() throws AnswerOutOfBoundsException {
        int counter = 1;
        System.out.println("Enter students' marks from 0 to 100: ");
        do {
            try {
                marks.add(Prompts.promptInt(counter + ". ", 0, 100));
                if (!Prompts.promptBoolean("More [n]? ")) {
                    break;
                }
                counter++;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input, try again!");
                input.next();
            }
        } while (true);
    }

    private int roundMark(int mark) {
        if (mark < 37) {
            return mark;
        }
        int dozens = mark / 10;
        int ones = mark % 10;
        if (ones <= 2) {
            ones = 0;
        } else if (ones <= 6) {
            ones = 5;
        } else {
            ones = 10;
        }
        return dozens * 10 + ones;
    }
}