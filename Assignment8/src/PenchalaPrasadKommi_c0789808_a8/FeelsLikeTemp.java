package PenchalaPrasadKommi_c0789808_a8;

import javax.swing.*;
import java.util.ArrayList;

class FeelsLike
{
    int windSpeed;
    int temperature;
    int feelsLikeTemp;
    String day;

    public FeelsLike(int windSpeed, int temperature, String day) {
        this.windSpeed = windSpeed;
        this.temperature = temperature;
        this.day = day.toUpperCase();
        calcFeelLikeTemp();
    }

    public void calcFeelLikeTemp()
    {
        feelsLikeTemp = temperature * windSpeed;
    }

    @Override
    public String toString() {
        StringBuilder sb= new StringBuilder();
        sb.append("Today is "+day);
        sb.append("\nThe Wind speed is "+windSpeed+" mph");
        sb.append("\nTemperature : "+temperature+" Celsius");
        sb.append("\nIt feels like temperature is "+ feelsLikeTemp+" Celsius");
        return new String(sb);
    }
}

public class FeelsLikeTemp {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Welcome to Feels Like Temperature Calculator!");
        String inp = JOptionPane.showInputDialog("Please enter the day of the week, temperature in celsius and wind speed in mph separated by spaces in between");
        ArrayList<String> inpValues = new ArrayList<String>(); //using ArrayList
        for(String s: inp.split(" ")) //inp.split(" ") returns an array of Strings
            inpValues.add(s);
        String day = inpValues.get(0).toLowerCase();
        int temperature = Integer.parseInt(inpValues.get(1));
        int windSpeed = Integer.parseInt(inpValues.get(2));
        FeelsLike flt = new FeelsLike(windSpeed,temperature,day);
        JOptionPane.showMessageDialog(null,flt);
    }
}
