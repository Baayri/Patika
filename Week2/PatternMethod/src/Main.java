import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N Sayısı : ");
        int n = scanner.nextInt();

        System.out.print("Çıktısı : ");
        pattern(n);
    }

    static void pattern(int number) {
        System.out.print(number + " ");

        if (number <= 0) {
            return;
        }

        pattern(number - 5);

        System.out.print(number + " ");
    }
}