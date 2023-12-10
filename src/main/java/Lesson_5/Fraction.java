package Lesson_5;

import java.util.Scanner;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    // Перевизначення методу equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Перевірка на той самий об'єкт
        if (obj == null || getClass() != obj.getClass()) return false; // Перевірка на клас і null

        Fraction fraction = (Fraction) obj;

        // Перевірка чисельників і знаменників
        return numerator * fraction.denominator == fraction.numerator * denominator;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Зчитування першого дробу
        System.out.print("Введіть чисельник першого дробу: ");
        int numerator1 = scanner.nextInt();
        System.out.print("Введіть знаменник першого дробу: ");
        int denominator1 = scanner.nextInt();
        Fraction fraction1 = new Fraction(numerator1, denominator1);

        // Зчитування другого дробу
        System.out.print("Введіть чисельник другого дробу: ");
        int numerator2 = scanner.nextInt();
        System.out.print("Введіть знаменник другого дробу: ");
        int denominator2 = scanner.nextInt();
        Fraction fraction2 = new Fraction(numerator2, denominator2);

        // Перевірка рівності дробів та виведення результату
        boolean result = fraction1.equals(fraction2);
        System.out.println("Результат порівняння: " + result);
    }
}
