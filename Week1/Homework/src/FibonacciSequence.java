import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count, instant = 1, prev = 0, value;

        System.out.print("Eleman Sayısı : ");
        count = scanner.nextInt();

        System.out.print("0 1 ");

        for (int i = 2; i < count; i++) {
            value = prev + instant;
            System.out.print(value + " ");

            prev = instant;
            instant = value;
        }
    }
}
