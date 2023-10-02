import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        /*
        Напишите метод, который имитирует бросание игрового кубика.
         На вход методу подается число бросков, на выходе метод возвращает результаты всех бросков.
         */

          dice(16);
    }
    private static int [] dice(int a){
        int [] diceRolls = new int[a];
        Random random = new Random();
        for (int i = 0; i < diceRolls.length; i++) {
            diceRolls[i] = random.nextInt(6) + 1;
        }
        for (int numbers : diceRolls){
            System.out.print(numbers + " ");
        }return diceRolls;
    }
}
