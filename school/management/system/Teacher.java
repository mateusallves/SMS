package SMS.school.management.system;
public class Teacher {
   final private int id;
   final private String  name;
    private final int salary;
    private double salaryEarned;

    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned=0;

    }
    public void receiveSalary(int salary){
        salaryEarned+=salary;
        School.updateTotalMoneySpent(salary);
    }

    public int getId(){
        return id;
    }
    public  String getName(){
        return name;
    }
    public int getSalary(){
        return salary;
    }

    @Override
    public String toString(){
        return "Name of the Teacher: " + name + " Total Salary earned in total: $"+ salary;
    }
}
