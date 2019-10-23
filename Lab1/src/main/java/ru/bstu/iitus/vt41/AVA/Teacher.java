package ru.bstu.iitus.vt41.AVA;
import java.util.Scanner;

public class Teacher extends Employee
{
    private String certificate;

    public void init(Scanner scanner)
    {
        System.out.println("Введите возраст:");
        setAge(scanner.nextInt());
        System.out.println("Введите стаж:");
        setExperience(scanner.nextInt());
        System.out.println("Введите номер сертификата:");
        setСertificate(scanner.next());
    }

    public String getCertificate() {
        return certificate;
    }
    public void setСertificate(String _certificate) { certificate = _certificate; }

    @Override
    public String toString() {
        return "Тип: Преподаватель\n" + super.toString() + "\nНомер сертификата:" + getCertificate();
    }
}
