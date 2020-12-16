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
            session.beginTransaction();
            Department department = session.get(Department.class,1);
            System.out.println(department.getEmployees());

            session.getTransaction().commit();
            System.out.println("Done!");

        }
    }

}