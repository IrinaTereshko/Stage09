import java.util.Scanner;

public class InputOutput {

    public static int input(String msg) {
        System.out.print(msg);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();

    }

    public static double inputDouble(String msg) {
        System.out.print(msg);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();

    }
    public static void output(String msg) {
        System.out.print(msg);
    }


}
