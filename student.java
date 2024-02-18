public class student {

     String name;
     String program;
     String department;
     String[] courses;

    public student(String name, String program, String department, String[] courses) {
        this.name = name;
        this.program = program;
        this.department = department;
        this.courses = courses;
    }

    public void displayDetails() {
        System.out.println("Name of student is: " + name);
        System.out.println("Program: " + program);
        System.out.println("Department: " + department);
        System.out.println("Courses:");
        for (String course : courses) {
            System.out.println("- " + course);
        }
    }
}

class StudentCourse extends student {

    private int[][] marks;

    public StudentCourse(String name, String program, String department, String[] courses, int[][] marks) {
        super(name, program, department, courses);
        this.marks = marks;
    }

    public void displayCourseMarks() {
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                if (marks[i][j] < 40) {
                    System.out.println(name + " scored less than 40 in " + courses[j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        String[] courses = {"DevOps", "Machine Learning", "C#"};
        int[][] marks = {{50, 30, 60}};
        StudentCourse student = new StudentCourse("Hrishikesh", "BCA", "MCA", courses, marks);
        student.displayDetails();
        student.displayCourseMarks();
    }
}
