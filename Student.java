import java.util.ArrayList;

public class Student {
    private int student_id;
    private String student_name;
    private ArrayList<Integer> grades = new ArrayList<>();

    public int getStudent_id() { return student_id; }
    public void setStudent_id(int student_id) { this.student_id = student_id; }

    public String getStudent_name() { return student_name; }
    public void setStudent_name(String student_name) { this.student_name = student_name; }

    public void addGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            grades.add(grade);
        } else {
            System.out.println("Invalid grade! Must be between 0 and 100.");
        }
    }

    public ArrayList<Integer> getGrades() { return grades; }

    public static void main(String[] args) {
        Student s = new Student();
        s.setStudent_id(1);
        s.setStudent_name("Rifat");
        s.addGrade(95);
        s.addGrade(88);

        System.out.println("ID: " + s.getStudent_id());
        System.out.println("Name: " + s.getStudent_name());
        System.out.println("Grades: " + s.getGrades());
    }
}