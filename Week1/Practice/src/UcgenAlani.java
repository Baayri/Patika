import java.util.Scanner;

public class UcgenAlani {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b, c;
        double u, alan;

        System.out.print("1.Kenar Uzunlugu: ");
        a = input.nextInt();
        System.out.print("2.Kenar Uzunlugu: ");
        b = input.nextInt();
        System.out.print("3.Kenar Uzunlugu: ");
        c = input.nextInt();

        u = (a + b + c) / 2;
        alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.println("Alan: " + alan);



    }
}
