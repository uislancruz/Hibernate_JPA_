package teste.basico.heranca;

import infra.DAO;
import modelo.basico.heranca.Aluno;
import modelo.basico.heranca.AlunoBolsista;

public class NovoAluno {
	
	public static void main(String[] args) {
		
		DAO<Aluno> alunoDAO = new DAO<>();
		
		Aluno aluno1 = new Aluno(123L, "João");
		AlunoBolsista aluno2 = new AlunoBolsista(345L, "Aluno", 1000);
		
		alunoDAO.incluirAtomico(aluno1);
		alunoDAO.incluirAtomico(aluno2);
		
		alunoDAO.fechar();
		
	}

}
