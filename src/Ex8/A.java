package Ex8;

class A {
    String s = "A";

    void n() {
        System.out.print(s + "A.n ");
    }

    void m() {
        System.out.print(s + "A.m ");
    }

    public static void main(String[] args) {
        A a1 = new C(), a2 = new D();
        a1.m();
        a2.m();
    }
}

class B extends A {
    String s = "B";

    void n() {
        System.out.print(s + "B.n ");
    }

    void m() {
        n();
    }
}

class C extends A {
    String s = "C";

    void m() {
        super.m();
    }
}

class D extends B {
    String s = "D";

    void m() {
        super.m();
    }
}