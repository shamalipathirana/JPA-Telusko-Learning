package jpaDemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class jpaDemoMain {

	public static void main(String[] args) {
		
		StudentDetails stu = new StudentDetails();
		stu.setName("Manuja");
		stu.setStudentId(13);
		stu.setSubjectName("History");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Students");
		
//		Persistence - The Persistence is a bootstrap class which is used to obtain an EntityManagerFactory interface.
//		createEntityManagerFactory() method - The role of this method is to create and return an EntityManagerFactory for the named persistence unit. Thus, this method contains the name of persistence unit passed in the Persistence.xml file.

		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();  

		//Student stu = em.find(Student.class, 4);
		
        em.persist(stu);
        
        StudentDetails s =em.find(StudentDetails.class,12);
        
        System.out.println("Student name = "+s.getName());
        System.out.println("Student Subject = "+s.getSubjectName());
        em.getTransaction().commit();
        
        emf.close();
        em.close();
        
		// System.out.println("Hello world");
	}

}
