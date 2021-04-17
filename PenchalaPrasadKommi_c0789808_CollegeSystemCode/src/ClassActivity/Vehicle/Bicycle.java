package ClassActivity.Vehicle;

public class Bicycle extends Vehicle{
    int noOfSeats;

    public Bicycle(int vin, boolean isInsured, String brand, int noOfSeats) {
        super(vin, isInsured, brand);
        this.noOfSeats = noOfSeats;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "noOfSeats=" + noOfSeats +
                ", vin=" + vin +
                ", isInsured=" + isInsured +
                ", brand='" + brand + '\'' +
                '}';
    }
}
