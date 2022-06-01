package pos_java_jdbc.pos_java_jdbc;

import org.junit.Test;

import conexaojdbc.SingleConnection;
import dao.Userposdao;
import model.Userposjava;

public class TesteBancoJdbc  {
	
	@Test
	public void initBanco() {
		Userposdao userposdao = new Userposdao();
		Userposjava userposjava = new Userposjava();
		
		userposjava.setId(5L);
		userposjava.setNome("Matheus");
		userposjava.setEmail("mateus@gmail.com");
		
		userposdao.salvar(userposjava);
	}
}
