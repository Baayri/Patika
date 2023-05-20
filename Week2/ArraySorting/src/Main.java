import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizinin boyutu n : ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        System.out.println("Dizinin elemanlarını giriniz :");

        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". Eleman : ");
            numbers[i] = scanner.nextInt();
        }

        Arrays.sort(numbers);

        System.out.print("Sıralama : ");

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}