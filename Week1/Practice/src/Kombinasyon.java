import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n, r, nFact = 1, rFact = 1, nrFact = 1, result;

        System.out.print("n : ");
        n = scanner.nextInt();

        System.out.print("r : ");
        r = scanner.nextInt();

        for (int i = n; i >= 1; i--) {
            nFact *= i;
        }

        for (int i = r; i >= 1; i--) {
            rFact *= i;
        }

        for (int i = (n-r); i >= 1; i--) {
            nrFact *= i;
        }

        result = nFact / (rFact * nrFact);

        System.out.println("Kombinasyon : " + result);
    }
}
