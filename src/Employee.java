import java.time.LocalDate;

public class Employee {

    private String name;
    private Double salary;
    private  String gender;
    private LocalDate joiningDate;

    public Employee(String name, Double salary,String gender, LocalDate joiningDate) {
        this.name = name;
        this.salary = salary;
        this.gender=gender;
        this.joiningDate = joiningDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public LocalDate getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(LocalDate joiningDate) {
        this.joiningDate = joiningDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", gender='" + gender + '\'' +
                ", joiningDate=" + joiningDate +
                '}';
    }
}
