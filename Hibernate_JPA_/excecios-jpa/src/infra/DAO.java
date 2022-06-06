package infra;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DAO <E>{
	
	private static EntityManagerFactory emf;
	private EntityManager em;
	
	static {
		try {
			emf = Persistence.createEntityManagerFactory("excecios-jpa");
			
		}catch (Exception e){
			
		}
	}

	public DAO() {
		em = emf.createEntityManager();
	}
	
	

}
