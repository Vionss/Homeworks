public class Task3 {
    public static void main(String[] args) {

        /*
        Написать метод, принимающий массив целых чисел, и печатающий его в обратном порядке.
         Сначала последний элемент, потом предпоследний, и т. д.
         */

        int[] arr = {56, 73, 15, -10, 37, -14, 25, 65, 33, 38};

        reverseArray(arr);


    }

    public static int[] reverseArray(int[] arr) {

        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[arr.length - 1 - i];
        }
        System.out.print("Reversed Array: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
        return result;
    }
}
