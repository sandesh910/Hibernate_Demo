package com.telusko;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        Alien a =new Alien();
        a.setAid(102);
        a.setAname("Sandesh");
        a.setTech("Spring");


        // Creates Hibernate configuration object.
        Configuration config = new Configuration();

        // Registers the annotated Entity class with Hibernate.
        config.addAnnotatedClass(Alien.class);

        // Loads Hibernate configuration from hibernate.cfg.xml.
        config.configure("hibernate.cfg.xml");

        // Creates SessionFactory (Heavy object, created only once per application).
        SessionFactory factory = config.buildSessionFactory();

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
    }
}
