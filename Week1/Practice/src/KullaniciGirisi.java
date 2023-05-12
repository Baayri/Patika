import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String kullaniciAdi, kullaniciSifre, sifre;

        sifre = "java101";

        System.out.print("Kullanici Adi : ");
        kullaniciAdi = scanner.nextLine();

        System.out.print("Sifre : ");
        kullaniciSifre = scanner.nextLine();

        if (kullaniciAdi.equals("Patika") && kullaniciSifre.equals(sifre)){
            System.out.println("Giris Basarili.");
        }
        else {
            System.out.println("1-Sifre Degistir\n2-Cikis");
            System.out.print("Seciniz : ");
            switch (scanner.nextInt()){
                case 1:
                    System.out.print("Yeni sifre : ");
                    String yeniSifre = scanner.next();
                    if (sifre.equals(yeniSifre)) System.out.println("Sifre olusturulamadi!");
                    else System.out.println("Sifre Basarili bir sekilde degistirildi.");
                    break;
                default:
                    System.out.println("Giris Basarisiz!");
            }
        }
    }
}
