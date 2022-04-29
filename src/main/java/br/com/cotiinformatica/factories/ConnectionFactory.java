package br.com.cotiinformatica.factories;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	
	//Atributos
	private static final String HOST = "jdbc:mysql://localhost:3306/bd_agendaweb?useTimezone=True&serverTimezone=UTC&useSSL=false";
	private static final String USER = "root";
	private static final String PASS = "coti";
	private static final String DRIVER = "com.mysql.jdbc.Driver";	
	
	//método para abrir e retornar conexao com o MYSQL
	public static Connection getConnection() throws Exception {
		
		//carregar o driver de conexao JDBC do MySQL
		Class.forName(DRIVER);
		
		//abrir e retornar a conexao
		return DriverManager.getConnection(HOST, USER, PASS);
	}
	
	
	
}
