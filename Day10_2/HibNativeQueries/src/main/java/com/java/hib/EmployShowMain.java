package com.java.hib;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.Query;

public class EmployShowMain {
    public static void main(String[] args) {

        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session session = sf.openSession();

        String sql = "SELECT * FROM Employ";
        
        Query query = session.createNativeQuery(sql);

        List<Object[]> employList = query.getResultList();

        for (Object[] ob : employList) {
            System.out.println(ob[0] + " --- " + ob[1]);
        }

        session.close();
        sf.close();
    }
}