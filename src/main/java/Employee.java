

public class Employee {

    private String fullName;
    private String post;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String fullName, String post, String email, String   phone, int salary, int age) {
        this.fullName = fullName;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void printEmp() {
        System.out.println("Employee name: " + fullName + ", post: " + post + ", email: " + email + ", phone: " + phone + ", salary: " + salary + ", age: " + age + ".");
    }
}


