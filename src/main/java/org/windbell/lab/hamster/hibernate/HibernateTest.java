package org.windbell.lab.hamster.hibernate;

import java.util.List;
import java.util.Random;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTest {
	static Session session =null;
	static Random random=new Random();
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
			log.info("test query resutl is [{}].",object.toString());
		}
	}
}
