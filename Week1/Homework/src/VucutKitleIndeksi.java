import java.util.Scanner;

public class VucutKitleIndeksi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double boy, kilo, vucutKitleIndexi;

        System.out.print("Lutfen boyunuzu (metre cinsinde) giriniz: ");
        boy = input.nextDouble();

        System.out.print("Lutfen kilonuzu giriniz: ");
        kilo = input.nextDouble();

        vucutKitleIndexi = kilo / (boy * boy);

        System.out.println("Vucut Kitle Indeksiniz: " + vucutKitleIndexi);

    }
}
