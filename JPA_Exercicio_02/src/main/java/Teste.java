import java.sql.Date;
import java.time.LocalDate;

public class Teste {
	public static void main(String[] args) {
		LocalDate data = LocalDate.of(2000, 1, 2);
		Pessoa pessoa1 = new Pessoa("José da Silva","1234442-01","212121-3",Date.valueOf(data), 1.75f, 73.2f);
		Pessoa pessoa2 = new Pessoa("Maria","9998181-01","122121-3",Date.valueOf(data), 1.67f, 59.8f);
		Pessoa pessoa3 = new Pessoa("Pedro","1121009-01","009887-3",Date.valueOf(data), 1.70f, 62.5f);

		Dao.insert(pessoa1);
		Dao.insert(pessoa2);
		Dao.insert(pessoa3);
	}
}
