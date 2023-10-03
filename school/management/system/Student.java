package SMS.school.management.system;
    
public class Student {
   private int id;
   private String name;
   private  int grade;
   private double feesPaid;
   private double total;
    
   public Student(int id, String name, int grade){
    this.feesPaid = 0;
    this.total = 30000.00;
    this.id = id;
    this.name = name;
    this.grade = grade;
   }
    public void payFees(int fees){
        feesPaid+=fees;
        School.updateMoneyEarned(feesPaid);
    }
   public int getId() {
       return id;
   }
   public String getName() {
       return name;
   }
   public int getGrade() {
       return grade;
   }
   public double getFeesPaid() {
       return feesPaid;
   }
   public double getTotal() {
       return total;
   }

   public void updateStudant(int grade, double fees){
    this.grade = grade;
    feesPaid+= fees;
   }
    @Override
    public String toString() {
        return "Student's name :"+name+
                " Total fees paid so far $"+ feesPaid;
    }
}
