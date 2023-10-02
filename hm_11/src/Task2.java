public class Task2 {
    public static void main(String[] args) {
        /*
        Реализуйте метод sumOfArray (сумма элементов массива),
        который получает на вход массив и определяет сумму его элементов.
         */
int [] arr = {56, 73, 15, -10, 37, -14, 25, 65, 33, 38};

        System.out.println(sumOfArray(arr));

    }
    public static int sumOfArray(int [] arr){
        int sum = 0 ;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
}
