package NEW;

public class Motorcycle extends Vehicle{
    public Motorcycle(String vehicleId, String model, double pricePerks){
        super(vehicleId, model, pricePerks);
    }



    @Override
    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * days;
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }
}
