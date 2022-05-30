package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario3 {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("excecios-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Usuario usuario = em.find(Usuario.class, 7L);
		em.detach(usuario); //tirar o objeto do estado gerencia. Para garantir que só será alterado se realmente for solicitado
		
		em.merge(usuario);//Faz com que altere. 
		
		usuario.setNome("Leonado Leitão");
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
}
