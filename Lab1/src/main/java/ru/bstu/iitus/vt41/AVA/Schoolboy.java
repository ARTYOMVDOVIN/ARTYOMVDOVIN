package ru.bstu.iitus.vt41.AVA;
import java.util.Scanner;

public class Schoolboy extends Person
{
    private String login;

    public void init(Scanner scanner)
    {
        System.out.println("Введите возраст:");
        setAge(scanner.nextInt());
        System.out.println("Введите логин дневника:");
        setLogin(scanner.next());
    }

    public String getLogin() { return login; }
    public void setLogin(String _login) { login = _login; }

    @Override
    public String toString() {
        return "Тип: Школьник\n" + super.toString() + "\nЛогин: " + getLogin();
    }
}