import java.util.Scanner;

public class BasamakSayilariToplami {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number, tmp , total = 0;

        System.out.print("Sayı Girin : ");
        number = scanner.nextInt();

        tmp = number;

        while (tmp != 0) {
            total += tmp % 10;
            tmp /= 10;
        }
        System.out.println("Basamak Toplamı : " + total);
    }
}
