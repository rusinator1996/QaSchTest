package Lesson_4_1;

public class EquilateralTriangleExample {
    public static void main(String[] args) {
        int height = 5; // Висота рівностороннього трикутника

        // Виведення рівностороннього трикутника з використанням двох циклів for
        System.out.println("Рівносторонній трикутник за допомогою двох циклів for:");
        for (int i = 0; i < height; i++) {
            // Пробіли для вирівнювання
            for (int j = height - i - 1; j > 0; j--) {
                System.out.print(" ");
            }

            // Зірочки для виведення трикутника
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Виведення рівностороннього трикутника з використанням циклу while
        System.out.println("\nРівносторонній трикутник за допомогою циклу while:");
        int i = 0;
        while (i < height) {
            int j = height - i - 1;
            // Пробіли для вирівнювання
            while (j > 0) {
                System.out.print(" ");
                j--;
            }

            // Зірочки для виведення трикутника
            j = 0;
            while (j < 2 * i + 1) {
                System.out.print("*");
                j++;
            }

            System.out.println();
            i++;
        }
    }
}

