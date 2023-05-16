import java.util.Scanner;

public class CiftSayilarToplami {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int k, total=0;
        boolean isEven = true;

        while (isEven){
            System.out.print("Sayı Girin : ");
            k = scanner.nextInt();

            if (k % 2 != 0){
                isEven = false;
            }
            if (k % 2 == 0 || k % 4 == 0){
                total += k;
            }
        }

        System.out.println("Total : " + total);
    }
}
