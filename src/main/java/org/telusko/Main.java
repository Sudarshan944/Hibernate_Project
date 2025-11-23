package org.telusko;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.telusko.Alien;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        Student s1 = new Student();
//        s1.setsName("Sudarshan");
//        s1.setRollNo(100);
//        s1.setsAge(22);
//        Student s2 = null;

//        Configuration cfg = new Configuration(); // for specifying database configuration
//        cfg.addAnnotatedClass(org.telusko.Student.class);
//        cfg.configure();
        //cfg.buildSessionFactory();
//        Laptop l1 = new Laptop();
//        l1.setLid(4);
//        l1.setBrand("ASUS");
//        l1.setModel("STRIPES");
//        l1.setRam(32);

//
//        SessionFactory sf = new Configuration()
//               // .addAnnotatedClass(org.telusko.Alien.class)
//                .addAnnotatedClass(org.telusko.Laptop.class)
//                .configure()
//                .buildSessionFactory();
//        Session session = sf.openSession();

        // select * from laptop where ram=32 --> SQL
        // from laptop where ram=32 --> HQL

//        String brand = "ASUS";
//
//        Query query = session.createQuery("select brand, model from Laptop where brand like ?1");
//
//        query.setParameter(1,brand);
////        query.setParameter(2,32);
//
//        List<Object[]> results = query.getResultList();
//
//        for(Object[] result: results){
//            System.out.println(result[0]+" "+ result[1]);
//
//        }

//        Laptop l1 = session.find(Laptop.class,"ASUS");
//
//        System.out.println(l1);

//        s1=session.find(Student.class,106);

        //Transaction transaction = session.beginTransaction(); // No need for fetching only required for manipulation

//        session.persist(s1);

        //session.persist(l1);

        //transaction.commit();


//        session.close();
//
//
//        Session session1 = sf.openSession();
//
//        Alien a4=session1.find(Alien.class,101);
//        //System.out.println(a4);
//
//        session1.close();


//        sf.close();
//        System.out.println(a1);








        // Fetching

        SessionFactory sf = new Configuration()
                // .addAnnotatedClass(org.telusko.Alien.class)
                .addAnnotatedClass(org.telusko.Laptop.class)
                .configure()
                .buildSessionFactory();
        Session session = sf.openSession();

        //Laptop l1 = session.load(Laptop.class,2);
        //System.out.println(l1);


        session.close();
        sf.close();
    }
}