import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;

        System.out.print("Sayı Giriniz : ");
        number = scanner.nextInt();

        if (prime(number,2)){
            System.out.println(number + " sayısı ASALDIR !");
        }
        else {
            System.out.println(number + " sayısı ASAL değildir !");
        }
    }

    static boolean prime(int number, int i) {
        if (number <= 2){
            return false;
        }
        else if (number % i == 0){
            return false;
        }
        else if (i * 2 > number) {
            return true;
        }
        else {
            return prime(number, i+1);
        }
    }
}