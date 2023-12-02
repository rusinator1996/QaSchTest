package Currency;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Вхідні дані
        double commissionRate = 1.0; // 1%
        double exchangeRate = 36.55;

        // Створення об'єкта CurrencyConverter
        CurrencyConverter converter = new CurrencyConverter(commissionRate, exchangeRate);

        // Створення об'єкта Scanner для зчитування суми в доларах
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть суму в доларах: ");
        double amountInUsd = scanner.nextDouble();

        // Обчислення суми до виплати
        double totalAmount = converter.calculateTotalAmount(amountInUsd);

        // Виведення результату на екран
        System.out.printf("Сума до виплати в гривнях: %.2f%n", totalAmount);
    }
}
