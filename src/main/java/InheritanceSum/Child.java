package InheritanceSum;

public class Child extends Parent {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.setVal1(10);
        parent.setVal2(20);
        parent.setVal3(parent.getVal1()+parent.getVal2());

        System.out.println(parent.getVal3());


    }
}
