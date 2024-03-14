import java.util.Date;
import java.text.SimpleDateFormat;

public class Student1 {
    private String name;
    private Date dateOfBirth;

    public Student1(String name, Date dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        Date currentDate = new Date();
        long diff = currentDate.getTime() - dateOfBirth.getTime();
        return (int) (diff / (1000L * 60 * 60 * 24 * 365)); // Convert milliseconds to years
    }

    public void displayStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + getAge());
    }

    public static void main(String[] args) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            Date dob = dateFormat.parse("24-07-2004");
            Student1 student = new Student1("Hrishikesh", dob);
            student.displayStudentInfo();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
