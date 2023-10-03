package SMS.school.management.system;

import java.util.List;

public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private static double totalMoneyEarned;
    private double totalMoneySpent;

    public School(List<Teacher> teachers, List<Student> students) {
        totalMoneyEarned = 0;
        this.totalMoneySpent = 0;
    this.students= students;
    this.teachers = teachers;
    }
    public double getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public void setTotalMoneyEarned(double totalMoneyEarned) {
        School.totalMoneyEarned = totalMoneyEarned;
    }

    public static void updateMoneyEarned(double MoneyEarned){
        totalMoneyEarned += MoneyEarned;
    }

    public static void updateTotalMoneySpent(double moneySpent){
        totalMoneyEarned-= moneySpent;
    }
    public double getTotalMoneySpent() {
        return totalMoneySpent;
    }
    public void setTotalMoneySpent(double totalMoneySpent) {
        this.totalMoneySpent = totalMoneySpent;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }
    /**
     * Adds a new teacher to the list
     * @param teacher
     */
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }
   
    public List<Student> getStudents() {
        return students;
    }
    public void setStudents(List<Student> students) {
        this.students = students;
    }
     /**
     * Adds a new student to the list
     * @param student
     */
    public void addStudent(Student student){
        students.add(student);
    }
} 
