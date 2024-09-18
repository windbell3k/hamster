package org.windbell.lab.hamster.hibernate;

import org.windbell.lab.hamster.hibernate.entity.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateTest {
    static Session session = null;
    static Random random = new Random();
    static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(HibernateTest.class);

    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        String hibrenateConfigPaht = "./hibernate.cfg.xml";
        cfg.configure(hibrenateConfigPaht);
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        session = sessionFactory.openSession();
        log.debug("debug");
        log.info("info");
        log.warn("warn");
        log.error("error");
        log.trace("trace");

        SQLQuery query = session.createSQLQuery("SELECT NOW()");

        List list = query.list();
        for (Object object : list) {
            log.info("test query resutl is [{}].", object.toString());
        }

        Enumeration enumeration = new Enumeration();
        enumeration.setDisplayName("性别");
        enumeration.setEnumCode("1001");
        enumeration.setEnumName("性别");
        enumeration.setEnumType(2372);
        enumeration.setSortNumber("111");

        List<EnumerationValue> enumerationValues = new ArrayList<EnumerationValue>();
        EnumerationValue enumerationValue = new EnumerationValue();
        enumerationValue.setDescription("男");
        enumerationValue.setDisplayName("男");
        enumerationValues.add(enumerationValue);

        EnumerationValue enumerationValue2 = new EnumerationValue();
        enumerationValue2.setDescription("女");
        enumerationValue2.setDisplayName("女");
        enumerationValues.add(enumerationValue2);

        enumeration.setEnumerationValues(enumerationValues);
        Transaction transaction = session.beginTransaction();
        session.save(enumeration);
        transaction.commit();
        session.flush();
        Query query2 = session.createQuery("from Enumeration");
        List list2 = query2.list();
        for (Object object : list2) {
            System.out.println(object);
        }
        Enumeration enumeration2 = (Enumeration) session.get(Enumeration.class, enumeration.getId());
        System.out.println(enumeration2);

        EnumerationValue value = (EnumerationValue) session.get(EnumerationValue.class, enumerationValue.getId());
        System.out.println(value);

        boolean assignableFrom = Mode.class.isAssignableFrom(value.getClass());
        boolean assignableFrom2 = value.getClass().isAssignableFrom(Mode.class);
        System.out.println(assignableFrom);
        System.out.println(assignableFrom2);
        Student student = new Student();
        student.setCommonMode(new CommonMode("121"));
        student.setName("name");
        transaction = session.beginTransaction();
        session.saveOrUpdate(student);
        transaction.commit();

        Query fromStudent = session.createQuery("from Student");

        Student o = (Student) session.get(Student.class, student.getId());
        System.out.println(o);
        o.setName("007");
        transaction = session.beginTransaction();
        session.update(o);
        transaction.commit();
        session.flush();

        transaction = session.beginTransaction();
        session.delete(o);
        transaction.commit();
        session.flush();
        User user = new User();
        user.setUsername("username");
		user.setCreator("creator");
		user.setUpdater("updater");
		transaction = session.beginTransaction();
		session.save(user);
		transaction.commit();
		session.flush();
        User u = (User)session.get(User.class, user.getId());
        System.out.println(u);
    }
}
