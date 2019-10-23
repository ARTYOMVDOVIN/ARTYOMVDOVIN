package ru.bstu.iitus.vt41.AVA;
import java.util.Scanner;

public class Student extends Person
{
    private int recordNumber;

    public void init(Scanner scanner)
    {
        System.out.println("Введите возраст:");
        setAge(scanner.nextInt());
        System.out.println("Введите номер зачётной книжки:");
        setRecordNumber(scanner.nextInt());
    }

    public int getRecordNumber() {
        return recordNumber;
    }
    public void setRecordNumber(int _recordNumber) {
        recordNumber = _recordNumber;
    }

    @Override
    public String toString() { return "Тип: Студент\n" + super.toString() + "\nНомер зачётной книжки: " + getRecordNumber(); }
}
