public class Car {
    String brand;
    String color;
    String licensePlate;
    MyDate registrationDate;
    Engine engine;
    private boolean isDrive;

    public Car(String brand, String color, String licensePlate, MyDate registrationDate, Engine engine) {
        this.brand = brand;
        this.color = color;
        this.licensePlate = licensePlate;
        this.registrationDate = registrationDate;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", licensePlate='" + licensePlate + '\'' +
                ", registrationDate=" + registrationDate +
                ", engine=" + engine +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public MyDate getRegistrationDate() {
        return registrationDate;
    }

    public Engine getEngine() {
        return engine;
    }
    /*
    В классе Car добавте методы drive и stop. Первый должке заводить двигатель и писать,
     что такая то машина поехала. Второй, соответственно глушить двигатель и останавливать машину.
     Реализовать проверку, если машина уже едет,
      а я пытвюсь вызвать метод drive, должно появлятся сообщение, что машина уже едет.
     */

    public void drive() {
        if (!isDrive) {
            System.out.println(color + " " + brand + "\n" + "License Plate " + licensePlate + "\n" + "is driving");
            isDrive = true;
        } else {
            System.out.println("This car is already moving");
        }

    }

    public void stop() {
        if (isDrive) {
            System.out.println(color + " " + brand + "\n" + "License Plate " + licensePlate + "\n" + "is STOPING");
            isDrive = false;
        }else {
            System.out.println("The car is already stoped");
        }

    }
}