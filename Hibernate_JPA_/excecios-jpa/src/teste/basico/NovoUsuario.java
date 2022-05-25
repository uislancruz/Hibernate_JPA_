package teste.basico;

import javax.persistence.EntityManager; 
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class NovoUsuario {
	public static void main(String args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("excecios-jpa");
		EntityManager em = emf.createEntityManager();
		
		Usuario novoUsuario = new Usuario("Djalma", "djalma@lanche.com.br");
		novoUsuario.setId(1L);
		em.persist(novoUsuario);
		
		em.close();
		emf.close();
	}

}
