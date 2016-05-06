package br.sceweb.teste;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.sceweb.modelo.Convenio;
import br.sceweb.modelo.ConvenioDAO;
import br.sceweb.modelo.Empresa;
import br.sceweb.modelo.EmpresaDAO;

@SuppressWarnings("unused")
public class UC05CadastrarConvenio {
	static ConvenioDAO convenioDAO;
	static Convenio convenio;
	static Convenio novoConvenio;
	static EmpresaDAO empresaDAO;
	static Empresa empresa;
	static String cnpj;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	empresaDAO = new EmpresaDAO();
	empresa = new Empresa();
	empresa.setNomeEmpresa("empresa x");
	empresa.setCnpj("81965361000174");
	empresa.setNomeFantasia("empresa x");
	empresa.setEndereco("rua taquari");
	empresa.setTelefone("2222");
	empresaDAO.adiciona(empresa);
	convenioDAO = new ConvenioDAO();
	convenio = new Convenio("81965361000174","03/05/2016", "20/05/2016");
	}
	
	@Test
	public void CT01UC05CadastrarConvenio_com_sucesso() {
	assertEquals(1,convenioDAO.adiciona(convenio));
	
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
	}

	

}
