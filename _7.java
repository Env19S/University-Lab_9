public class _7 {
    public static void main(String[] args) {
        String text = "В заданной строке посчитать количество слов, которые начинаются на символ «б» и " +
                "заканчиваются на «ться» или «тся». Разделителями слов считаются пробелы.";
        int count = countWordsStartingWithAndEndingWith(text, 'б', "ться", "тся");
        System.out.println("Количество слов, начинающихся на 'б' и заканчивающихся на 'ться' или 'тся': " + count);
    }

    private static int countWordsStartingWithAndEndingWith(String text, char startChar, String ending1, String ending2) {
        String[] words = text.split("\\s+");
        int count = 0;

        for (String word : words) {
            if (word.startsWith(String.valueOf(startChar)) && (word.endsWith(ending1) || word.endsWith(ending2))) {
                count++;
            }
        }

        return count;
    }
}
