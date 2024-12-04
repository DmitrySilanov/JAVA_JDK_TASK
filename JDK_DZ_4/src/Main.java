import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        EmployeeDirectory employeeDirectory = new EmployeeDirectory(employees);

        Employee employee1 = new Employee(001, "Dmitrii", "+7(965)246-53-11", 3);
        Employee employee2 = new Employee(002, "Oleg", "+7(269)432-67-98", 4);
        Employee employee3 = new Employee(003, "Alex", "+7(980)267-51-15", 1);
        Employee employee4 = new Employee(004, "Darya", "+7(926)123-22-31", 6);
        Employee employee5 = new Employee(005, "Irina", "+7(954)989-35-12", 11);
        Employee employee6 = new Employee(006, "Sergey", "+7(911)157-51-23", 8);
        Employee employee7 = new Employee(007, "Olga", "+7(960)643-51-27", 10);

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        employees.add(employee6);

        System.out.println(employeeDirectory.findEmployeeInExperience(employees, 2));
        System.out.println(employeeDirectory.findPhoneInName(employees, "Alex"));
        System.out.println(employeeDirectory.findIdInName(employees, 002));
        employeeDirectory.addNewEmployee(employees, employee7);
    }
}