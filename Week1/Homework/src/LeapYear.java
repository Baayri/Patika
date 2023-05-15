import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        int year;

        System.out.print("Yıl Giriniz : ");
        year = scanner.nextInt();

        // 100'ün katı olan yıllardan sadece 400'e kalansız olarak bölünebilenler artık yıldır:
        if (year % 100 == 0 && year % 400 == 0){
            System.out.println(year + " bir artık yıldır !");
        }
        // Genel bir kural olarak, artık yıllar 4 rakamının katı olan yıllardır:
        else if (year % 100 != 0 && year % 4 == 0) {
            System.out.println(year + " bir artık yıldır !");
        }
        else {
            System.out.println(year + " bir artık yıldır değildir !");
        }
    }
}
