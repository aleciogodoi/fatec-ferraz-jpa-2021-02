import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import javax.swing.JOptionPane;

public class Teste {
	public static void main(String[] args) {
		LocalDate data = LocalDate.of(2000, 1, 2);
		Pessoa pessoa1 = new Pessoa("José da Silva","1234442-01","212121-3",Date.valueOf(data), 1.75f, 73.2f);
		Pessoa pessoa2 = new Pessoa("Maria","9998181-01","122121-3",Date.valueOf(data), 1.67f, 59.8f);
		Pessoa pessoa3 = new Pessoa("Pedro","1121009-01","009887-3",Date.valueOf(data), 1.70f, 62.5f);

		
		pessoa2.setIdPessoa(2);
		pessoa2.setNome("Maria Aparecida");
		pessoa2.setPeso(58.f);
		Dao.update(pessoa2);
		
		/*
		Dao.insert(pessoa1);
		Dao.insert(pessoa2);
		Dao.insert(pessoa3); 

		JOptionPane.showMessageDialog(null, Dao.findId(1));
		JOptionPane.showMessageDialog(null, Dao.findId(2));
		JOptionPane.showMessageDialog(null, Dao.findCPF("9998181-01"));
		JOptionPane.showMessageDialog(null, Dao.findRG("009887-3"));
		
		Dao.delete(1);
		*/
		List<Pessoa> pessoas = Dao.all();
		String dadosPessoas = "";
		for(Pessoa p: pessoas) {
			dadosPessoas +="\n"+p;
		}
		JOptionPane.showMessageDialog(null, dadosPessoas);
	}
}
