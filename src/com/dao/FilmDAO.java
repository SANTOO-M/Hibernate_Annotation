package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Film;

public class FilmDAO {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		Film f1=new Film();
		f1.setFilmName("Vaarisu");
		f1.setDirector("Vamsi");
		
		Film f2=new Film();
		f2.setFilmName("Vikram");
		f2.setDirector("Lokesh");
		
		Film f3=new Film();
		f3.setFilmName("Beast");
		f3.setDirector("Nelson");
		
		session.save(f1);
		session.save(f2);
		session.save(f3);
		tx.commit();
		session.close();
	}

}
