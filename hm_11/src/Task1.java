import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*
    Реализуйте с помощью метода конвертор, который переводит скорость в милях в час в скорость в км/час.
      1 миля равна 1609 метров. Метод получает на вход данные от пользователя с клавиатуры.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println(convertorMilesToKilometers(scanner));

    }
    public static String  convertorMilesToKilometers(Scanner scanner){
        System.out.println("Enter miles: ");
        double k = scanner.nextInt() * 1.609;
        return k + " KM/h";
    }
}
