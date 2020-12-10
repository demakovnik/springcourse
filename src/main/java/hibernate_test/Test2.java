package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test2 {

    public static void main(String[] args) {

        try(SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
            List<Employee> emps = session.createQuery("from Employee where " +
                    "name = 'Nikitos' AND salary > 700")
                    .getResultList();

            for(Employee e: emps) {
                System.out.println(e);
            }

            session.getTransaction().commit();
            System.out.println("Done!");
        }


    }
}
