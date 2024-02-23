import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class EmpMain {


    public static void main(String[] args) {
        List<Emp> employeeList=new ArrayList<Emp>();
        employeeList.add(new Emp(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Emp(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Emp(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Emp(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Emp(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Emp(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Emp(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Emp(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Emp(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Emp(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Emp(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Emp(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Emp(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Emp(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Emp(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Emp(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Emp(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

        //1.How many male and female employees are there in the organization?
        System.out.println("----How many male and female employees are there in the organization----");
        Map<String, Long> listOfMaleFemale = employeeList.stream().collect(groupingBy(Emp::getGender, counting()));
        System.out.println("List Of Male And Female:"+listOfMaleFemale);

        //2.Print the name of all departments in the organization?
        System.out.println("----Print the name of all departments in the organization----");
         employeeList.stream().map(emp -> emp.getDepartment()).distinct().forEach(System.out::println);

        //3.What is the average age of male and female employees?
        System.out.println("----What is the average age of male and female employees----");
        Map<String, Double> averageAge = employeeList.stream().collect(Collectors.groupingBy(Emp::getGender,Collectors.averagingInt(Emp::getAge)));
        System.out.println("Avg Age:"+averageAge);

        //4.Get the details of highest paid employee in the organization?
        System.out.println("----Get the details of highest paid employee in the organization----");
        Optional<Emp> highestEmp = employeeList.stream().collect(maxBy(Comparator.comparingDouble(Emp::getSalary)));
        System.out.println("HighestEmp:"+highestEmp.get());

       //5.Get the names of all employees who have joined after 2015?
        System.out.println("----Get the names of all employees who have joined after 2015----");
        employeeList.stream().filter(e->e.getYearOfJoining()>2015).forEach(System.out::println);

        //6.Count the number of employees in each department?
        System.out.println("----Count the number of employees in each department----");
        Map<String, Long> empWithDeptList = employeeList.stream().collect(groupingBy(Emp::getDepartment, counting()));
        System.out.println("empWithDeptList:"+empWithDeptList);

        //7. What is the average salary of each department?
        System.out.println("----What is the average salary of each department----");
        Map<String, Double> eachDeptSalary = employeeList.stream().collect(groupingBy(Emp::getDepartment, averagingDouble(Emp::getSalary)));
        System.out.println("EachDept Avg Salary:"+eachDeptSalary);

        //8.Get the details of youngest male employee in the product development department?

        Optional<Emp> yongestEmplFromProduction= employeeList
                .stream()
                .filter(e -> (e.getGender().equalsIgnoreCase("Male") && e.getDepartment().equalsIgnoreCase("Product Development")))
                .min(Comparator.comparingInt(Emp::getAge));
        System.out.println("yongestEmplFromProduction:"+yongestEmplFromProduction.get());

        //9.Who has the most working experience in the organization?
        Optional<Emp> mostExp=employeeList.stream().sorted(Comparator.comparingInt(Emp::getYearOfJoining)).findFirst();
        System.out.println("mostExp:"+mostExp.get());


    }

}
