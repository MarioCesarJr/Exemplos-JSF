package conversores.model;

import java.util.Date;

public class Campeonato {

	private Date dataJogo;
	private String timeCasa;
	private Integer golsTimeCasa;
	private String timeVisitante;
	private Integer golsTimeVisitante;
	private Double arrecadacaoJogo;

	public Date getDataJogo() {
		return dataJogo;
	}

	public void setDataJogo(Date dataJogo) {
		this.dataJogo = dataJogo;
	}

	public String getTimeCasa() {
		return timeCasa;
	}

	public void setTimeCasa(String timeCasa) {
		this.timeCasa = timeCasa;
	}

	public Integer getGolsTimeCasa() {
		return golsTimeCasa;
	}

	public void setGolsTimeCasa(Integer golsTimeCasa) {
		this.golsTimeCasa = golsTimeCasa;
	}

	public String getTimeVisitante() {
		return timeVisitante;
	}

	public void setTimeVisitante(String timeVisitante) {
		this.timeVisitante = timeVisitante;
	}

	public Integer getGolsTimeVisitante() {
		return golsTimeVisitante;
	}

	public void setGolsTimeVisitante(Integer golsTimeVisitante) {
		this.golsTimeVisitante = golsTimeVisitante;
	}

	public Double getArrecadacaoJogo() {
		return arrecadacaoJogo;
	}

	public void setArrecadacaoJogo(Double arrecadacaoJogo) {
		this.arrecadacaoJogo = arrecadacaoJogo;
	}

}
