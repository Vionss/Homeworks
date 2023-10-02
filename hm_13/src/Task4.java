public class Task4 {
    public static void main(String[] args) {
        /*
        Написать метод, возвращающий минимальный и максимальный элемент из поданного ему на вход массива целых чисел.
         */

        int [] arr = {56,-14, 73, 15, -10, 37,  -1, 25, 65, 33, 38};
        int [] result = maxAndMin(arr);
        System.out.println(result[0] + " " +result[1]);

    }
    private static int [] maxAndMin(int [] arr){
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return new int [] {min, max};
    }
}
