public class BubbleSort {

    public static void main(String[] args) {
        int temp;
        int numbers[] = { 12, 11, 16, 15, 18 };

        for (int i = 0; i < numbers.length - 1; i++) {
            System.out.println(numbers[i] + "i");
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                System.out.println(numbers[j] + "j");
                if (numbers[j] > numbers[j + 1]) {
                    temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;

                }
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

    }
}
