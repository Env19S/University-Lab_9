import java.util.Scanner;

public class _3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод массива символов
        System.out.print("Введите массив символов: ");
        String input = scanner.nextLine();
        char[] chars = input.toCharArray();

        // Вопрос a) Определить количество пробелов
        int spaceCount = 0;
        for (char c : chars) {
            if (c == ' ') {
                spaceCount++;
            }
        }
        System.out.println("Количество пробелов: " + spaceCount);

        // Вопрос б) Выяснить, входит ли в последовательность буква, введенная с клавиатуры
        System.out.print("Введите букву для проверки: ");
        char letter = scanner.nextLine().charAt(0);
        boolean containsLetter = false;
        for (char c : chars) {
            if (Character.toLowerCase(c) == Character.toLowerCase(letter)) {
                containsLetter = true;
                break;
            }
        }
        System.out.println("В последовательность " + (containsLetter ? "входит" : "не входит") + " буква " + letter);

        // Вопрос г) Выяснить, имеется ли среди символов пара соседствующих букв "но" или "он"
        boolean hasNoOnPair = false;
        for (int i = 0; i < chars.length - 1; i++) {
            if ((chars[i] == 'н' && chars[i + 1] == 'о') || (chars[i] == 'о' && chars[i + 1] == 'н')) {
                hasNoOnPair = true;
                break;
            }
        }
        System.out.println("Среди символов " + (hasNoOnPair ? "есть" : "нет") + " пара соседствующих букв 'но' или 'он'");

        // Вопрос д) Выяснить, имеется ли среди символов пара соседствующих одинаковых символов
        boolean hasDuplicatePair = false;
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == chars[i + 1]) {
                hasDuplicatePair = true;
                break;
            }
        }
        System.out.println("Среди символов " + (hasDuplicatePair ? "есть" : "нет") + " пара соседствующих одинаковых символов");

        // Вопрос е) Выяснить, верно ли, что существуют такие натуральные і и, что / <<<и и что 5%, совпадает с 5+1, а 5-с 51
        boolean conditionMet = false;
        for (int i = 0; i < chars.length - 3; i++) {
            if (chars[i] == 'і' && chars[i + 1] == ' ' && chars[i + 2] == 'і' && chars[i + 3] == ' ') {
                conditionMet = true;
                break;
            }
        }
        System.out.println("Условие " + (conditionMet ? "выполняется" : "не выполняется") + " для заданных символов");

        scanner.close();
    }
}
