interface Vehicle {
    void start();
}

class Car {
    void fuelType() {
        System.out.println("Fuel Type : Petrol");
    }
}

class SportsCar extends Car implements Vehicle {

    public void start() {
        System.out.println("Sports Car Started.");
    }

    void display() {
        System.out.println("Model : Ferrari");
    }
}

public class Main {
    public static void main(String[] args) {

        SportsCar sc = new SportsCar();

        sc.display();
        sc.fuelType();    // Inherited method
        sc.start();       // Interface method
    }
}