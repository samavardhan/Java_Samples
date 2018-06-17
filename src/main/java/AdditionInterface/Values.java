package AdditionInterface;

import java.util.Scanner;

public class Values implements SumNumbers {

    private Integer val1, val2, val3;
    Scanner sc = new Scanner(System.in);


    public void inputValue() {
        System.out.println("Enter the values:");
        val1 = sc.nextInt();
        val2 = sc.nextInt();
    }

    public void add() {
        val3 = val1 + val2;
    }

    public void outputDisplay() {

        System.out.println("The output is " + val3);
    }

    public static void main(String[] args) {
        //SumNumbers sumNumbers = new SumNumbers()
        Values values = new Values();
        values.inputValue();
        values.add();
        values.outputDisplay();

    }
}