public class Main {
    public static void main(String[] args) {
        // 1 Написать программу, вычисляющую и выводящую на печать ASCII значение символа 'B'.
        int chInt = 'Q';
        System.out.println("chInt is "+chInt);

        // 2 Даны две строки а и в. Написать программу, соединяющую их и выводящую на экран в виде abba,
        //Например "Hi" и "Bye" должны быть напечатаны как HiByeByeHi

        String a = "Hi";
        String b = "Bye";

        System.out.println(a+b+b+a);


        // 3 Написать прогрмму, выводящую на экран символ строки с индексом 2.
        //Например, если строка Java, то результат будет 'v'

        String c = "Java";
        System.out.println(c.charAt(2));

        // 4 Написать программу, выводящую на экран целое число, равное двойной длине строки.
        // Т.е. если есть строка Java, то ответ будет 8

        String q = "Java";
        System.out.println(q.length() * 2);
    }

}
