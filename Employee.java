public class Employee {
    private int employee_id;
    private String employee_name;
    private double employee_salary;

    public int getEmployee_id() { return employee_id; }
    public void setEmployee_id(int employee_id) { this.employee_id = employee_id; }

    public String getEmployee_name() { return employee_name; }
    public void setEmployee_name(String employee_name) { this.employee_name = employee_name; }

    public String getEmployee_salary() { return String.format("$%.2f", employee_salary); }
    public void setEmployee_salary(double employee_salary) { this.employee_salary = employee_salary; }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.setEmployee_id(101);
        e.setEmployee_name("Tamanna Islam");
        e.setEmployee_salary(55000);

        System.out.println("ID: " + e.getEmployee_id());
        System.out.println("Name: " + e.getEmployee_name());
        System.out.println("Salary: " + e.getEmployee_salary());
    }
}