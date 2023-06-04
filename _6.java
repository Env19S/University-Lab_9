//Программа с регламентированным вводом данных по аудиториям:
import java.util.Scanner;

public class _6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество аудиторий: ");
        int count = scanner.nextInt();
        scanner.nextLine(); // Очистка буфера

        String[] auditoriums = new String[count];

        for (int i = 0; i < count; i++) {
            System.out.println("Введите информацию об аудитории " + (i + 1) + ":");
            System.out.print("Адрес: ");
            String address = scanner.nextLine();
            System.out.print("Корпус: ");
            String building = scanner.nextLine();
            System.out.print("Номер аудитории: ");
            String roomNumber = scanner.nextLine();
            System.out.print("Тип аудитории: ");
            String roomType = scanner.nextLine();
            System.out.print("Количество посадочных мест: ");
            int seats = scanner.nextInt();
            scanner.nextLine(); // Очистка буфера
            System.out.print("Наличие мультимедийного оборудования (да/нет): ");
            boolean hasMultimedia = scanner.nextLine().equalsIgnoreCase("да");
            System.out.print("Наличие компьютеров (да/нет): ");
            boolean hasComputers = scanner.nextLine().equalsIgnoreCase("да");
            int computerCount = 0;
            if (hasComputers) {
                System.out.print("Количество компьютеров: ");
                computerCount = scanner.nextInt();
                scanner.nextLine(); // Очистка буфера
            }
            System.out.print("Принадлежность факультету: ");
            String faculty = scanner.nextLine();
            System.out.print("Принадлежность кафедре: ");
            String department = scanner.nextLine();
            System.out.print("Ответственное лицо: ");
            String responsiblePerson = scanner.nextLine();

            // Сохранение информации об аудитории
            auditoriums[i] = address + ": " + building + " " + roomNumber + ", " + roomType +
                    ", " + seats + " мест, Мультимедия: " + hasMultimedia + ", Компьютеры: " +
                    hasComputers + " (" + computerCount + " шт.), Факультет: " + faculty +
                    ", Кафедра: " + department + ", Ответственное лицо: " + responsiblePerson;

            System.out.println();
        }

        // Выполнение необходимых действий с данными аудиторий
        // ...

        // Вывод информации
        System.out.println("Аудитории для самостоятельной работы студентов по факультетам:");
        // Вывод количества аудиторий для самостоятельной работы студентов по факультетам
        // ...

        System.out.println("Аудитории для самостоятельной работы студентов по корпусам:");
        // Вывод количества аудиторий для самостоятельной работы студентов по корпусам
        // ...

        System.out.println("Лекционные аудитории по факультетам без мультимедийного оборудования, " +
                "в которых более 60 посадочных мест:");
        // Вывод количества лекционных аудиторий по факультетам без мультимедийного оборудования,
        // в которых более 60 посадочных мест
        // ...
    }
}
