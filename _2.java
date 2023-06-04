import java.util.Scanner;

public class _2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String binaryNumber;
        boolean validInput = false;

        // Повторяем ввод, пока число не будет введено верно
        while (!validInput) {
            System.out.print("Введите число в двоичной системе счисления: ");
            binaryNumber = scanner.nextLine();

            if (isValidBinaryNumber(binaryNumber)) {
                validInput = true;
                String decimalNumber = convertBinaryToDecimal(binaryNumber);
                String base13Number = convertDecimalToBase13(decimalNumber);

                System.out.println("Число в 13-й системе счисления: " + base13Number);
            } else {
                System.out.println("Неверный ввод! Число должно состоять только из символов 0 и 1.");
            }
        }
    }

    // Метод для проверки правильности ввода числа в двоичной системе
    private static boolean isValidBinaryNumber(String binaryNumber) {
        for (char c : binaryNumber.toCharArray()) {
            if (c != '0' && c != '1') {
                return false;
            }
        }
        return true;
    }

    // Метод для перевода числа из двоичной системы в десятичную
    private static String convertBinaryToDecimal(String binaryNumber) {
        return Integer.parseInt(binaryNumber, 2) + "";
    }

    // Метод для перевода числа из десятичной системы в 13-ю
    private static String convertDecimalToBase13(String decimalNumber) {
        int decimal = Integer.parseInt(decimalNumber);
        StringBuilder base13Number = new StringBuilder();

        while (decimal > 0) {
            int remainder = decimal % 13;
            base13Number.insert(0, remainder);
            decimal /= 13;
        }

        return base13Number.toString();
    }
}

