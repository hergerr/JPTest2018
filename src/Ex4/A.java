package Ex4;

public class A {
    public String s = "A";
    {
        s = s + "1";
    }

    public A() {
        s = s + "2";
    }



    public static void main(String[] args) {
        System.out.println(new A().s);
    }
}