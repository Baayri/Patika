public class Main {

    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[]  numbers = {10, 20, 20, 10, 10, 20, 5, 20, 40, 10};
        int[] duplicate = new int [numbers.length];
        int count, startIndex = 0;

        for (int i = 0; i < numbers.length; i++) {
            count = 1;
            for (int j = 0; j < numbers.length; j++) {
                if (i != j && numbers[i] == numbers[j]){

                    count += 1;
                }
            }
            if (!isFind(duplicate, numbers[i])) {
                duplicate[startIndex++] = numbers[i];
                System.out.println(numbers[i] + " sayısı " + count + " kere tekrar edildi.");
            }
        }
    }
}