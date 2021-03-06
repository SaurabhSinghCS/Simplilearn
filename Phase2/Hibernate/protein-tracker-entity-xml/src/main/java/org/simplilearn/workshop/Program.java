package org.simplilearn.workshop;

import java.util.Date;

import org.hibernate.Session;
import org.simplilearn.workshop.model.User;
import org.simplilearn.workshop.model.UserHistory;
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
		user.addHistory(new UserHistory(new Date(), "set name to Saurabh"));
		user.setGoal(250);
		user.addHistory(new UserHistory(new Date(), "set the goal to 250"));
		
		session.save(user);
		System.out.println("user is in persistent context");
		
		session.getTransaction().commit();
		System.out.println("user is inserted in database..");
		
		//getting data back
		
		session.beginTransaction();
		
		User loadUser = (User) session.get(User.class, 1);
		
		System.out.println(" Name : "+loadUser.getName());
		System.out.println(" Goal : "+loadUser.getGoal());
		
		for(UserHistory history : loadUser.getHistory()) {
			System.out.println(history.getEntryTime().toString()+"  "+history.getEntry());
		}
		
		// manipulate the loaded user
		loadUser.setTotal(50);
		loadUser.addHistory(new UserHistory(new Date(),"Added 50 protein"));
		
		// auto updating
		session.getTransaction().commit();
		
		session.close();
		System.out.println("session is closed");
		System.out.println("configuration was successfully completed");
	}
}
