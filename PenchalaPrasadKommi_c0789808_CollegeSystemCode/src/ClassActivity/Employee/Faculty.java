package ClassActivity.Employee;

import ClassActivity.Display;
import ClassActivity.Gender;

public class Faculty extends Employee implements Display {
    String department;

    public Faculty(int id, String firstName, String lastName, Gender gender, float totalSalary, String department) {
        super(id, firstName, lastName, gender, totalSalary);
        this.department = department;
    }

    public Faculty(float totalSalary, String department) {
        super(totalSalary);
        this.department = department;
    }

    public Faculty(int id, String firstName, String lastName, Gender gender, String department) {
        super(id, firstName, lastName, gender);
        this.department = department;
    }

    public Faculty(String department) {
        this.department = department;
    }

    public Faculty()
    {

    }
    public void display()
    {
        System.out.println("Faculty ID : "+id);
        System.out.println("Faculty Name : "+firstName+" "+lastName);
        System.out.println("Faculty Gender : "+gender);
        System.out.println("Faculty Salary : "+totalSalary);
        System.out.println("Faculty Department : "+department);
    }
}
