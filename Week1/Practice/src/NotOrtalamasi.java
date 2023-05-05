import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int matematik, fizik, kimya, turkce, tarih, muzik;

        System.out.print("Matematik Notu: ");
        matematik = input.nextInt();

        System.out.print("Fizik Notu: ");
        fizik = input.nextInt();

        System.out.print("Kimya Notu: ");
        kimya = input.nextInt();

        System.out.print("Tukce Notu: ");
        turkce = input.nextInt();

        System.out.print("Tarih Notu: ");
        tarih = input.nextInt();

        System.out.print("Muzik Notu: ");
        muzik = input.nextInt();

        int toplam = (matematik + fizik + kimya + turkce + tarih + muzik);

        double ortalama = toplam / 6;

        String sonuc = ortalama >= 60 ? "Sinifi Gecti" : "Sinifta Kaldi";

        System.out.println("Ortalama: " + ortalama + " " + "Durum: " + sonuc);

    }
}
