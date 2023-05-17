import java.util.Scanner;

public class PerfectNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number, total = 0;

        System.out.print("Bir Sayı Girin : ");
        number = scanner.nextInt();

        for (int i = 1; i < number; i++) {
            if (number % i == 0){
                total += i;
            }
        }

        if (number == total){
            System.out.println(number + " Mükemmel sayıdır");
        }
        else {
            System.out.println(number + " Mükemmel sayı değildir");
        }
    }
}
