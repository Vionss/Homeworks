public class Task2 {
    /*
    Задан массив целых чисел: 56, 73, 15, -10, 37, -14, 25, 65, 33, 38.
     Найдите максимальный элемент массива и его индекс
     */
    public static void main(String[] args) {


        int [] arr = {56,  15, -10, 37, -14, 25, 65, 755, 33, 38};

        int x = arr[0];
        int pointer = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > x ){
                x = arr[i];
                pointer = i;
            }
        }
        System.out.println("Максимальное значение: " + x + ", с индексом: "+ pointer);
    }
}
