import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /*
        Реализовать метод, выводящий на экран все делители введенного пользователем целого числа.
         Вернуть массив со всеми делителями числа.
         */
        Scanner scanner = new Scanner(System.in);
        findAllDividers(scanner);

    }
    private static int[] findAllDividers(Scanner scanner){
        int counter = 0;
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                counter++;
            }
        }
        int index = 0;
        int [] dividers = new int[counter];
        for (int i = 1; i <= number; i++) {
            if(number % i == 0){
                dividers[index] = i;
                index++;
            }
        }
        System.out.print("[");
        for(int n : dividers){
            System.out.print( n +", ");
        }
        System.out.print("]");
        return dividers;
    }
}
