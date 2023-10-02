public class Task3 {
    public static void main(String[] args) {
        /*
        Есть массив целых чисел. Написать программу,
        находящую разницу между значением максимального и минимального элементов. (max - min).
         */
        int[] odd = {26, 32, 37, 75, 13, 29, 75, 3, 38, 92};

        System.out.println(difference(odd));


    }

    public static int difference(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max - min;
    }
}
