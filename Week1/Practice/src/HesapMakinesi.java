import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int secim;
        double sayi1, sayi2;

        System.out.print("1. Sayıyı Girin : ");
        sayi1 = scanner.nextDouble();

        System.out.print("1. Sayıyı Girin : ");
        sayi2 = scanner.nextDouble();

        System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");

        System.out.print("Seciniz : ");
        secim = scanner.nextInt();

        switch (secim){
            case 1:
                System.out.println("Toplama : " + (sayi1 + sayi2));
                break;
            case 2:
                System.out.println("Cikarma : " + (sayi1 - sayi2));
                break;
            case 3:
                System.out.println("Carpma : " + (sayi1 * sayi2));
                break;
            case 4:
                if (sayi2 == 0) System.out.println("Bir sayi 0 a bolunemez");
                else System.out.println("Bolme : " + (sayi1 / sayi2));
                break;
            default:
                System.out.println("Hatali secim yaptiniz.");
        }

    }
}
