package com.Bradesco.demo.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


	@Entity
	@Table(name = "tb_Protocolo")
	public class Consulta_Protocolo {
		
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
		private String tipoProtocolo;
		/*private Long numeroProtocolo; 
	    private LocalDate dataAbertura;
	   
	    private String statusProtocolo;
	    private String descricaoProtocolo;
	    private String resposta;
	    private LocalDate prazoTratativa;
	    private String canal;*/

	    public Consulta_Protocolo() {
	    	
	    }

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}
		public String getTipoProtocolo() {
			return tipoProtocolo;
		}

		public void setTipoProtocolo(String tipoProtocolo) {
			this.tipoProtocolo = tipoProtocolo;
		}
/*
		public Long getNumeroProtocolo() {
			return numeroProtocolo;
		}

		public void setNumeroProtocolo(Long numeroProtocolo) {
			this.numeroProtocolo = numeroProtocolo;
		}

		public LocalDate getDataAbertura() {
			return dataAbertura;
		}
		
		public void setDataAbertura(LocalDate dataAbertura) {
			this.dataAbertura = dataAbertura;
		}

		

		public String getStatusProtocolo() {
			return statusProtocolo;
		}

		public void setStatusProtocolo(String statusProtocolo) {
			this.statusProtocolo = statusProtocolo;
		}

		public String getDescricaoProtocolo() {
			return descricaoProtocolo;
		}

		public void setDescricaoProtocolo(String descricaoProtocolo) {
			this.descricaoProtocolo = descricaoProtocolo;
		}

		public String getResposta() {
			return resposta;
		}

		public void setResposta(String resposta) {
			this.resposta = resposta;
		}
	
		public LocalDate getPrazoTratativa() {
			return prazoTratativa;
		}

		public void setPrazoTratativa(LocalDate prazoTratativa) {
			this.prazoTratativa = prazoTratativa;
		}

		public String getCanal() {
			return canal;
		}

		public void setCanal(String canal) {
			this.canal = canal;
		}
		
	*/	
}


