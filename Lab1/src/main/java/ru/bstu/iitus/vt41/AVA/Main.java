package ru.bstu.iitus.vt41.AVA;
import java.util.Scanner; // Код для импорта класса Scanner (Scanner находится в пакете java.util)

public class Main
{
    public static void main(String[] args)
    {
        int type = 0;
        int count = 0;
        int flag = 0;
        Scanner scanner = new Scanner(System.in); // Создаём объект Scanner
        do
        {
            System.out.println("Введите количество людей:");
            count = scanner.nextInt();
        }
        while (count <= 0);
        Person[] array = new Person[count];
        for(int i = 0; i < count; i++)
        {
            System.out.println("Введите тип персоны:");
            System.out.println("1 - Студент");
            System.out.println("2 - Школьник");
            System.out.println("3 - Сотрудник");
            System.out.println("4 - Преподаватель");
            System.out.println("5 - Директор");

            do
            {
                try
                {
                    type = scanner.nextInt();
                    if(type < 1 || type > 5)
                        System.out.println("Введите число от 1 до 5!");
                    else
                        break;
                }
                catch (java.util.InputMismatchException ex)
                {
                    System.out.println("Введите число от 1 до 5!");
                    scanner.next();
                }
            }
            while (true);

            Person person = null; // инициализируем null'ом
            switch (type)
            {
                case 1:
                    person = new Student();
                    break;
                case 2:
                    person = new Schoolboy();
                    break;
                case 3:
                    person = new Employee();
                    break;
                case 4:
                    person = new Teacher();
                    break;
                case 5:
                    person = new Director();
                    break;
               /* default:
                    System.out.println("Студент? Хорошо, пусть будет струдент :)"); //Ошибка в выборе типа персоны
                    person = new Student();
                    break;*/
            }
            person.init(scanner);
            System.out.println();
            array[i] = person;
        }
        int minAge = array[0].getAge();
        int index = 0;
        for(int i = 1; i < count; i++)
        {
            if(array[i].getAge() < minAge)
            {
                minAge = array[i].getAge();
                index = i;
            }
        }
        System.out.println("Самый младший человек:\n" + array[index].toString());
        scanner.close();
    }
}