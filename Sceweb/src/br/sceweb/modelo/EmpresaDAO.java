package br.sceweb.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.sceweb.servico.FabricadeConexoes;

public class EmpresaDAO {
	
	public int adiciona(Empresa empresa){
		PreparedStatement ps;
		int codigoRetorno = 0;
		
		
		try(Connection conn = new FabricadeConexoes().getConnection()){
			ps = conn.prepareStatement("insert into empresa(cnpj, nomeEmpresa, nomeFantasia, endereco, "
					+ "telefone)values (?,?,?,?,?)");
			ps.setString(1, empresa.getCnpj());
			ps.setString(2,empresa.getNomeEmpresa());
			ps.setString(3,empresa.getNomeFantasia());
			ps.setString(4,empresa.getEndereco());
			ps.setString(5,empresa.getTelefone());
			codigoRetorno = ps.executeUpdate();
			ps.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
		return codigoRetorno;
	}
	
	public int excluir(String cnpj){
		PreparedStatement ps;
		int codigoRetorno = 0;
		
		
		try(Connection conn = new FabricadeConexoes().getConnection()){
			ps = conn.prepareStatement("delete from empresa where cnpj = ?");
			ps.setString(1, cnpj);
			codigoRetorno = ps.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
		return codigoRetorno;
		
		
		
	}

}
