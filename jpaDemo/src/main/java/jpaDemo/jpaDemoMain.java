package jpaDemo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class jpaDemoMain {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Student_details");
		
//		Persistence - The Persistence is a bootstrap class which is used to obtain an EntityManagerFactory interface.
//		createEntityManagerFactory() method - The role of this method is to create and return an EntityManagerFactory for the named persistence unit. Thus, this method contains the name of persistence unit passed in the Persistence.xml file.

		EntityManager em = emf.createEntityManager();
		
		//em.getTransaction().begin();  

		Student stu = em.find(Student.class, 4);

		// System.out.println("Hello world");
	}

}
