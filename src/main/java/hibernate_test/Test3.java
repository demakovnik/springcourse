package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test3 {

    public static void main(String[] args) {

        try(SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
            /*Employee employee = session.get(Employee.class,1);
            employee.setSalary(2000);*/
            session.createQuery("update Employee set salary=3000" +
                    "where firstName = 'Nikitos'").executeUpdate();


            session.getTransaction().commit();
            System.out.println("Done!");
        }


    }
}
