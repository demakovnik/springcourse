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
            Employee employee = session.get(Employee.class,1);
            session.delete(employee);
            session.getTransaction().commit();

            System.out.println("Done!");
        }
    }
}
