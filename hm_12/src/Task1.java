public class Task1 {
    public static void main(String[] args) {

        /*
        Написать метод, принимающий строку и возвращающий второй и третий символы строки заглавными буквами.
Пример : Hello-> EL
В методе main() вывести получившийся результат на экран
         */

        System.out.println(selectedBykvu("hello"));
         String s = "Bohdan".substring(2).toUpperCase();
        System.out.println(s);
    }
    private static String  selectedBykvu(String str){
     return str.substring(1,3).toUpperCase();
    }
}
