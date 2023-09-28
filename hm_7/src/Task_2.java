public class Task_2 {
    /*
С помощью цикла while написать программу, выводящую на экран результат
умножения данного цисла n на все целые числа от 0 до n

Пример: для числа 3 результат будет 0, 3, 6, 9
     */
    public static void main(String[] args) {
        int x = 8;
        int check = 0;

        while (check <= x) {
            int i = check * x;
            System.out.println(i);
            check++;
        }
    }
}
