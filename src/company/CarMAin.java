package company;

public class CarMAin {

    public static void main(String[] args) {
        CarSkeleton gasCar = new GasPoweredCar("GasCar", "Gas-powered car", 10.5, 4);
        CarSkeleton electricCar = new ElectricCar("ElectricCar", "Electric car", 150.0, 500);
        CarSkeleton hybridCar = new HybridCar("HybridCar", "Hybrid car", 15.0, 300, 6);

        testCar(gasCar);
        testCar(electricCar);
        testCar(hybridCar);
    }

    // Polymorphism ile davranış testi
    public static void testCar(CarSkeleton car) {
        car.startEngine();
        car.drive();
        System.out.println("Car Type: " + car.getClass().getSimpleName());
        System.out.println("-----------------------");
    }
}
