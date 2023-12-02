package Currency;

public class CurrencyConverter {
    private double commission;
    private double exchangeRate;

    // Конструктор для ініціалізації полів
    public CurrencyConverter(double commission, double exchangeRate) {
        this.commission = commission;
        this.exchangeRate = exchangeRate;
    }

    // Метод для конвертації долара в гривню
    private double convertUsdToUah(double amountInUsd) {
        return amountInUsd * exchangeRate;
    }

    // Метод для обрахунку комісії
    private double calculateCommission(double amountInUsd) {
        return amountInUsd * exchangeRate * commission / 100.0;
    }

    // Публічний метод для обрахунку суми до виплати
    public double calculateTotalAmount(double amountInUsd) {
        double amountInUah = convertUsdToUah(amountInUsd);
        double commissionAmount = calculateCommission(amountInUsd);
        return amountInUah - commissionAmount;
    }
}

