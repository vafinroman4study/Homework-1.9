public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    // Объявить метод «сгенерироватьМассив»
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int totalSum = 0;
        for (int i : arr) {
            totalSum += i;
        }

        System.out.printf("Сумма трат за месяц составила %d руб.", totalSum);
        System.out.println();
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        int minVal = 200_000;
        int maxVal = 0;
        for (final int current : arr) {
            if (minVal > current){
                minVal = current;
            } else if (maxVal < current) {
                maxVal = current;
            }
        }

        System.out.printf("Минимальная сумма трат за день составила %d руб. " +
                "Максимальная сумма трат за день составила %d руб.",
                minVal, maxVal);
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        double totalSum = 0;
        for (int i : arr) {
            totalSum += i;
        }

        double avgVal = totalSum / arr.length;
        System.out.printf("Средняя сумма трат за месяц составила %.2f руб.", avgVal);
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i=reverseFullName.length -1; i>=0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
    }
}