import java.util.Scanner;

public class DaireAlani {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int yaricap, alfa;
        double cevre, alan, dilimAlan, pi = 3.14;

        System.out.print("Yariçap: ");
        yaricap = input.nextInt();

        System.out.print("Daire diliminin merkez acisi: ");
        alfa = input.nextInt();

        cevre = 2 * pi * yaricap;
        alan = pi * yaricap * yaricap;
        dilimAlan = (pi * (yaricap * yaricap) * alfa) / 360;

        System.out.println("Cevre: " + cevre);
        System.out.println("Alan: " + alan);
        System.out.println("Dilim Alani: " + dilimAlan);

    }
}
