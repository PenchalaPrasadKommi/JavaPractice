package ClassActivity.Student;

import ClassActivity.Display;
import ClassActivity.Gender;
import ClassActivity.Vehicle.Vehicle;

public class FullTimeStud extends Student implements Display {
    float attendance;

    public FullTimeStud(int id, String firstName, String lastName, Gender gender, String courseName, Vehicle vehicle, String collegeName, float attendance) {
        super(id, firstName, lastName, gender, courseName, vehicle, collegeName);
        this.attendance = attendance;
    }

    public void display()
    {
        System.out.println("Fulltime Student ID : "+id);
        System.out.println("Fulltime Student Name : "+firstName+" "+lastName);
        System.out.println("Fulltime Student Gender : "+gender);
        System.out.println("Fulltime Student Course : "+courseName);
        System.out.println("Fulltime Student College : "+collegeName);
        System.out.println("Fulltime Student Attendance : "+attendance+"%");
        System.out.println("Fulltime Student Vehicle : "+vehicle);
    }
}
