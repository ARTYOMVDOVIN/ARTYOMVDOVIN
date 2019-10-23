package ru.bstu.iitus.vt41.AVA;
import java.util.Scanner;

public abstract class Person
{
    private int age;

    public abstract void init(Scanner scanner);

    public int getAge() {
        return age;
    }
    public void setAge(int _age) {
        age = _age;
    }

    public String toString() {
        return "Возраст: " + getAge();
    }
}