package Exercise;

import java.time.LocalDate;

public class Person {
    private final String email;
    private final String fullName;
    private final char sex;
    private final double debt;
    private final LocalDate date;

    public Person(String email, String fullName, char sex, double debt, LocalDate date) {
        this.email = email;
        this.fullName = fullName;
        this.sex = sex;
        this.debt = debt;
        this.date = date;
    }

    public String getEmail() {
        return email;
    }

    public String getFullName() {
        return fullName;
    }

    public char getSex() {
        return sex;
    }

    public double getDebt() {
        return debt;
    }

    public LocalDate getDate() {
        return date;
    }
}
