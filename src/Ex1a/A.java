package Ex1a;

import Ex1b.B;

public class A {
    private B b;
    A(B b) {
        this.b = b;
    }

}

class XD {
    public static void main(String[] args) {
        B lolo = new B();
        A aaa = new A(lolo);
    }
}