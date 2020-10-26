import java.util.Scanner;

public class Test {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double x = in.nextDouble();
        double y = in.nextDouble();
        System.out.println (y < 2 - x * x && y > x ? "YES": "NO");
    }
}