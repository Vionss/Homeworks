public class Task2 {
    public static void main(String[] args) {
        /*
        Есть массив из 10 целых чисел.
         Написать программу, находящую количество четных чисел в нем
         */

        int [] odd = {26, 32, 37,75,13,29,75,3,38,92};

        System.out.println(oddNumbers(odd));
    }
    public static String oddNumbers(int [] arr){
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0){
                counter++;
            }
        }return "Количество четных чисел " + counter;
    }
}
