package projeto.carteiraAcoes.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="movimentAcoes")
@Entity

public class MovimentAcaoModelo {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id")
	private int Id;
	
	@Column(name="idAcao")
	private int idAcao;
	
	@Column(name="data")
	private String data;
	
	@Column(name="tipoOperacao")
	private String tipoOperacao;
	
	@Column(name="valor")
	private double valor;
	
	@Column(name="quantidade")
	private int quantidade;
	
	public int getId() {
		return Id;
	}
	public void setIdAcao(int idAcao) {
		this.idAcao = idAcao;
	}
	public void setId(int codigo) {
		this.Id = codigo;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getTipoOperacao() {
		return tipoOperacao;
	}
	public void setTipoOperacao(String tipoOperacao) {
		this.tipoOperacao = tipoOperacao;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}
