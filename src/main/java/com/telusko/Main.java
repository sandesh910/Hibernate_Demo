package com.telusko;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

//        To Fetch Data from database
//        Alien a =new Alien();
//        a.setAid(103);
//        a.setAname("Brijesh");
//        a.setTech("Python");


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

//        // OR to reduce the code can directely right
//        SessionFactory factory = new Configuration().addAnnotatedClass(com.telusko.Alien.class).configure().buildSessionFactory();
//
//        // Opens a Session (Lightweight object used to communicate with the database).
//        Session session = factory.openSession();
//
//        // Begins a database transaction.
//        Transaction transaction = session.beginTransaction();
//
//        // Makes the object persistent (INSERT into database on commit).
//        session.persist(a);
//
//        // Commits the transaction and permanently saves data.
//        transaction.commit();
//
//        // Good practice (optional in simple examples).
//        session.close();
//        factory.close();

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

//To update the existing data from database.

        Alien a =new Alien();
        a.setAid(10);
        a.setAname("Mahesh");
        a.setTech("Django");
        SessionFactory factory = new Configuration()
                .addAnnotatedClass(com.telusko.Alien.class)
                .configure()
                .buildSessionFactory();

        Session session = factory.openSession();

        Transaction transaction = session.beginTransaction();

        session.merge(a);

        session.close();
        factory.close();
    }
}
