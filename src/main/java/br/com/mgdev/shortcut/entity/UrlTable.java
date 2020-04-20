package br.com.mgdev.shortcut.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "url_tables", schema = "shorturl")
@Entity(name = "UrlTables")
public class UrlTable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pk_url")
	private long pkUrl;

	@Column(name = "url_original")
	private String urlOriginal;

	@Column(name = "url_atalho")
	private String urlAtalho;

	@Column(name = "data_criacao")
	private Date dataCriacao;

	@Column(name = "data_expiracao")
	private Date dataExpiracao;

	@Column(name = "valido")
	private boolean valido = false;

	public long getPkUrl() {
		return pkUrl;
	}

	public void setPkUrl(long pkUrl) {
		this.pkUrl = pkUrl;
	}

	public String getUrlOriginal() {
		return urlOriginal;
	}

	public void setUrlOriginal(String urlOriginal) {
		this.urlOriginal = urlOriginal;
	}

	public String getUrlAtalho() {
		return urlAtalho;
	}

	public void setUrlAtalho(String urlAtalho) {
		this.urlAtalho = urlAtalho;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Date getDataExpiracao() {
		return dataExpiracao;
	}

	public void setDataExpiracao(Date dataExpiracao) {
		this.dataExpiracao = dataExpiracao;
	}

	public boolean isValido() {
		return valido;
	}

	public void setValido(boolean valido) {
		this.valido = valido;
	}

}
