package NEW;

import java.time.LocalDate;
    public class RentalTransaction {
        private Customer customer;
        private Vehicle vehicle;
        private LocalDate rentalDate;
        private int rentalDays;

        public RentalTransaction(Customer customer, Vehicle vehicle, int rentalDays) {
            this.customer = customer;
            this.vehicle = vehicle;
            this.rentalDate = LocalDate.now();
            this.rentalDays = rentalDays;
        }

        public double calculateTotalCost() {
            return vehicle.calculateRentalCost(rentalDays);
        }

        @Override
        public String toString() {
            return "RentalTransaction{" +
                    "Customer=" + customer.getName() +
                    ", Vehicle=" + vehicle.getModel() +
                    ",RentalDate=" + rentalDate +
                    ",RentalDays=" + rentalDays +
                    ",TotalCost=" + calculateTotalCost() +
                    '}';
        }
    }
