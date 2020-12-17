package hibernate_test_many_to_many;

import hibernate_test_many_to_many.entity.Child;
import hibernate_test_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {

    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();
             Session session = factory.getCurrentSession()) {
            Section section = new Section("Dance");
            Child child1 = new Child("Olya",12);
            Child child2 = new Child("Petya",10);
            Child child3 = new Child("Grisha",11);
            section.addChildToSection(child1);
            section.addChildToSection(child2);
            section.addChildToSection(child3);
            session.beginTransaction();
            session.persist(section);
            session.getTransaction().commit();
            System.out.println("Done!");
        }
    }
}