package Ex18;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

class C implements Comparator<Integer> { // 1
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1-o2;
    }
}

public class A extends C {
    public static void main(String[] args) {
        List<Integer> l = new LinkedList<>(); // 2
        l.add(1);
        l.add(2);
        l.add(4);
        l.add(3);
        Collections.sort(l,new C()); // 3
        System.out.println(l);
    }
}