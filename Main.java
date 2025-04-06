import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Это добавлено в ветке main-dev");

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println("x + y = " + plus(x, y));
        System.out.println("x - y = " + minus(x, y));
        System.out.println("x * y = " + multiplication(x, y));
        System.out.println("x / y = " + division(x, y));
        System.out.println("x ^ y = " + exponentiation(x, y));

        System.out.println("Конец выполнения кода!");
    }
    public static int plus(int x, int y) {
        return x + y;
    }
    public static int minus(int x, int y) {
        return x - y;
    }
    public static int multiplication(int x, int y) {
        return x * y;
    }
    public static  double division(int x, int y) {
        return (double) x / y;
    }
    public static int exponentiation(int x, int y) {
        return (int) Math.pow(x,y);
    }
}
