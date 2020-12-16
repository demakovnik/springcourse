package hibernate_test_one_to_many;


import hibernate_test_one_to_many.entity.Department;
import hibernate_test_one_to_many.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {

    public static void main(String[] args) {

        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();
             Session session = factory.getCurrentSession()) {
            session.beginTransaction();
            Department department = new Department("IT",300,1200);
            Employee employee = new Employee("Nikitos","Demakov",1000);
            Employee employee1 = new Employee("Elena","Smirnova",1000);
            department.addEmployeeToDepartment(employee);
            department.addEmployeeToDepartment((employee1));
            session.save(department);
            session.getTransaction().commit();
            System.out.println("Done!");
        }
    }
}
