package org.simplilearn.workshop;

import org.hibernate.Session;
import org.simplilearn.workshop.domain.User;
import org.simplilearn.workshop.util.HibernateUtil;

public class Program {

	public static void main(String[] args) {
		System.out.println("hibernate configuration setup initaited -->");
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		System.out.println("Session was created successfully");
		
		session.beginTransaction();
		System.out.println("Begin Hibernate Transaction");
		
		User user = new User();
		user.setName("Saurabh Singh");
		user.setGoal(250);
		
		session.save(user);
		System.out.println("user is in persistent context");
		
		session.getTransaction().commit();
		System.out.println("user is inserted in database..");
		
		//getting data back
		
		session.beginTransaction();
		
		User loadUser = (User) session.get(User.class, 1);
		
		System.out.println(" Name : "+loadUser.getName());
		System.out.println(" Goal : "+loadUser.getGoal());
		
		// manipulate the loaded user
		loadUser.setTotal(50);
		
		// auto updating
		session.getTransaction().commit();
		
		session.close();
		System.out.println("session is closed");
		System.out.println("configuration was successfully completed");
	}
}
