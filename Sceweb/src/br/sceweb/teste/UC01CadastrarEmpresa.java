package br.sceweb.teste;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.sceweb.modelo.Empresa;
import br.sceweb.modelo.EmpresaDAO;

public class UC01CadastrarEmpresa {
    static EmpresaDAO empresaDAO;
    static Empresa empresa;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		empresaDAO = new EmpresaDAO();
		empresa = new Empresa();
		empresa.setCnpj("12345678910");
		empresa.setNomeEmpresa("O tal da Empresa");
		empresa.setNomeFantasia("O tal");
		empresa.setEndereco("rua rua rua ");
		empresa.setTelefone("123456789");
	}
	
	@Test
	public void CT01UC01CadastrarEmpresa_com_sucesso() {
		assertEquals(1, empresaDAO.adiciona(empresa)); 
		assertEquals(1, empresaDAO.excluir("12345678910"));
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	

}
