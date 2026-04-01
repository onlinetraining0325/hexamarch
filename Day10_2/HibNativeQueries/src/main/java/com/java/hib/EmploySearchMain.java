package com.java.hib;

import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmploySearchMain {
    public static void main(String[] args) {

        int empno;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employ Number");
        empno = sc.nextInt();

        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session session = sf.openSession();

        String cmd = "SELECT * FROM Employ WHERE empno = :empno";

        Employ employ = (Employ) session
                .createNativeQuery(cmd, Employ.class)
                .setParameter("empno", empno)
                .getSingleResult();

        if (employ != null) {
            System.out.println(employ);
        }

        session.close();
        sf.close();
    }
}