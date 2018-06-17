package Exercise;

public class SumParent extends Declaration {
    public static void main(String[] args) {
        Declaration declaration = new Declaration();
        declaration.setVal1(10);
        declaration.setVal2(20);
        declaration.setVal3(declaration.getVal1()+declaration.getVal2());
        System.out.println(declaration.getVal3());
    }
}
