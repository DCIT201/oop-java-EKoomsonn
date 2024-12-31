package NEW;

public class Customer {
    private String name;
    private String customerId;
    private int rentalCount;

    public Customer( String name, String customerId){
        this.name = name;
        this.customerId = customerId;
        this.rentalCount = 0;
    }
    public String getName(){
        return name;
    }

    public String getCustomerId() {
        return customerId;
    }

    public int getRentalCount() {
        return rentalCount;
    }
    public void incrementRentalCount(){
        rentalCount++;
    }
}

