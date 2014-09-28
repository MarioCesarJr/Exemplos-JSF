package escopo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;

import escopo.model.Produto;

@ManagedBean
@SessionScoped
public class GestaoProdutoBean {

	private Produto produto;
	private List<Produto> produtos;
	private Produto produtoSelecionado;

	public GestaoProdutoBean() {
		this.produto = new Produto();
		this.produtos = new ArrayList<Produto>();
	}

	public void incluir() {
		this.produtos.add(produto);
		this.produto = new Produto();
	}

	public void excluir() {
		this.produtos.remove(this.produtoSelecionado);
	}

	public String obterAjuda() {
		if (this.produtos.isEmpty()) {
			return "AjudaGestaoProdutos?faces-redirect=true";
		} else {
			return "AjudaGestaoProdutosTelefone?faces-redirect=true";
		}
	}

	public void verificarInclusao(ActionEvent event) {
		if ("".equals(this.produto.getFabricante())) {
			this.produto.setFabricante("Sem fabricante");
		}
	}

	public Produto getProduto() {
		return produto;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public Produto getProdutoSelecionado() {
		return produtoSelecionado;
	}

	public void setProdutoSelecionado(Produto produtoSelecionado) {
		this.produtoSelecionado = produtoSelecionado;
	}

}
