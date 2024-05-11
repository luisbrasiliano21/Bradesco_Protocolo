package com.Bradesco.demo.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tb_Protocolo")
public class Consulta_Protocolo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Getter @Setter private String tipoProtocolo;
	@Getter @Setter private Long numeroProtocolo;
	@Getter @Setter private LocalDate dataAbertura;
	@Getter @Setter private String statusProtocolo;
	@Getter @Setter private String descricaoProtocolo;
	@Getter @Setter private String resposta;
	@Getter @Setter private LocalDate prazoTratativa;
	@Getter @Setter private String canal;

	public Consulta_Protocolo() {

	}
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
		
	
}


