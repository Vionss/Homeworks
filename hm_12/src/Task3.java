public class Task3 {
    public static void main(String[] args) {
        /*
        Написать метод, принимающий массив целых чисел и число и находящий индекс этого числа(элемента) в массиве.
         Если такой элемент есть, возвращается его индекс, если нет, метод возвращает -1.
В методе main() вывести получившийся результат на экран
         */

        int [] arr = {56, 73, 15, -10, 37, -14, -1, 25, 65, 33, 38};

        System.out.println(findNumber(arr, -1, 6));
    }
    private static int findNumber(int [] arr, int a, int index){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == a && i == index){
                return i;
            }
        }return -1;
    }
}
