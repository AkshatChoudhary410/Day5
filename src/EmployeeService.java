import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;

public class EmployeeService {

    private List<Employee> employees;

    public EmployeeService(List<Employee> employees) {
        this.employees = employees;
    }

    public void sortEmp() {
        List<Employee> sorted = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary))  // Sorting by salary
                .collect(Collectors.toList());

        System.out.println("Employees sorted by salary: ");
        sorted.forEach(System.out::println);
    }

    public void empName() {
        List<String> developers = employees.stream()
                .filter(e -> e.getRole().equals("Developer"))
                .map(Employee::getName)
                .collect(Collectors.toList());

        if (developers.isEmpty()) {
            System.out.println("No developers found!");
        } else {
            System.out.println("Developer Names: ");
            developers.forEach(System.out::println);
        }

    }

}
