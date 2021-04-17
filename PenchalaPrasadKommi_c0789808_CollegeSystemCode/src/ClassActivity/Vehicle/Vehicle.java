package ClassActivity.Vehicle;

public class Vehicle {
    int vin;
    boolean isInsured;
    String brand;

    public Vehicle(int vin, boolean isInsured, String brand) {
        this.vin = vin;
        this.isInsured = isInsured;
        this.brand = brand;
    }

    public Vehicle()
    {
        this.vin = 0;
        this.brand = "Benz";
        this.isInsured = true;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vin=" + vin +
                ", isInsured=" + isInsured +
                ", brand='" + brand + '\'' +
                '}';
    }
}
