package be.assign;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class InserData {
    public static void main(String[] args) {
        SessionFactory sessions =new AnnotationConfiguration().configure().buildSessionFactory();
            Session session = sessions.openSession();
        session.beginTransaction();
        Person person = new Person();
        person.setId(6);
        person.setName("Devis");
        person.setSurname("Kevin");
        person.setAddress("testStraat");
        session.save(person);
        session.getTransaction().commit();
    }

}
