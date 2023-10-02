public class Task1 {
    public static void main(String[] args) {
        /*
        Написать программу, вычисляющую факториал числа 5.
Факториал числа - это произведение всех целых чисел от 1 до самого числа. Т.е. факториал 5 это: 5! = 5 * 4 * 3 * 2 * 1.
! -обозначение факториала.
         */
        System.out.println(factorial(5));
    }

    public static int factorial(int a) {

        int result = 1;
        for (int i = 1; i <= a; i++) {
            result = result * i;
        }
        return result;
    }
}
