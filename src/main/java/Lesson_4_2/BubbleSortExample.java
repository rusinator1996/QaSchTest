package Lesson_4_2;

public class BubbleSortExample {
    public static void main(String[] args) {
        int[] array = {64, 34, 25, 500, 22, 11, 90};

        int n = array.length;

        // Внешний цикл для проходження по елементам масиву
        for (int i = 0; i < n-1; i++) {
            // Внутрішній цикл для порівняння та обміну елементів
            for (int j = 0; j < n-i-1; j++) {
                // Порівняння двох сусідніх елементів
                if (array[j] > array[j+1]) {
                    // Обмін елементів, якщо вони не відсортовані
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        // Виведення відсортованого масиву
        System.out.println("Відсортований масив:");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
