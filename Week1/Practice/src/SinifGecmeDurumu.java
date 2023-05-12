import java.util.Scanner;

public class SinifGecmeDurumu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int matematik, fizik, kimya, turkce, muzik, ortalama;

        System.out.print("Matematik Notu: ");
        matematik = scanner.nextInt();
        if (matematik < 0 || matematik > 100){
            matematik = 0;
        }

        System.out.print("Fizik Notu: ");
        fizik = scanner.nextInt();
        if (fizik < 0 || fizik > 100){
            fizik = 0;
        }

        System.out.print("Kimya Notu: ");
        kimya = scanner.nextInt();
        if (kimya < 0 || kimya > 100){
            kimya = 0;
        }

        System.out.print("Tukce Notu: ");
        turkce = scanner.nextInt();
        if (turkce < 0 || turkce > 100){
            turkce = 0;
        }

        System.out.print("Muzik Notu: ");
        muzik = scanner.nextInt();
        if (muzik < 0 || muzik > 100){
            muzik = 0;
        }

        ortalama = (matematik + fizik + kimya + turkce + muzik) / 5;

        if (ortalama >= 55){
            System.out.println("Gectiniz");
        }
        else {
            System.out.println("Kaldiniz");
        }

        System.out.println("Ortalama : " + ortalama);
    }
}
