public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Kemal",2000,45,1985);

        Employee employee1 = new Employee("Muhammed",5000,40,2000);

        employee.information();
        System.out.println("*********************************");
        employee1.information();
    }
}