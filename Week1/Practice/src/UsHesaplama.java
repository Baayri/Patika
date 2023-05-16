import java.util.Scanner;

public class UsHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int k, n, result = 1;

        System.out.print("Üssü Alınacak Sayı : ");
        k = scanner.nextInt();

        System.out.print("Üs Olacak Sayı : ");
        n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            result *= k;
        }

        System.out.println(result);
    }
}
