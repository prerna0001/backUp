public class Swift_Car extends Car{

    private int cylinder;
    private String name;

    public Swift_Car(int cylinder,String name)
    {
        this.cylinder=cylinder;
        this.name=name;
    }

    @Override
    public int getCylinder() {
        return cylinder;
    }

    @Override
    public void setCylinder(int cylinder) {
        this.cylinder = cylinder;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public void accelerate()
    {
        System.out.println("Acceleration of Swift Car class");
    }

    public void brake()
    {
        System.out.println("Brake in Swift Car Class");
    }
}
