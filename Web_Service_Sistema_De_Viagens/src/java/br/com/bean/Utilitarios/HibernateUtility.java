package br.com.bean.Utilitarios;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateUtility {

    private static SessionFactory factory;
    private static Configuration configuration;

    static {
        try {
            configuration = new Configuration().configure();
            factory = configuration.buildSessionFactory();

        } catch (Exception e) {
            e.printStackTrace();
            factory = null;
        }
    }

    public static Session getSession() {
        return factory.openSession();
    }
}
