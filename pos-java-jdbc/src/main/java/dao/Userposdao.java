package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import conexaojdbc.SingleConnection;
import model.Userposjava;

public class Userposdao {
	
	private Connection connection;
	
	public Userposdao() {
		connection = SingleConnection.getConnection();
	}
	
	public void salvar (Userposjava userposjava) {
		try {
		String sql = "insert into userposjava (id,nome,email) values(?,?,?)";
		PreparedStatement insert = connection.prepareStatement(sql);
		insert.setLong(1, 3);
		insert.setString(2, "Davi Salvar DAO");
		insert.setString(3, "davi.lauritzen1@gmail.com");
		insert.execute();
		connection.commit();
		
		}catch (Exception e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
	}

}
