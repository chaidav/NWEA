package com.NWEAPostApi.rest.posts.main;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.NWEAPostApi.rest.posts.dao.Posts;
import com.NWEAPostApi.rest.posts.dao.SessionUtil;

public class HibernateAnnotationMain {

	public static void main(String[] args) {
		
		//Get Session
		SessionFactory sessionFactory = SessionUtil.getSessionAnnotationFactory();
		Session session = sessionFactory.openSession();
		//start transaction
//		session.beginTransaction();
		 Query query =  session.createQuery("from Posts");
        @SuppressWarnings("unchecked")
		List<Posts> posts =  query.list();

		System.out.println("in psvm after query"+posts);
        session.close();
		System.out.println("Posts ="+posts);
		
		//terminate session factory, otherwise program won't end
		sessionFactory.close();
	}

}
