public class Task2 {
    public static void main(String[] args) {
        /*
        Написать метод, проверяющий содержатся ли в массиве целых чисел 0 или -1. Если да, метод возвращает true,
если нет false.
static boolean checkOnesAndZeros( int[] ints)
В методе main() вывести получившийся результат на экран
         */

        int [] arr = {56, 73, 15, -10, 37, -14, -1, 25, 65, 33, 38};

        System.out.println(includesZeroOrMinusOne(arr));
    }
    private static boolean includesZeroOrMinusOne(int[] ints){
        for (int i = 0; i < ints.length; i++) {
            if(ints[i] == 0 || ints[i] == -1)
                return true;
        }return false;
    }
}
