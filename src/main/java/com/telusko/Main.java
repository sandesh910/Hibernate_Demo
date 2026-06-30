package com.telusko;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        Alien a =new Alien();
        a.setAid(10);
        a.setAname("Sudhir");
        a.setTech("Java");

        Configuration config = new Configuration();

        config.addAnnotatedClass(com.telusko.Alien.class);

        config.configure("hibernate.cfg.xml");

        SessionFactory factory = config.buildSessionFactory();

        Session session = factory.openSession();
        Transaction transaction= session.beginTransaction();
        session.persist(a);
        transaction.commit();
    }
}
