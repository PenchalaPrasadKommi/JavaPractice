package ClassActivity.Employee;

import ClassActivity.Display;
import ClassActivity.Gender;
import ClassActivity.Vehicle.Vehicle;

public class PartTimeEmp extends Faculty implements Display {
    int noOfHoursWorked;
    float payPerHour;
    Vehicle vehicle;

    public PartTimeEmp(int id, String firstName, String lastName, Gender gender, float totalSalary, String department, int noOfHoursWorked, float payPerHour, Vehicle vehicle) {
        super(id, firstName, lastName, gender, totalSalary, department);
        this.noOfHoursWorked = noOfHoursWorked;
        this.payPerHour = payPerHour;
        this.vehicle = vehicle;
    }

    public void display()
    {
        System.out.println("Parttime Faculty ID : "+id);
        System.out.println("Parttime Faculty Name : "+firstName+" "+lastName);
        System.out.println("Parttime Faculty Gender : "+gender);
        System.out.println("Parttime Faculty Salary : "+totalSalary);
        System.out.println("Parttime Faculty No. of Hours Worked : "+noOfHoursWorked);
        System.out.println("Parttime Faculty Pay Per Hour : "+payPerHour);
        System.out.println("Parttime Faculty Vehicle : "+vehicle);
        System.out.println("--------------------------------------------");
    }
}
