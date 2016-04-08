package br.sceweb.servico;

import java.sql.Connection;
import java.sql.DriverManager;

import org.apache.log4j.Logger;



public class FabricadeConexoes {
	Logger logger = Logger.getLogger(FabricadeConexoes.class);
	public Connection getConnection(){
		String url = "jdbc:mysql://localhost/sceweb";
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
					return DriverManager.getConnection(url,"root","aluno");
		} catch(Exception e){
			logger.info("SQLException na classe FabricadeConexoes causa :"+ e.getMessage());
			throw new RuntimeException();
			
		}
	}

}