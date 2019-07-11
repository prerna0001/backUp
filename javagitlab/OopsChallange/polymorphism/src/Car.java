public class Car
{
    private boolean engine;
    private int cylinder;
    private int wheels;
    private String name;
    public Car()
    {
        engine=true;
        wheels=4;
        cylinder=2;
        name="Car";
    }

    public boolean getEngine() {
        return engine;
    }

    public void setEngine(boolean engine) {
        this.engine = engine;
    }

    public int getCylinder() {
        return cylinder;
    }

    public void setCylinder(int cylinder) {
        this.cylinder = cylinder;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public boolean startEngine()
    {
        System.out.println("Status of engine of Car Class");
        return engine;
    }

    public void accelerate()
    {
        System.out.println("Acceleration of Car class");
    }

    public void brake()
    {
        System.out.println("Brake in Car Class");
    }

}
