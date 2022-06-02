package pos_java_jdbc.pos_java_jdbc;

import java.util.List;

import org.junit.Test;

import dao.Userposdao;
import model.Userposjava;

public class TesteBancoJdbc {

	@Test
	public void initBanco() {
		Userposdao userposdao = new Userposdao();
		Userposjava userposjava = new Userposjava();

		userposjava.setId(5L);
		userposjava.setNome("Matheus");
		userposjava.setEmail("mateus@gmail.com");

		userposdao.salvar(userposjava);
	}

	public void initListar() {
		Userposdao dao = new Userposdao();

		try {
			List<Userposjava> list = dao.listar();

			for (Userposjava userposjava : list) {
				System.out.println(userposjava.getNome());
				System.out.println("=================");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
