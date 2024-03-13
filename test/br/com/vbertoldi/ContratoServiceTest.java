package br.com.vbertoldi;
import br.com.vbertoldi.dao.ContratoDAO;
import br.com.vbertoldi.dao.IContratoDAO;
import br.com.vbertoldi.dao.mock.ContratoDaoMock;
import br.com.vbertoldi.service.ContratoService;
import br.com.vbertoldi.service.IContratoService;
import org.junit.Test;
import org.junit.Assert;

public class ContratoServiceTest {

    //TODO implementar metodos buscar, excluir e atualizar

    @Test
    public void salvarTest() {
        IContratoDAO dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();

        Assert.assertEquals("Sucesso", retorno);
    }

    @Test (expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarComBancoDeDadosTest() {
        IContratoDAO dao = new ContratoDAO();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso",retorno);
    }

    @Test
    public void buscarTest() {
        IContratoDAO dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.buscar();

        Assert.assertEquals("Sucesso", retorno);
    }

    @Test (expected = UnsupportedOperationException.class)
    public void esperadoErroNoBuscarComBancoDeDadosTest() {
        IContratoDAO dao = new ContratoDAO();
        IContratoService service = new ContratoService(dao);
        String retorno = service.buscar();
        Assert.assertEquals("Sucesso",retorno);
    }

    @Test
    public void excluirTest() {
        IContratoDAO dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.excluir();

        Assert.assertEquals("Sucesso", retorno);
    }

    @Test (expected = UnsupportedOperationException.class)
    public void esperadoErroNoExcluirComBancoDeDadosTest() {
        IContratoDAO dao = new ContratoDAO();
        IContratoService service = new ContratoService(dao);
        String retorno = service.excluir();
        Assert.assertEquals("Sucesso",retorno);
    }

    @Test
    public void atualizarTest() {
        IContratoDAO dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.atualizar();

        Assert.assertEquals("Sucesso", retorno);
    }

    @Test (expected = UnsupportedOperationException.class)
    public void esperadoErroNoAtualizarComBancoDeDadosTest() {
        IContratoDAO dao = new ContratoDAO();
        IContratoService service = new ContratoService(dao);
        String retorno = service.atualizar();
        Assert.assertEquals("Sucesso",retorno);
    }




}
