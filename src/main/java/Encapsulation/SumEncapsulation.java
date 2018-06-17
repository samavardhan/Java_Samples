package Encapsulation;

public class SumEncapsulation {

    public static void main(String[] args) {
        AccessValue accessValue = new AccessValue();

       accessValue.setVal1(10);
       accessValue.setVal2(20);

       accessValue.setVal3(accessValue.getVal1()+accessValue.getVal2());

       System.out.println(accessValue.getVal3());



    }

}
