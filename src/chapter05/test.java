package chapter05;

public class test {

    public static void main(String[] args) {
        demo(4);
    }

    private static void demo(int num) {
        if (2 < num) {
            demo(num - 1);
        } else {
            System.out.println("num = " + num);
        }
    }

}
