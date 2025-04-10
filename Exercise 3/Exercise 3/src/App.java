import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

    HybridVehicle car1 = new HybridSedan(null);
    car1.carName = "Ferrari";
    HybridVehicle car2 = new HybridPickUp(null);
    car2.carName = "Honda Civic";

    ArrayList<HybridVehicle> cars = new ArrayList<>();
    cars.add(car1);
    cars.add(car2);

    CarWash wash = new CarWash();

    ((HybridSedan) car1).disCharging();
    ((HybridSedan) car1).disfuelling();
    wash.Washing(car1);

    System.out.println();

    ((HybridPickUp) car2).disCharging();
    ((HybridPickUp) car2).disfuelling();
    wash.Washing(car2);
        
    }
}