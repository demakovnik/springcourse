package hibernate_test_2;


import hibernate_test_2.entity.Detail;
import hibernate_test_2.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {

    public static void main(String[] args) {

        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();) {
            Session session = factory.getCurrentSession();

            Employee emp = new Employee("Nikitos", "Demakov", "IT", 500);
            Detail detail = new Detail("Molchanovo","123456","demakoffnik@gmail.com");
            emp.setEmpDetail(detail);
            session.beginTransaction();
            session.save(emp);
            session.getTransaction().commit();
        }
    }
}
