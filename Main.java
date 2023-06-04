public class Main {

    public static void main(String[] args) {

        char[][] matrix = {{'a', '.', 'b', ','},

                {'c', 'd', '!', 'e'},

                {'f', '?', 'g', 'h'}};

        int n = matrix.length;

        int m = matrix[0].length;

// Поиск знаков препинания по строкам

        for (int i = 0; i < n; i++) {

            int count = 0;

            for (int j = 0; j < m; j++) {

                if (matrix[i][j] == '.' || matrix[i][j] == ',' || matrix[i][j] == '!' || matrix[i][j] == '?') {

                    count++;

                }

            }

            System.out.println("В строке " + i + " найдено " + count + " знаков препинания");

        }

// Поиск знаков препинания по столбцам

        for (int j = 0; j < m; j++) {

            int count = 0;

            for (char[] chars : matrix) {

                if (chars[j] == '.' || chars[j] == ',' || chars[j] == '!' || chars[j] == '?') {

                    count++;

                }

            }

            System.out.println("В столбце " + j + " найдено " + count + " знаков препинания");

        }

    }

}
