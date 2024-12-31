package NEW;

import java.util.ArrayList;
import  java.util.List;

public class RentalAgency {
    private List<Vehicle> vehicles;

    public RentalAgency(){
        this.vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle){
        vehicles.add(vehicle);
    }
    public List<Vehicle> getVehicles(){
        return vehicles;
    }
}
