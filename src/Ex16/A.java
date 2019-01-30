package Ex16;

import java.util.ArrayList;
import java.util.List;

class C extends B {
}

class B extends A {
}

class D extends B{

}

public class A {
    public static void m(List<? extends B> l) { // 0
        List<? extends B> lx = new ArrayList<>();

//        l.add(new A()); // 1
//        lx.add(new D()); // 2
//        l.add(new C()); // 3
    }
}