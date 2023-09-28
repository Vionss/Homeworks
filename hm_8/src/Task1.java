public class Task1 {
    /*
    Собрать в массив данные о росте (или возрасте) членов группы.
    Выведите на печать максимальное и минимальное значение.
     */

    public static void main(String[] args) {


        int [] age = {27, 40, 31, 33, 21, 25, 63, 45, 29, 41};

        int min = age[0];
        int max = age[0];

        for (int i = 1; i < age.length; i++) {
            if(age[i] < min){
                min = age[i];
            }
            if (age[i] > max)
                max = age[i];
        }

        System.out.println("Максимальный возраст " + max);
        System.out.println("Минимальный возраст " + min);

    }


}
