package escopo.model;

import java.io.Serializable;

public class Livro implements Serializable {

	private static final long serialVersionUID = 1L;

	private String titulo;
	private String autor;
	private String assunto;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

}
