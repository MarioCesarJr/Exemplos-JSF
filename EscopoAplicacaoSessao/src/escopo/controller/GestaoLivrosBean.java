package escopo.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import escopo.model.Livro;

@ManagedBean
@ApplicationScoped
public class GestaoLivrosBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Livro livro;
	private List<Livro> livros;

	public GestaoLivrosBean(){
		livro = new Livro();
		livros = new ArrayList<Livro>();
	}
	
	public void incluir(){
	   this.livros.add(livro);
	   this.livro = new Livro();
	}
	
	public Livro getLivro() {
		return livro;
	}

	public List<Livro> getLivros() {
		return livros;
	}

}
