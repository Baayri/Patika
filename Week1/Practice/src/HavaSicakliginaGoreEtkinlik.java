import java.util.Scanner;

public class HavaSicakliginaGoreEtkinlik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sicaklik;

        System.out.print("Sicaklik : ");
        sicaklik = scanner.nextInt();

        if (sicaklik < 5){
            System.out.println("Kayak yapabilirsin.");
        }
        else if (sicaklik < 15){
            System.out.println("Sinemaya gidebilirsin.");
        }
        else if (sicaklik < 25) {
            System.out.println("Piknik yapabilirsin.");
        }
        else {
            System.out.println("Yüzmeye gidebilirsin.");
        }
    }
}
