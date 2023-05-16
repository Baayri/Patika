import java.util.Scanner;

public class TamBolunenSayilarinOrtalamasi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int k, index = 0, average = 0;

        System.out.print("Sayı Giriniz : ");
        k = scanner.nextInt();

        for (int i = 1; i < k; i++) {
            if (i % 3 == 0 && i % 4 == 0){
                average += i;
                index += 1;
            }
        }

        if (index == 0){
            System.out.println(average);
        }
        else {
            average = average / index;
            System.out.println(average);
        }

    }
}
