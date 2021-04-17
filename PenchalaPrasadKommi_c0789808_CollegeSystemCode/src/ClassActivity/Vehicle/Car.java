package ClassActivity.Vehicle;

import java.awt.*;

public class Car extends Vehicle{
    Color color;

    public Car(int vin, boolean isInsured, String brand, Color color) {
        super(vin, isInsured, brand);
        this.color = color;
    }

    public Car(int vin, boolean isInsured, String BMW, ClassActivity.Color BLUE) {
    }

    @Override
    public String toString() {
        return "Car{" +
                "color=" + color +
                ", vin=" + vin +
                ", isInsured=" + isInsured +
                ", brand='" + brand + '\'' +
                '}';
    }
}
