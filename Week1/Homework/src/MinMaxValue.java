import java.util.Scanner;

public class MinMaxValue {

    /*Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları
    bulan ve bu sayıları ekrana yazan programı yazın.*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count, number, i = 1, min = 0, max = 0;

        System.out.print("Kaç tane sayı gireceksiniz : ");
        count = scanner.nextInt();

        while (i <= count){
            System.out.print(i + ". Sayıyı giriniz : ");
            number = scanner.nextInt();

            // ilk gelen sayı hem min hem max kabul edilir.
            if (i == 1){
                min = number;
                max = number;
            }
            else {
                // yeni gelen sayı min değerden küçük ise yeni min olur.
                if (number < min){
                    min = number;
                }

                // yeni gelen sayı max değerden büyük ise yeni max olur.
                if (number > max){
                    max = number;
                }
            }
            i++;
        }

        System.out.println("Min : " + min);
        System.out.println("Max : " + max);
    }
}
