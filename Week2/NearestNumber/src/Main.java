import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] list = {56, 34, 1, 8, 101, -2, -33};

        int minClose = 0, maxClose = 0;

        System.out.println("Dizi : " + Arrays.toString(list));

        Arrays.sort(list);

        System.out.print("Girilen Sayı : ");
        int number = scanner.nextInt();

        for (int i = 0; i < list.length; i++) {
            if (list[i] < number){
                minClose = list[i];
            }
        }

        for (int i = list.length - 1; i >= 0; i--) {
            if (list[i] > number){
                maxClose = list[i];
            }
        }

        System.out.println("Küçük En Yakın : " + minClose);
        System.out.println("Büyük En Yakın : " + maxClose);
    }
}