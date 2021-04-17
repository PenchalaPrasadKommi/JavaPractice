package ClassActivity.Student;

import ClassActivity.Gender;
import ClassActivity.Person;
import ClassActivity.Vehicle.Vehicle;
import ClassActivity.Display;

public class Student extends Person implements Display {
        String courseName;
        Vehicle vehicle;
        String collegeName;

        public Student(int id, String firstName, String lastName, Gender gender, String courseName, Vehicle vehicle, String collegeName) {
            super(id, firstName, lastName, gender);
            this.courseName = courseName;
            this.vehicle = vehicle;
            this.collegeName = collegeName;
        }

        public Student() {
        }

        public void display()
        {
            System.out.println("Student ID : "+id);
            System.out.println("Student Name : "+firstName+" "+lastName);
            System.out.println("Student Gender : "+gender);
            System.out.println("Student Course : "+courseName);
            System.out.println("Student College : "+collegeName);
            System.out.println("Student Vehicle : "+vehicle);
        }
}
