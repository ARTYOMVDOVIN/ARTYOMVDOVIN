package ru.bstu.iitus.vt41.AVA;
import java.util.Scanner;

public class Director extends Employee
{
    private String work;

    public void init(Scanner scanner)
    {
        System.out.println("Введите возраст:");
        setAge(scanner.nextInt());
        System.out.println("Введите зарплату:");
        setExperience(scanner.nextInt());
        System.out.println("Место работы:");
        setWork(scanner.next());
    }

    public String getWork() {
        return work;
    }
    public void setWork(String _work) {
        work = _work;
    }

    @Override
    public String toString() {
        return "Тип: Директор\n" + super.toString() + "\nМесто работы:" + getWork();
    }
}