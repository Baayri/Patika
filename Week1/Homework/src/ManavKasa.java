import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double armut = 2.14 ,elma = 3.67 ,domates = 1.11 ,muz = 0.95 ,patlican = 5.0 ,toplam;

        System.out.print("Armut Kac Kilo : ");
        armut *= scanner.nextDouble();

        System.out.print("Elma Kac Kilo : ");
        elma *= scanner.nextDouble();

        System.out.print("Domates Kac Kilo : ");
        domates *= scanner.nextDouble();

        System.out.print("Muz Kac Kilo : ");
        muz *= scanner.nextDouble();

        System.out.print("Patlican Kac Kilo : ");
        patlican *= scanner.nextDouble();

        toplam = armut + elma + domates + muz + patlican;

        System.out.print("Toplam : " + toplam);
    }
}
