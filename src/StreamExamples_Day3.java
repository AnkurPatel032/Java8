import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

public class StreamExamples_Day3 {

    public static void main(String[] args) throws ParseException {
        List<Integer> inputString = Arrays.asList(10, 5, 36, 55, 78, 2, 45, 7, 3, 5, 2, 5, 3, 4, 6, 9);
        System.out.println("Input List:" + inputString.stream().sorted().toList());
        //find even number from ArrayList
        List<Integer> evenNo = inputString.stream().distinct().sorted().filter(i -> i % 2 == 0).toList();
        System.out.println("Find Even No:" + evenNo);

        List<Integer> inputString2 = Arrays.asList(10, 5, 34, 2, 45, 7, 3, 5, 2, 5, 3, 4, 6, 9);
        //find even number from ArrayList
        List<Integer> oddNo = inputString2.stream().distinct().sorted().filter(i -> i % 2 != 0).toList();
        System.out.println("Find Odd No:" + oddNo);

        // Find Unique No. in sorted
        List<Integer> uniqNo = inputString.stream().distinct().sorted(Comparator.reverseOrder()).toList();
        System.out.println("Unique No:" + uniqNo);


        // multiply by2 for each element
        List<Integer> result = inputString.stream().filter(i -> i % 2 == 0).distinct().sorted().map(i -> i * 2).toList();
        System.out.println("Square :" + result);


        //Find Pass Student
        List<Integer> passStudent = inputString.stream().filter(i -> i > 35).toList();
        System.out.println("passStudent:" + passStudent);

        //Find Fail Student
        List<Integer> failStudent = inputString.stream().filter(i -> i < 35).toList();
        System.out.println("failStudent:" + failStudent);

        // grass 5 to each Failed

        List<Integer> failStudentWithGrass = inputString.stream().filter(i -> i < 35).map(i -> i + 5).toList();
        System.out.println("FailStudent with Grass:" + failStudentWithGrass);

        List<String> inputStream = Arrays.asList("A", "BB", "AA","AAA", "KKKK", "LLLLL");
//        Comparator<String> stringData=(a,b)->{
//                int s1=a.length();
//                int s2=b.length();
//            return Integer.compare(s1, s2);
//        };
        List<String> StringResult=inputStream.stream().sorted(Comparator.comparingInt(String::length)).toList();
        System.out.println("Final String Result:" + StringResult);

        //get Max No
        Integer maxNo= inputString.stream().distinct().max((o1, o2) -> o1.compareTo(o2)).get();
        System.out.println("Input Data:"+inputString);
        System.out.println("Max No:"+maxNo);

        //get Min No
        Integer minNo= inputString.stream().distinct().min((o1, o2) -> o1.compareTo(o2)).get();
        System.out.println("Input Data:"+inputString);
        System.out.println("Min No:"+minNo);

        //forEach
        inputString.stream().sorted().map(i->i+" ").distinct().forEach(System.out::print);

        //convert Stream object into array -- toArray

        System.out.println(" ");
        Integer[] array = inputString.stream().toArray(Integer[]::new);
        System.out.println("Integer Array:"+array.length);

        // Convert Array to Stream
        System.out.println("Stream1::"+Arrays.stream(array)); //specific to array
        System.out.println("Stream2::"+Stream.of(array)); // generic type

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate joinDateRam = LocalDate.parse("01-01-2000", formatter);
        LocalDate joinDateSita = LocalDate.parse("15-05-1995", formatter);
        LocalDate joinDateVishnu = LocalDate.parse("10-12-1998", formatter);
        LocalDate joinDateMahesh = LocalDate.parse("01-01-2000", formatter);

        List<Employee> employees=Arrays.asList(new Employee("Ram",5000.0,"M", joinDateRam),
                new Employee("Sita",4000.0,"F", joinDateSita),
                new Employee("Vishnu",2000.0,"M", joinDateVishnu),
                new Employee("Mahesh",7000.0,"M", joinDateMahesh)
                );

       Employee maxSalary= employees.stream().max((a,b)->Double.compare(b.getSalary(), a.getSalary())).get();

       System.out.println("MaxSalary:"+maxSalary);

       List<Employee> eList=employees.stream()
                     .sorted((a,b)->Double.compare(b.getSalary(), a.getSalary())).skip(1).toList();
        System.out.println("OrderBySalary:"+eList);

        // second highest salary
       Employee secondHighesSalary= employees.stream().
                                    sorted(Comparator.comparingDouble(Employee::getSalary)).skip(1).findFirst().get();
        System.out.println("Second Highest Salary:"+secondHighesSalary);

    }

}
