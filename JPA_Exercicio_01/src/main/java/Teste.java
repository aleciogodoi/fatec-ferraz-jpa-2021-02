import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.entidade.Aluno;
import com.servicos.AlunoCRUD;

public class Teste {

	public static void main(String[] args) {
		// objeto com os servicos de banco de dados
		AlunoCRUD crud = new AlunoCRUD();
		/*
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		
		alunos.add(new Aluno("1010-1","Pedro","pedro@gmail.com", "(11) 9955-8888", 7.5, 7));
		alunos.add(new Aluno("1111-2","Ana","ana@gmail.com", "(11) 9555-9999",7.5, 8));
		alunos.add(new Aluno("1010-3","Carla","carla@gmail.com", "(11) 9965-8888", 6, 7));
		alunos.add(new Aluno("1111-4","Marcelo","marelo@gmail.com", "(11) 9755-9999",9, 8));
		alunos.add(new Aluno("1010-5","Thiago","thiago@gmail.com", "(11) 9985-8888", 8, 5));
		alunos.add(new Aluno("1111-6","Herique","herique@gmail.com", "(11) 9335-9999",6, 8.2));
		alunos.add(new Aluno("1010-7","Maria","maria@gmail.com", "(11) 9955-5588", 10, 7));
		alunos.add(new Aluno("1111-8","Joana","joana@gmail.com", "(11) 9555-7799", 5, 8));

		for (Aluno aluno: alunos) {
			crud.insert(aluno);
		}
		crud.delete("1111-6");
		
		Aluno aluno = crud.find("1111-6");
		if (aluno == null) {
			JOptionPane.showMessageDialog(null, "Aluno Não Encontrado!");
		} else {
			JOptionPane.showMessageDialog(null, aluno);
		}
		
		Aluno aluno2 = crud.find("1111-2");
		if (aluno2 == null) {
			JOptionPane.showMessageDialog(null, "Aluno Não Encontrado!");
		} else {
			JOptionPane.showMessageDialog(null, aluno2);
		}
		*/
		for (Aluno aluno: crud.getAll()) {
			System.out.println(aluno);
		}
	
		
	}

}
