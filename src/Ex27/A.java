package Ex27;

public class A {
    {
        System.out.print("A ");
        B xx = new B();
    }

    public class B {
        private B() {
//            System.out.println("A.B ");
        }
    }

    public static void main(String[] args) {
        B b = new A().new B(); // 1
        B ab = new A().new B(); // 1
        B ba = new A().new B(); // 1
        B bd = new A().new B(); // 1
    }
}