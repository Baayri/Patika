import java.util.Scanner;

public class UcakBiletiFiyati {

    /*Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir. +
    Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır. +
    Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır. +
    Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
    Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age, passengerType;
        boolean isError = false;
        double distance, ageDiscount = 0, passengerTypeDiscount, price, totalPrice;

        System.out.print("Mesafe : ");
        distance = scanner.nextDouble();

        System.out.print("Yaş : ");
        age = scanner.nextInt();

        System.out.print("1-Tek Yön\n2-Gidiş-Dönüş\nSeçin : ");
        passengerType = scanner.nextInt();

        price = distance * 0.10;

        if (age > 0 && age <=12){
            ageDiscount = price * 0.50;
        } else if (age > 12 && age <=24) {
            ageDiscount = price * 0.10;
        } else if (age > 65) {
            ageDiscount = price * 0.30;
        }

        if (distance > 0 && age > 0){
            switch (passengerType){
                case 1:
                    totalPrice = price - ageDiscount;
                    System.out.println("Toplam Tutar : " + totalPrice + " TL");
                    break;
                case 2:
                    price = (price - ageDiscount);
                    passengerTypeDiscount = price * 0.20;
                    totalPrice =  (price - passengerTypeDiscount) * 2;
                    System.out.println("Toplam Tutar : " + totalPrice + " TL");
                    break;
                default:
                    System.out.println("Hatalı Veri Girdiniz!");
            }
        }
        else {
            System.out.println("Hatalı Veri Girdiniz!");
        }
    }
}
