import java.util.Arrays;

public class _12 {
    public static void main(String[] args) {
        String[] strings = {"Привет чю", "Это щю ошибка", "Словоооо", "Многократные    пробелы"};

        System.out.println("Исходный массив строк:");
        printStrings(strings);

        System.out.println("Измененный массив строк:");
        String[] correctedStrings = correctErrors(strings);
        printStrings(correctedStrings);
    }

    // Метод для выполнения автозамены ошибок в массиве строк
    private static String[] correctErrors(String[] strings) {
        String[] corrected = new String[strings.length];
        for (int i = 0; i < strings.length; i++) {
            String correctedString = strings[i];

            // Замена "чю" на "шю"
            correctedString = correctedString.replaceAll("чю", "шю");

            // Замена "щю" на "шю"
            correctedString = correctedString.replaceAll("щю", "шю");

            // Замена 3 и более раз подряд идущих одинаковых букв
            correctedString = correctedString.replaceAll("(.)\\1{2,}", "$1$1");

            // Замена многократных пробелов на одиночные пробелы
            correctedString = correctedString.replaceAll("\\s{2,}", " ");

            corrected[i] = correctedString;
        }
        return corrected;
    }

    // Метод для вывода массива строк на экран
    private static void printStrings(String[] strings) {
        for (String str : strings) {
            System.out.println(str);
        }
        System.out.println();
    }
}
