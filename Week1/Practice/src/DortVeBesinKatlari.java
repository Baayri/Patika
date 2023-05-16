import java.util.Scanner;

public class DortVeBesinKatlari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int k;

        System.out.print("Sayı Girin : ");
        k = scanner.nextInt();

        for (int i = 1; i < k; i*=4) {
            System.out.println(i);
        }

        for (int i = 1; i < k; i*=5) {
            System.out.println(i);
        }
    }
}
