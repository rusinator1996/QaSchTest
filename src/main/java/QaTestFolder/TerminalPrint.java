package QaTestFolder;

import com.github.javafaker.Faker;

public class TerminalPrint {
    public static void main(String[] args) {
System.out.println(Faker.instance().internet().emailAddress());
    }
}
