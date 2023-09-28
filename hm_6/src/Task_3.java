public class Task_3 {
    /*
     Написать программу, определяющую является ли год високосным (значение года задается в программе).
     Для того чтобы быть високосным,
      год должен: делится без остатка на 4 и не должен делится без остатка на 100,
      либо, если он делится на 100, то он должен делится также на 400.
     */
    public static void main(String[] args) {
//        int year = 1981;
//
//        if (year % 4 == 0 && year % 100 != 0) {
//            System.out.println(year + " высокосный год");
//        }else if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
//                System.out.println(year + " высокосный год");
//            } else System.out.println(year + " не высокостный год");
//        }
        int year = 2020;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " - це високосний рік.");
        } else {
            System.out.println(year + " - це не високосний рік.");
        }
    }
}
