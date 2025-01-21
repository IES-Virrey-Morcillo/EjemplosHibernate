package com.example;

import com.example.model.Producto;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

public class ProductoTest {

    @Test
    void persist() {

        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction transaction = session.beginTransaction();

        Producto p = new Producto("Lápiz",52, BigDecimal.valueOf(0.75), LocalDate.now(),"Un lápiz amarillo y negro");

        System.out.println("Producto antes de persistir X: " + p);

        session.persist(p);

        System.out.println("Producto X: " + p);

        transaction.commit();
        session.close();
    }
}
