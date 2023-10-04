public class Main {
    public static void main(String[] args) {

        Engine engine1 = new Engine(1.3,"Diesel");
        MyDate myDate1 = new MyDate(1,3,2017);
        Car car1  = new Car("Toyota", "blue","WE1467",myDate1,engine1);

        Engine engine2 = new Engine(3.2,"Benz");
        MyDate myDate2 = new MyDate(11,7,1617);
        Car car2  = new Car("Zapor", "black","BG0000",myDate2,engine2);


       car1.drive();
       car1.drive();
       car1.stop();
       car1.stop();
       car2.stop();


       car2.drive();
       car2.drive();
       car2.stop();
       car2.stop();


    }
}
