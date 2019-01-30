package Ex22;

public class A {
    enum E {
        A("A"), B("B"), C("C");
        String name;

        public String toString() {
            return name;
        }

        E(String name) {
            this.name = name;
        }
    };


    public static void main(String[] args) {
        System.out.println(E.A + E.B.toString() + E.B);
    }
}


