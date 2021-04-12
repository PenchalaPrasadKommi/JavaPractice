package Assignment9;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the sales amount for this month: ");
        double sales = sc.nextDouble();

        double commissionRate=0.0;
        if(sales>=0 &&sales < 10000)
        {
            commissionRate = 5.0;
        }
        else if(sales>=10000 && sales<15000)
        {
            commissionRate = 10.0;
        }
        else if(sales>=15000 && sales < 18000)
        {
            commissionRate = 12.0;
        }
        else if(sales>=18000 && sales < 22000)
        {
            commissionRate = 15.0;
        }
        else if(sales >=22000 )
        {
            commissionRate = 16.0;
        }
        else
        {
            System.out.println("Entered sales are negative. They can't be negative!\nExiting");
            System.exit(1);
        }
        System.out.print("Please enter the advanced pay: ");
        double advance = sc.nextDouble();
        double commission = commissionRate * sales / 100;
        double grossPay = commission - advance;
        System.out.println("The Commission amount according to the sales is: $"+commission);
        if(grossPay > 0)
        {
            System.out.println("At the end of the month, you will receive a check of $"+grossPay+" from the company.");
        }
        else if(grossPay<0)
        {
            System.out.println("At the end of the month, you need to pay $"+(grossPay*-1)+" to the company.");
        }
        else{
            System.out.println("No Paycheque/ No Debt");
        }
    }
}
