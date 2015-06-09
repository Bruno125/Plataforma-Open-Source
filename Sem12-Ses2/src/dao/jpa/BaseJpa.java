package dao.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class BaseJpa {
	protected EntityManager em;
	
	protected static EntityManager obtenerEntityManager(){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Sem12-Ses2");
		return emf.createEntityManager();
	}
}
