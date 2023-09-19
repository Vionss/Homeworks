public class Main {
    public static void main(String[] args) {

        // 1 Есть строка четной длины. Написать программу, выводящую на экран первую половину этой строки.
        //Пример: есть Hell , результат He

        String a = "Hell";
        System.out.println(a.substring(0,2));

        //2 Есть две переменные целого типа. Написать программу,
        // выводящую на экран true если значение одной из переменных = 10
        // или сумма значений переменных равна 10. Иначе на экран выводится false.
        //Пример: int a = 10, int b = 9 -> true
        //int a = 1 , int b = 9 -> true
        //int a = 4 , int b = 10 -> true
        //int a = 4 , int b = 3 -> false

        int q = 1;
        int e = 4;

        boolean example = q == 10 || e == 10 || q+e == 10;
        System.out.println(example);

    }
}
