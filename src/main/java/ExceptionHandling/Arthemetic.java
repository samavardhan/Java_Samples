package ExceptionHandling;

public class Arthemetic {

    public static void main(String[] args) {

        try{
            int a = 30;
            int b = 0;
            int c = a/b;
            System.out.println("Result: " +c);
        }
        catch (ArithmeticException e){
            System.out.println("Error");
        }

    }


}
