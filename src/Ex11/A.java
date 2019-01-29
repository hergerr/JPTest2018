package Ex11;

public class A {
    public static void main(String[] args) {
        new A().m(new B());
    }

//    @Override
    public void m(B b) {
        System.out.println(b.j);
    }
}