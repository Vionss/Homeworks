public class Task_1 {
    //Написать программу, выводящую на экран максимальное из трех целых чисел.
    // Числа задайте самостоятельно внутри программы.
    // Решите эту задачу с помощью if ... else и также с помощью тернарного оператора.
    public static void main(String[] args) {

        System.out.println(findMaxIntTer(6161, 3224, 11172));

        int x = 1131;
        int q = 711;

        int max = (x > q) ? x:q;
        System.out.println(max);

    }

    public static int maxInt(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
           return b;
        } else {
            return c;
        }
    }

    public static int findMaxIntTer(int a, int b, int c){
        return (a > b && a > c) ? a :((b >= a && b >= c) ? b : c);
    }
}