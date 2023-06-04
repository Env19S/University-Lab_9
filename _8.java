public class _8 {
    public static void main(String[] args) {
        String text = "Это текст, который нужно зашифровать. Часть букв будет заменена.";

        System.out.println("Исходный текст:");
        System.out.println(text);

        String encryptedText = encryptText(text);
        System.out.println("Зашифрованный текст:");
        System.out.println(encryptedText);

        int encryptedWordsCount = countEncryptedWords(text, encryptedText);
        System.out.println("Количество зашифрованных слов: " + encryptedWordsCount);
    }

    // Метод для шифрования текста
    private static String encryptText(String text) {
        text = text.replaceAll("б", ">");
        text = text.replaceAll("ж", ":");
        text = text.replaceAll("э", "\"");
        text = text.replaceAll("х-", "-)");
        return text;
    }

    // Метод для подсчета количества зашифрованных слов
    private static int countEncryptedWords(String originalText, String encryptedText) {
        String[] originalWords = originalText.split("\\s");
        String[] encryptedWords = encryptedText.split("\\s");

        int count = 0;
        for (int i = 0; i < originalWords.length; i++) {
            if (!originalWords[i].equals(encryptedWords[i])) {
                count++;
            }
        }
        return count;
    }
}
