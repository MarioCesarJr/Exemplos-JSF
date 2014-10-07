package conversores.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import conversores.model.Campeonato;

@ManagedBean
@ViewScoped
public class CampeonatoBean {

	private Campeonato campeonato = new Campeonato();
	private List<Campeonato> campeonatos = new ArrayList<Campeonato>();

	

	public void cadastrar() {
		this.campeonatos.add(this.campeonato);
		this.campeonato = new Campeonato();
		
	}
	
	public void limpar(){
       this.campeonatos.clear();
	}
	
	public Campeonato getCampeonato() {
		return campeonato;
	}

	public List<Campeonato> getCampeonatos() {
		return campeonatos;
	}

}
