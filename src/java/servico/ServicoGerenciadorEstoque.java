package servico;

import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import negocio.GerenciadorEstoque;
import vo.ProdutoVO;

@WebService(serviceName = "ServicoGerenciadorEstoque")
public class ServicoGerenciadorEstoque {

    private GerenciadorEstoque gerenciadorEstoque;

    public ServicoGerenciadorEstoque() {
        this.gerenciadorEstoque = new GerenciadorEstoque();
    }
    
    @WebMethod
    public void adicionarProduto (ProdutoVO produtoVO) throws Exception {
        gerenciadorEstoque.adicionarProduto(produtoVO);
    }
    
    @WebMethod
    public void removerProduto (ProdutoVO produtoVO) throws Exception {
        gerenciadorEstoque.removerProduto(produtoVO);
    }
    
    @WebMethod
    public void adicionarEstoqueProduto (ProdutoVO produtoVO, int quantidade) throws Exception {
        gerenciadorEstoque.adicionarEstoqueProduto(produtoVO, quantidade);
    }
    
    @WebMethod
    public void baixarEstoqueProduto (ProdutoVO produtoVO, int quantidade) throws Exception {
        gerenciadorEstoque.baixarEstoqueProduto(produtoVO, quantidade);
    }
    
    @WebMethod
    public int contadorProduto () {
        return gerenciadorEstoque.contadorProduto();
    }
    
    @WebMethod
    public ProdutoVO buscarProdutoPorCodigo (int codigo) {
        return gerenciadorEstoque.buscarProdutoPorCodigo(codigo);
    }
    
    @WebMethod
    public ArrayList<ProdutoVO> listaProduto() {
        return gerenciadorEstoque.listaProduto();
    }
    
    @WebMethod
    public int totalEstoqueFisico() {
        return gerenciadorEstoque.totalEstoqueFisico();
    }
}
