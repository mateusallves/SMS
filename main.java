import SMS.school.management.system.School;
import SMS.school.management.system.Student;
import SMS.school.management.system.Teacher;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Teacher izzy = new Teacher(1,"izzy",500);
        Teacher melissa = new Teacher(1,"Melissa", 700);

        List<Teacher> teacherList= new ArrayList<>();
        teacherList.add(melissa);
        teacherList.add(izzy);

        Student tamara = new Student(1,"Tamara", 4);
        Student mateus = new Student(2,"Mateus", 3);
        Student jorge = new Student(3,"Jorge", 7);
        List<Student> studentList = new ArrayList<>();

        studentList.add(tamara);
        studentList.add(mateus);
        studentList.add(jorge);

        School newSchoolTest = new School(teacherList,studentList);
        Teacher megan = new Teacher(5,"Ana",800);

        newSchoolTest.addTeacher(megan);
        tamara.payFees(5000);
        mateus.payFees(6000);
        System.out.println("Municipal scholl has earned: "+newSchoolTest.getTotalMoneyEarned()+" reais");
        System.out.println("---------Salary paying-------");
        izzy.receiveSalary(izzy.getSalary());
        System.out.println("Municipal Scholl has spent for salary to "+izzy+" and now has $"+newSchoolTest.getTotalMoneyEarned()+" in total");


        melissa.receiveSalary(melissa.getSalary());
        System.out.println("Municipal Scholl has spent for salary to "+melissa+" and now has $"+newSchoolTest.getTotalMoneyEarned()+" in total");

        System.out.println(izzy);

        melissa.receiveSalary(melissa.getSalary());

        System.out.println(melissa);




    }
}
