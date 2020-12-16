package hibernate_test_one_to_many_uni;

import hibernate_test_one_to_many_uni.entity.Department;
import hibernate_test_one_to_many_uni.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {

    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Department.class)
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
             Session session = factory.getCurrentSession()) {

            Department department = new Department("HR", 700, 1600);
            Employee employee1 = new Employee("Anna", "Filimonova", 700);
            Employee employee2 = new Employee("Olga", "Lugacheva", 800);
            department.addEmployeeToDepartment(employee1);
            department.addEmployeeToDepartment(employee2);
            session.beginTransaction();
            session.save(department);

            session.getTransaction().commit();
            System.out.println("Done!");

        }
    }

}