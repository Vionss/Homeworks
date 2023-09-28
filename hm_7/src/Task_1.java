public class Task_1 {
    /*
С помощью цикла while написать программу, выводящую на экран куб числа от 1 до заданного числа n

Пример:для числа n=3

1 в кубе 1

2 в кубе 8

3 в кубе 27
     */

    public static void main(String[] args) {

        int x =5;
        int check = 1;

        while (check <= x){
            int i = check * check * check;
            System.out.println(i);
            check++;

        }

    }
}
