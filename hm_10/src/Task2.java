public class Task2 {
    public static void main(String[] args) {
        /*
        Написать метод для перевода градусов по фаренгейту в шкалу цельсия.
        Формула для расчета С = 5*(F-32)/9. Результат вывести на экран
         */

        System.out.println(fahrenheitToCelsius(201));
    }
    public static String  fahrenheitToCelsius(int f){
        double C;
        C = 5*(f-32)/9.0;
        return C + "' Cels.";
    }
}
