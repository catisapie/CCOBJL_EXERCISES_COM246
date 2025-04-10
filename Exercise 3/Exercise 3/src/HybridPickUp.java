public class HybridPickUp extends HybridVehicle{

    public HybridPickUp(String carName) {
        super(carName);
    }

    public void disfuelling(){
        System.out.print("Your " + carName + " is ");
        fillGas();
    }
    public void disCharging(){
        System.out.print("Your " + carName + " is ");
        chargeBattery();
    }
}