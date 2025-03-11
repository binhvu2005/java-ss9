
public class Bai2 {
    public static class Employee {
       private   int id;
       private   String name;
       private   String department;
        private  Double salary;

       public Employee(int id, String name, String department, Double salary) {
           this.id = id;
           this.name = name;
           this.department = department;
           this.salary = salary;
       }

       public void  displayInfo(){
           System.out.println("ID: " + id + ", Name: " + name + ", Department: " + department + ", Salary: " + salary);
       }
       public double increaseSalary(double percentage){
           return salary * (percentage/100);
       }

        public static void main(String[] args) {
            Bai2.Employee emp1 = new Employee(1, "John Doe", "Sales", 5000.0);

            emp1.displayInfo();
            System.out.println("lương được tăng: " + emp1.increaseSalary(10) + "$");
        }
    }
}
