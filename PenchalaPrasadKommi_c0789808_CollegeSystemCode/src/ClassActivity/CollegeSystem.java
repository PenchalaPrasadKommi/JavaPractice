package ClassActivity;

import ClassActivity.Employee.FullTimeEmp;
import ClassActivity.Employee.PartTimeEmp;
import ClassActivity.Student.FullTimeStud;
import ClassActivity.Student.PartTimeStud;
import ClassActivity.Vehicle.Bicycle;
import ClassActivity.Vehicle.Car;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CollegeSystem {
    public static void main(String args[]) throws IDException
        {
            Scanner sc = new Scanner(System.in);
            ArrayList<Person> list = new ArrayList<Person>();
            FullTimeEmp fte1 = new FullTimeEmp(1,"Penchala Prasad","Kommi",Gender.MALE,25000.0f,"CSAT",222.0f,null);
            list.add(fte1);
            FullTimeStud fts1 = new FullTimeStud(1,"Tejasree.","Vadlamudi",Gender.FEMALE,"CSAT",new Car(2233,true,"BMW", Color.BLUE),"Lambton College",99.99f);
            list.add(fts1);
            PartTimeStud pts1 = new PartTimeStud(2,"Priya","Sharma",Gender.FEMALE,"CSAT",new Bicycle(4322,true,"Montra",1),"Lambton College",40);
            list.add(pts1);
            System.out.println("-------- READING PART TIME EMPLOYEE DETAILS ----------");
            PartTimeEmp partTimeEmp = null;
            try {
                System.out.print("Enter ID : ");
                int ptfID = sc.nextInt();
                sc.nextLine(); //to goto next line
                System.out.print("Enter First Name : ");
                String ptfFName = sc.nextLine();
                System.out.print("Enter Last Name : ");
                String ptfLName = sc.nextLine();
                System.out.print("Enter Total Salary : ");
                float ptfSalary = sc.nextFloat();
                System.out.print("Enter no. of working hours : ");
                int ptfWorkingHours = sc.nextInt();
                System.out.print("Enter Pay per Hour : ");
                float ptfPayPerHour = sc.nextFloat();
                if (ptfID == 0) {
                    throw new IDException("ID cannot be zero!");
                }
                partTimeEmp = new PartTimeEmp(ptfID,ptfFName,ptfLName,Gender.MALE,ptfSalary,"CSAT",ptfWorkingHours,ptfPayPerHour,new Bicycle(1121,true,"BMW",2));
                list.add(partTimeEmp);
            }
            catch (IDException nide)
            {
                System.out.println(nide.getMessage());
            }
            catch (InputMismatchException ime)
            {
                System.out.println("Entered Input Type Mismatched!\nPlease Enter the correct type");
            }
            finally {

                for(Person p : list)
                {
                    System.out.println("Type : "+p.getClass());
                    p.display();
                }

            }

        }
}
