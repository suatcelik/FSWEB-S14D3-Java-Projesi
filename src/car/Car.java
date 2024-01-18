package car;

import java.util.Objects;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.name = name;
        this.wheels =4 ;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "car.Car{" +
                "engine=" + engine +
                ", cylinders=" + cylinders +
                ", name='" + name + '\'' +
                ", wheels=" + wheels +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        return engine == car.engine && cylinders == car.cylinders && wheels == car.wheels && Objects.equals(name, car.name);
    }



    public String startEngine() {
        String message = "The car's engine is starting.";
        System.out.println(getClass().getSimpleName() + ": " + message);
        return message;
    }

    public String accelerate() {
        String message = "The car is accelerating.";
        System.out.println(getClass().getSimpleName() + ": " + message);
        return message;
    }

    public String brake() {
        String message = "The car is braking.";
        System.out.println(getClass().getSimpleName() + ": " + message);
        return message;
    }

}
