import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _9 {
    public static void main(String[] args) {
        String text = "> Это текст с комментариями. Комментарий... все, Это все ....- комментарий, " +
                "Комментирую... все. > Ж";

        String result = removeComments(text);

        if (result.isEmpty()) {
            System.out.println("В тексте нет комментариев.");
        } else {
            System.out.println("Текст без комментариев:\n" + result);
        }
    }

    private static String removeComments(String text) {
        // Паттерн для поиска комментариев
        Pattern pattern = Pattern.compile("Комментарий\\.\\.\\. все|Это все \\.\\.\\.\\- комментарий|Комментирую\\.\\.\\. все");
        Matcher matcher = pattern.matcher(text);

        // Замена комментариев на пустую строку
        String result = matcher.replaceAll("");

        // Удаление лишних пробелов
        result = result.trim().replaceAll(" +", " ");

        return result;
    }
}
