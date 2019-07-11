public class MainClass {
    public static void main(String[] args) {
        System.out.println("Information About Car");
        Car car = new Car();
        System.out.println(car.getName());
        System.out.println(car.getCylinder());
        System.out.println(car.getEngine());
        System.out.println(car.getWheels());
        car.accelerate();
        car.startEngine();
        car.brake();
        System.out.println();

        System.out.println("Information about Honda Car");
        Honda_Car hondaCar = new Honda_Car(4, "Honda");
        System.out.println(hondaCar.getCylinder());
        System.out.println(hondaCar.getName());
        System.out.println(hondaCar.getEngine());
        System.out.println(hondaCar.getWheels());
        hondaCar.accelerate();
        hondaCar.startEngine();
        hondaCar.brake();
        System.out.println();

        System.out.println("Information about Swift Car");
        Swift_Car swift_car=new Swift_Car(6,"Swift");
        System.out.println(swift_car.getCylinder());
        System.out.println(swift_car.getName());
        System.out.println(swift_car.getEngine());
        System.out.println(swift_car.getWheels());
        swift_car.accelerate();
        swift_car.brake();
        System.out.println();

        System.out.println("Information about Manza Car");
        Manza_Car manza_car=new Manza_Car(7,"Manza");
        System.out.println(manza_car.getCylinder());
        System.out.println(manza_car.getName());
        System.out.println(manza_car.getEngine());
        System.out.println(manza_car.getWheels());
        manza_car.accelerate();
        manza_car.brake();

    }
}
