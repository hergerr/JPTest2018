package Ex10;

public class A {
    public static void main(String[] args) {
        Integer[][] t = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; // 1
        for (Object i : t) { // 2
            System.out.print(((Integer[]) i)[1]); // 3
        }

//        float x = 1.4f;
//        int u = (int)x;
    }
}
