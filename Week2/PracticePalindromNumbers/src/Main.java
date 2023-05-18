public class Main {

    static String isPalindrom(int number) {
        int temp = number, reverseNumber = 0, lastNumber;

        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }

        if (number == reverseNumber) {
            return number + " palindrom";
        }
        else {
            return number + " palindrom değil";
        }

    }
    public static void main(String[] args) {
        System.out.println(isPalindrom(1001));
    }
}