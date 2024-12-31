package NEW;

public class Truck extends Vehicle{
    public Truck( String vehicleId,String model, double pricePerks){
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
