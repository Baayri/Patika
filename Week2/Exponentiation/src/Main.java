import java.util.Scanner;

public class Main {

    static int pow(int a, int b){

        int result = 1;

        for (int i = 0; i < b; i++) {
            result *= a;
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number, power;

        System.out.print("Taban değeri giriniz : ");
        number = scanner.nextInt();

        System.out.print("Üs değeri giriniz : ");
        power = scanner.nextInt();

        System.out.println("Sonuç : " + pow(number,power));
    }
}
