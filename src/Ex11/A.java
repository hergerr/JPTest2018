package Ex11;

public class A implements I{
    public static void main(String[] args) {
        new A().m(new B());
    }

    @Override
    public void m(B b) {
        System.out.println(b.j);
    }
}