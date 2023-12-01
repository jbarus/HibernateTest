package org.example;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {
    private SessionFactory sessionFactory;

    protected void setUp() throws Exception{
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .build();

        try{
            sessionFactory = new MetadataSources(registry).addAnnotatedClass(Teacher.class).buildMetadata().buildSessionFactory();
        }catch (Exception e){
            System.out.println(e.getMessage());
            StandardServiceRegistryBuilder.destroy(registry);
        }
    }

    public void test(){
        sessionFactory.inTransaction(session ->
                session.persist(new Teacher("Jakub","Kowalski", TeacherStatus.PRESENT,1950,6500.0)));
    }

}
