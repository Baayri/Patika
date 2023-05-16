import java.util.Scanner;

public class HarmonikSayilar {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int n;
        double result = 0;

        System.out.print("Sayı Girin : ");
        n = scanner.nextInt();

        for (double i = 1; i <= n; i++){
            result += (1/i);
        }
        System.out.println(result);
    }
}
