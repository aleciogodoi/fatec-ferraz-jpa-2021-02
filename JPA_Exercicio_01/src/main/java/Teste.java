import com.entidade.Aluno;
import com.servicos.AlunoCRUD;

public class Teste {

	public static void main(String[] args) {
		// objeto com os servicos de banco de dados
		AlunoCRUD crud = new AlunoCRUD();
		
		Aluno aluno01 = new Aluno("1010-1","Pedro Henrique","pedro@gmail.com", "(11) 9955-8888", 7.5, 7);
		Aluno aluno02 = new Aluno("1111-2","Ana Beatriz","ana@gmail.com", "(11) 9555-9999",7.5, 8);

		//crud.insert(aluno01);
		//crud.insert(aluno02);
		crud.update(aluno01);
		crud.update(aluno02);
		
	}

}
