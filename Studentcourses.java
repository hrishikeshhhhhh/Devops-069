public class Studentcourses {
    private String semester;
    private String[] courses;
    private int[] marks;

    public Studentcourses(String semester, String[] courses, int[] marks) {
        this.semester = semester;
        this.courses = courses;
        this.marks = marks;
    }

    public void displayCourseInfo() {
        System.out.println("Semester: " + semester);
        for (int i = 0; i < courses.length; i++) {
            System.out.println("Course: " + courses[i] + ", Marks: " + marks[i]);
        }
    }

    public static void main(String[] args) {
        String[] courses = {"C#", "Machine learning", "Devops"};
        int[] marks = {39, 50, 60};
        Studentcourses studentCourses = new Studentcourses("4th", courses, marks);
        studentCourses.displayCourseInfo();
    }
}
