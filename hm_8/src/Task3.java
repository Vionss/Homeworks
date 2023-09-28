import java.util.Random;

public class Task3 {
    /*
    Создайте массив из 20 случайных целых чисел в интервале от 10 до 20. Выведите массив на печать.
     Поменяйте местами первый и последний элементы массива и снова выведите массив на печать.
     */
    public static void main(String[] args) {

        int[] randomArray = new int[20]; // Створюємо масив із 20 елементів
        Random random = new Random();
        // Заповнюємо масив випадковими числами в інтервалі від 10 до 20
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(11) + 10; // Генеруємо випадкове число від 10 до 20
        }
        // Виводимо масив на екран
        for (int number : randomArray) {
            System.out.print(number + " ");
        }

        int first =  randomArray[0];
        randomArray[0] = randomArray [randomArray.length -1];
       randomArray[randomArray.length -1] = first;

        System.out.println();
        System.out.println("swapped");

        for (int number : randomArray) {
            System.out.print(number + " ");
        }






    }
}
