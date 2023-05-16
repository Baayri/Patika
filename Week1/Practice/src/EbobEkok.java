import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1, n2, i=1, ebob=1, ekok=1;

        System.out.print("N1 Sayısını Girin : ");
        n1 = input.nextInt();
        System.out.print("N2 Sayısını Girin : ");
        n2 = input.nextInt();

        while(i <= n1){
            if(n1 % i == 0 && n2 % i == 0){
                ebob = i;
            }
            i++;
        }
        System.out.println("Ebob : " + ebob);


        while(i<=n1*n2){
            if(i % n1 == 0 && i % n2 == 0){
                ekok = i;
                break;
            }
            i++;
        }
        System.out.print("Ekok : " + ekok);
    }
}
