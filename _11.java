import java.util.Arrays;

public class _11 {
    public static void main(String[] args) {
        String[] strings = {"Hello, World!", "This is a sample text.", "1234567890"};

        // Форматирование 1: Замена символов пунктуации на пробелы
        String[] formatted1 = formatStrings(strings, "[.,!?;:]");
        System.out.println("Форматирование 1:");
        printStrings(formatted1);

        // Форматирование 2: Удаление цифр из строк
        String[] formatted2 = formatStrings(strings, "\\d");
        System.out.println("Форматирование 2:");
        printStrings(formatted2);

        // Форматирование 3: Замена пробелов на дефисы
        String[] formatted3 = formatStrings(strings, "\\s", "-");
        System.out.println("Форматирование 3:");
        printStrings(formatted3);
    }

    // Метод для форматирования массива строк с помощью регулярного выражения
    private static String[] formatStrings(String[] strings, String regex) {
        String[] formatted = new String[strings.length];
        for (int i = 0; i < strings.length; i++) {
            formatted[i] = strings[i].replaceAll(regex, " ");
        }
        return formatted;
    }

    // Перегруженный метод для форматирования массива строк с помощью регулярного выражения и замены
    private static String[] formatStrings(String[] strings, String regex, String replacement) {
        String[] formatted = new String[strings.length];
        for (int i = 0; i < strings.length; i++) {
            formatted[i] = strings[i].replaceAll(regex, replacement);
        }
        return formatted;
    }

    // Метод для вывода массива строк на экран
    private static void printStrings(String[] strings) {
        for (String str : strings) {
            System.out.println(str);
        }
        System.out.println();
    }
}
