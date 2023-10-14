public class EmployeeTest {
    public static void main(String[] args) {
        Sortable[] staff = new Sortable[3];
        staff[0] = new Employee("Antonio Rossi", 2000000, 1, 10, 1989);
        staff[1] = new Manager("Maria Bianchi", 2500000, 1, 12, 1991);
        staff[2] = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);

        // Implement shell_sort method or any other sorting method here

        for (int i = 0; i < 3; i++)
            ((Employee) staff[i]).print();
    }
}
