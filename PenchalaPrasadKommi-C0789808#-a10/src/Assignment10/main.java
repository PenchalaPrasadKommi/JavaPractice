package Assignment10;
import java.util.Scanner;

abstract class Emp implements EmpInterface {
    public abstract void calCommissionRate();
    public abstract void calCommission();
}

interface EmpInterface {
    public void calGrossPay();
    public abstract void displayMonthEndPay();

}

class SalariedEmp extends Emp implements EmpInterface {
    public double sales;
    private double commission;
    protected double grossPay;
    protected double commissionRate;
    double advance;

    public SalariedEmp(double sales, double advance) {
        this.sales = sales;
        this.advance = advance;
    }

    public double getSales() {
        return sales;
    }

    public double getCommission() {
        return commission;
    }

    public double getGrossPay() {
        return grossPay;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public double getAdvance() {
        return advance;
    }

    @Override
    public void calGrossPay() {
        grossPay = commission - advance;
    }

    @Override
    public void calCommission() {
        commission = commissionRate * sales / 100;
    }

    @Override
    public void displayMonthEndPay() {
        System.out.println("The Commission amount according to the sales is: $"+getCommission());
        if(getGrossPay() > 0)
        {
            System.out.println("At the end of the month, you will receive a check of $"+getGrossPay()+" from the company.");
        }
        else if(getGrossPay()<0)
        {
            System.out.println("At the end of the month, you need to pay $"+(getGrossPay()*-1)+" to the company.");
        }
        else{
            System.out.println("No Paycheque/ No Debt");
        }
    }

    @Override
    public void calCommissionRate() {
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
    }
}

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the sales amount for this month: ");
        double sales = sc.nextDouble();
        System.out.print("Please enter the advanced pay: ");
        double advance = sc.nextDouble();
        SalariedEmp salariedEmployee = new SalariedEmp(sales,advance);
        salariedEmployee.calCommissionRate();
        salariedEmployee.calCommission();
        salariedEmployee.calGrossPay();
        salariedEmployee.displayMonthEndPay();
    }
}
