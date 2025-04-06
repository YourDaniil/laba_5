import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Это добавлено в ветке main");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
    }
    public static int plus(int x, int y) {
        return x + y;
    }
    public static int minus(int x, int y) {
        return x - y;
    }
}
