package company;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void startEngine(){
        System.out.println("Engine started.");
   }
   public void drive(){
       System.out.println("Car is driving");
   }
   protected void runEngine(){
       System.out.println("Engine is running.");
   }
}
