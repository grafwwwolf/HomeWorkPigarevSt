

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
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Pigarev Stanislav Mikhailovich", "Java Developer", "mail@mail.ru", "89991111111", 100000, 33);
        employees[1] = new Employee("Kurochkin Aleksey Nikolaevich", "Manager", "kural@mail.ru", "89992222222", 60000, 38);
        employees[2] = new Employee("Ivanov Sergey Petrovich", "Driver", "ivsep@mail.ru", "89993333333", 45000, 52);
        employees[3] = new Employee("Gorbach Dmitry Viktorovich", "Director", "gordyi64@mail.ru", "89994444444", 450000, 50);
        employees[4] = new Employee("Mineeva Elena Borisovna", "Chief accountant", "mineevaglbuh@mail.ru", "89995555555", 85000, 41);

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].age > 40) {
                employees[i].printEmp();
            }
        }
    }


    public void printEmp() {
        System.out.println("Employee name: " + fullName + ", post: " + post + ", email: " + email + ", phone: " + phone + ", salary: " + salary + ", age: " + age + ".");
    }
}


