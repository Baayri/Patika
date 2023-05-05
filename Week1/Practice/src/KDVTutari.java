import java.util.Scanner;

public class KDVTutari {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double tutar, kdvTutari, fiyat;

        System.out.print("Tutar Girin: ");
        tutar = input.nextDouble();

        double kdvOrani = tutar > 0 && tutar <= 1000 ? 0.18 : 0.08;

        kdvTutari = tutar * kdvOrani;
        fiyat = tutar + kdvTutari;

        System.out.println("KDV Orani: " + kdvOrani);
        System.out.println("Tutar: " + tutar);
        System.out.println("KDV Tutari: " + kdvTutari);
        System.out.println("Fiyat: " + fiyat);
    }
}
