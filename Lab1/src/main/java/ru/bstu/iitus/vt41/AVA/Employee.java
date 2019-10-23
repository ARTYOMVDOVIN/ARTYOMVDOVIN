package ru.bstu.iitus.vt41.AVA;
import java.util.Scanner;

public class Employee extends Person
{
    private int experience;

    public void init(Scanner scanner)
    {
        System.out.println("Введите возраст:");
        setAge(scanner.nextInt());
        System.out.println("Введите стаж:");
        setExperience(scanner.nextInt());
    }

    public int getExperience() {
        return experience;
    }
    public void setExperience(int _experience) {
        experience = _experience;
    }

    @Override
    public String toString() {
        return "Тип: Сотрудник\n" + super.toString() + "\nСтаж: " + getExperience();
    }
}
