public class Engine {

    Double enginePower;
    String typeOfEngine;

    public Engine(Double enginePower, String typeOfEngine) {
        this.enginePower = enginePower;
        this.typeOfEngine = typeOfEngine;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "enginePower='" + enginePower + '\'' +
                ", typeOfEngine='" + typeOfEngine + '\'' +
                '}';
    }

    public  void start(){
        System.out.println("Engine is started");
    }
    public  void engineStop(){
        System.out.println("Engine is stoped");
    }
    /*
    В классе Engine добавте методы start и stop.
    Кадлый из них пусть выводит строку "Engine is started" "Engine is stoped".
    В классе Car добавте методы drive и stop. Первый должке заводить двигатель и писать,
     что такая то машина поехала. Второй, соответственно глушить двигатель и останавливать машину.
     */
}
