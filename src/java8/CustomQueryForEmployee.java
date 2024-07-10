package java8;

import java.util.*;
import java.util.stream.Collectors;

public class CustomQueryForEmployee {

    public static void main(String[] args) {

        List<Employee> employeeList = Arrays.asList(
                new Employee(1, "John Doe", 30, "Male", 50000),
                new Employee(1, "Jane Smith", 25, "Female", 20000),
                new Employee(1, "Mike JohnSon", 40, "Male", 70000),
                new Employee(1, "Emily Davis", 35, "Female", 80000),
                new Employee(1, "Robert Brown", 50,"Male", 90000)
        );

        //count How many male and Female

        Map<String, Long> collect = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(collect);

        // What is avg salary for Male and Female

        Map<String, Double> collect1 = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(collect1);

       //Find Highest Salary

        Optional<Employee> higestSal=employeeList.stream()
                .max(Comparator.comparingLong(Employee::getSalary));

        if(higestSal.isPresent()){
            System.out.println(higestSal.get());
        }

    }
}
