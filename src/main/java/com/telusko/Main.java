package com.telusko;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

//        To Fetch Data from database
        Alien a =new Alien();
        a.setAid(101);
        a.setAname("Brijesh");
        a.setTech("Java");


//        // Creates Hibernate configuration object.
//        Configuration config = new Configuration();
//
//        // Registers the annotated Entity class with Hibernate.
//        config.addAnnotatedClass(com.telusko.Alien.class);
//
//        // Loads Hibernate configuration from hibernate.cfg.xml.
//        config.configure("hibernate.cfg.xml");
//
//        // Creates SessionFactory (Heavy object, created only once per application).
//        SessionFactory factory = config.buildSessionFactory();

        // OR to reduce the code can directely right
        SessionFactory factory = new Configuration().addAnnotatedClass(com.telusko.Alien.class).configure().buildSessionFactory();

        // Opens a Session (Lightweight object used to communicate with the database).
        Session session = factory.openSession();

        // Begins a database transaction.
        Transaction transaction = session.beginTransaction();

        // Makes the object persistent (INSERT into database on commit).
        session.persist(a);

        // Commits the transaction and permanently saves data.
        transaction.commit();

        // Good practice (optional in simple examples).
        session.close();
        factory.close();

//-----------------------------------------------------------------------------------------------------------------------------//

//        // To fetch data from database
//        SessionFactory factory = new Configuration()
//                .addAnnotatedClass(com.telusko.Alien.class)
//                .configure()
//                .buildSessionFactory();
//
//        Session session = factory.openSession();
//
////        Eager fetching:
////        Eager fetching is a fetching strategy in which the required data is retrieved immediately from the database when the object is    requested.
////
////        Lazy fetching:
////        Lazy fetching is a fetching strategy in which the data is not retrieved immediately. Instead, Hibernate fetches it only when it is actually needed.
//
//        //Alien a2=session.getReference(Alien.class,102); -Lazy Fetching
//        Alien a1 = session.find(Alien.class, 102); // -Eager fetching
//        System.out.println(a1);
//
//        session.close();
//        factory.close();

// -----------------------------------------------------------------------------------------------------------------------------------------//

////To update the existing data from database.
//
//        Alien a =new Alien();
//        a.setAid(104);
//        a.setAname("Mandar");
//        a.setTech("SQL");
//        SessionFactory factory = new Configuration()
//                .addAnnotatedClass(com.telusko.Alien.class)
//                .configure()
//                .buildSessionFactory();
//
//        Session session = factory.openSession();
//
//        Transaction transaction = session.beginTransaction();
//
//        //merge will update the data if id present or create/insert new one in the table
//        session.merge(a);
//
//        transaction.commit();
//        session.close();
//        factory.close();

// -----------------------------------------------------------------------------------------------------------------------------------------//

//// To delete the existing data from database.
//
//        SessionFactory factory = new Configuration()
//                .addAnnotatedClass(com.telusko.Alien.class)
//                .configure()
//                .buildSessionFactory();
//
//        Session session = factory.openSession();
//
//        Transaction transaction = session.beginTransaction();
//
//        Alien a=session.find(Alien.class,104);
//
//        //remove will delete the data from the table
//        session.remove(a);
//
//        transaction.commit();
//        session.close();
//        factory.close();
    }
}
