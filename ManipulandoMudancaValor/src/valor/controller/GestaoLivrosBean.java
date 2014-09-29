package valor.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ValueChangeEvent;

import valor.model.Livro;

@ManagedBean
@SessionScoped
public class GestaoLivrosBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Livro livro;
	private List<Livro> livros;
	private List<Livro> livrosFiltrados;
	private Livro livroSelecionado;
	private String nomePesquisa;

	public GestaoLivrosBean() {
		this.livro = new Livro();
		this.livros = new ArrayList<Livro>();
		this.livrosFiltrados = new ArrayList<Livro>();
	}

	public void nomePesquisaAlterado(ValueChangeEvent event) {
		System.out.println("Valor atual: " + this.nomePesquisa);
		System.out.println("Novo valor: " + event.getNewValue());
		this.livrosFiltrados.clear();
		
		for (Livro livro : this.livros) {
			if (livro.getTitulo() != null && livro.getTitulo().toLowerCase().startsWith(event.getNewValue().toString().toLowerCase())) {
				this.livrosFiltrados.add(livro);
			}
		}
	}

	public void incluir() {
		this.livros.add(livro);
		this.livro = new Livro();
	}

	public void excluir() {
		this.livros.remove(this.livroSelecionado);
	}

	public String obterAjuda() {
		if (this.livros.isEmpty()) {
			return "AjudaGestaoLivros?faces-redirect=true";
		} else {
			return "AjudaGestaoLivrosTelefone?faces-redirect=true";
		}
	}

	public Livro getLivro() {
		return livro;
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public Livro getLivroSelecionado() {
		return livroSelecionado;
	}

	public void setLivroSelecionado(Livro livroSelecionado) {
		this.livroSelecionado = livroSelecionado;
	}

	public String getNomePesquisa() {
		return nomePesquisa;
	}

	public void setNomePesquisa(String nomePesquisa) {
		this.nomePesquisa = nomePesquisa;
	}

	public List<Livro> getLivrosFiltrados() {
		return livrosFiltrados;
	}

}
