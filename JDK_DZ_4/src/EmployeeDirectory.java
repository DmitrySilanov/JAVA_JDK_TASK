import java.util.ArrayList;
import java.util.List;

public class EmployeeDirectory {
    private List<Employee> employees;

    public EmployeeDirectory(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<String> findEmployeeInExperience (List<Employee> employees, Integer workExperience) {
        List<String> nameList = new ArrayList<>();
        for (Employee employee : employees) {
            if(employee.getWorkExperience() >= workExperience){
                nameList.add(employee.getName());
            }
        }
        return nameList;
    }

    public List<String> findPhoneInName (List<Employee> employees, String name) {
        List<String> phoneList = new ArrayList<>();
        for (Employee employee : employees) {
            if(employee.getName().equals(name)){
                phoneList.add(employee.getPhone());
            }
        }
        return phoneList;
    }

    public String findIdInName (List<Employee> employees, Integer id) {
        for (Employee employee : employees) {
            if(employee.getId().equals(id)){
                return employee.toString();
            }
        }
        return null;
    }

    public List<Employee> addNewEmployee (List<Employee> employees, Employee employee) {
        employees.add(employee);
        System.out.println("Employee added: " + employee);
        return employees;
    }
}
