package org.example;

public class Main {
    public static void main(String[] args) throws Exception {
        HibernateUtil util = new HibernateUtil();
        util.setUp();
        util.test();
    }
}