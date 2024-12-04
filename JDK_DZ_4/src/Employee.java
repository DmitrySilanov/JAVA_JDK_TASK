public class Employee {
    private final Integer id;
    private String name;
    private String phone;
    private Integer workExperience;

    public Employee(Integer id, String name, String phone, Integer workExperience) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.workExperience = workExperience;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public Integer getWorkExperience() {
        return workExperience;
    }

    @Override
    public String toString() {
        return "Employee {" +
                "id = " + id +
                ", name = '" + name + '\'' +
                ", phone = '" + phone + '\'' +
                ", workExperience = " + workExperience +
                '}';
    }
}
