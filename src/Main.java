import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Akshat", "Developer", 80000),
                new Employee("Akshat1", "Manager", 90000),
                new Employee("Akshat3", "Developer", 75000),
                new Employee("Akshat4", "Tester", 60000),
                new Employee("Akshat5", "Developer", 95000)
        );
        EmployeeService employeeService = new EmployeeService(employees);

        employeeService.sortEmp();

        employeeService.empName();

        findNum();
        findWords();
        removeDuplicates();
    }

    public static void findNum() {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evenNumbers);

    }

    public static void findWords(){
        List<String> words = Arrays.asList("Apple","Ball","Ant","Bat");
        long count = words.stream()
        .filter(w -> w.startsWith("A"))
                .count();
        System.out.println(count);

    }

    public static  void removeDuplicates(){
        List<Integer> list = Arrays.asList(1,2,2,3,3,3,4,4);
        List<Integer> unique = list.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(unique);

    }


}



