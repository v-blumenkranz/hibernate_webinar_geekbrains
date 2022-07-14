package com.geekbrains.geekchange.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class MainApp {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .addAnnotatedClass(Item.class)
                .addAnnotatedClass(User.class)
                .addAnnotatedClass(UserDetails.class)
                .buildSessionFactory();

        Session session = null;

        // === CREATE ===
//        session = sessionFactory.getCurrentSession();
//        session.beginTransaction();
//        Item item = new Item("milk", 80);
//        System.out.println(item);
//        session.save(item);
//        session.getTransaction().commit();

        // === READ ===
//        session = sessionFactory.getCurrentSession();
//        session.beginTransaction();
//        Item itemFromDD = session.get(Item.class, 1L);
//        System.out.println(itemFromDD);
//        session.getTransaction().commit();

//        session = sessionFactory.getCurrentSession();
//        session.beginTransaction();

//        Item itemfromDB = session.createQuery("SELECT i FROM Item i WHERE i.id = :id", Item.class)
//                .setParameter("id", 3L)
//                .getSingleResult();
//        System.out.println(itemfromDB);

//        List<Item> items = session.createQuery("SELECT i FROM Item i", Item.class).getResultList();
//        System.out.println(items);
//        session.getTransaction().commit();

        // === UPDATE ===
//        session = sessionFactory.getCurrentSession();
//        session.beginTransaction();
//        Item itemfrombd = session.get(Item.class, 1L);
//        System.out.println(itemfrombd);
//        itemfrombd.setPrice(80);
//        itemfrombd = session.get(Item.class, 1L);
//        System.out.println(itemfrombd);
//        session.getTransaction().commit();


        // === DELETE ===
//        session = sessionFactory.getCurrentSession();
//        session.beginTransaction();
//        Item anotherItemFromDB = session.get(Item.class, 1L);
//        session.remove(anotherItemFromDB);
//        session.getTransaction().commit();

        session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        User user = session.get(User.class, 1L);
        System.out.println(user);
        System.out.println(user.getDetails());
        System.out.println(user.getDetails().getUser());
        session.getTransaction().commit();



        sessionFactory.close();
    }
}
