package ClassActivity;

public class Person implements Display
{
    public int id;
    public String firstName;
    public String lastName;
    public Gender gender;

    public Person(int id, String firstName, String lastName, Gender gender){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public Person() {
        this.id = 0;
        this.firstName = "X";
        this.lastName ="Y";
        this.gender = Gender.MALE;
    }

    public void display()
    {
        System.out.println("Person ID : "+id);
        System.out.println("Person Name : "+firstName+" "+lastName);
        System.out.println("Person Gender : "+gender);
    }
}
