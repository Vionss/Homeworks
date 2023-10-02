import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        /*
        Имеется массив данных - остатки на счетах клиентов банка
         (задать случайными числами в интервале от 10 000 до 100 000000 д.е.,
        количество клиентских счетов = 20). Произошла деноминация, теперь 1 д.е = 100 старых д.е.
        Рассчитайте новые остатки денег на счетах клиентов.
         */

        int[] randomArray = new int[20]; // Створюємо масив із 20 елементів
        Random random = new Random();
        // Заповнюємо масив випадковими числами в інтервалі від 10 до 20
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(9000) + 1000; // Генеруємо випадкове число від 10 до 20
        }
        // Виводимо масив на екран
        for (int number : randomArray) {
            System.out.print(number + " ");
        }

        System.out.println();
        System.out.println("after denamination");
        denomination(randomArray);
    }
     private static void denomination(int [] arr){

        double [] newAccountBalance = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newAccountBalance[i] = arr[i] / 100.0;
        }
        for (double number : newAccountBalance) {
            System.out.print(number + " ");

        }
    }
}
