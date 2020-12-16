package hibernate_test_one_to_many_bi;

import hibernate_test_one_to_many_bi.entity.Department;
import hibernate_test_one_to_many_bi.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {

    public static void main(String[] args) {
        /*try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Department.class)
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
             Session session = factory.getCurrentSession()) {
            Department department = new Department("Sales", 800, 1500);
            Employee emp1 = new Employee("Zaur", "Tregulov", 800);
            Employee emp2 = new Employee("Elena", "Smirnova", 1500);
            Employee emp3 = new Employee("Anton","Sidorov",1200);
            department.addEmployeeToDepartment(emp1);
            department.addEmployeeToDepartment(emp2);
            department.addEmployeeToDepartment(emp3);
            session.beginTransaction();
            session.save(department);

            session.getTransaction().commit();
            System.out.println("Done!");

        }
    }*/
        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Department.class)
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
             Session session = factory.getCurrentSession()) {


            session.beginTransaction();
            System.out.println("Get department:");
            Department department = session.get(Department.class, 3);
            System.out.println("Show department:");
            System.out.println(department);
            System.out.println("Show employees of the department:");
            System.out.println(department.getEmployees());
            session.getTransaction().commit();
            System.out.println("Done!");

        }
    }

}