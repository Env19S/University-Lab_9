public class _5 {
    public static void main(String[] args) {
        String text = "Преобразовать текст. Каждое слово, которое начинается с прописной буквы, но не в начале предложения, заменить на его порядковый номер в предложении.";
        String transformedText = transformText(text);
        System.out.println(transformedText);
    }

    private static String transformText(String text) {
        String[] sentences = text.split("\\.");

        StringBuilder transformedText = new StringBuilder();
        for (String sentence : sentences) {
            String[] words = sentence.trim().split("\\s+");

            for (int i = 0; i < words.length; i++) {
                String word = words[i];

                if (i > 0 && Character.isUpperCase(word.charAt(0))) {
                    words[i] = Integer.toString(i);
                }
            }

            String transformedSentence = String.join(" ", words);
            transformedText.append(transformedSentence).append(". ");
        }

        return transformedText.toString();
    }
}
