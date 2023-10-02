import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        /*
        Реализуйте метод, который заполняет массив случайными буквами. Размер массива подается на вход методу
         */

generateRandomLettersArray(15);
    }

    public static char[] generateRandomLettersArray(int size) {
        Random random = new Random();
        char[] randomLetters = new char[size];

        for (int i = 0; i < size; i++) {
            // Генеруємо випадкову букву від 'a' до 'z'
            randomLetters[i]= (char) (random.nextInt(26) + 'a');
        }
        for (char letter : randomLetters) {
            System.out.print(letter + " ");
        }
        return randomLetters;
    }
}
