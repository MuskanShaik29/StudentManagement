package jpaStudent;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JPAUtil {
	private static final EntityManagerFactory emf=Persistence.createEntityManagerFactory("PU");
	
	public static EntityManager getEntityManager() {
		 return emf.createEntityManager();
	}
	public static void close() {
		emf.close();
	}


}
