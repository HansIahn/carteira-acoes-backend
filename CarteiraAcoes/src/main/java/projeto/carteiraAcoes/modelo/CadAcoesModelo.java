package projeto.carteiraAcoes.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="cadAcoes")
@Entity

public class CadAcoesModelo {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id")
	private int Id;
	
	@Column(name="nomeEmpresa")
	private String nomeEmpresa;
	
	@Column(name="codigoEmpresa")
	private String codigoEmpresa;
	
	public int getId() {
		return Id;
	}
	public void setId(int codigo) {
		this.Id = codigo;
	}
	public String getNomeEmpresa() {
		return nomeEmpresa;
	}
	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}
	public String getCodigoEmpresa() {
		return codigoEmpresa;
	}
	public void setCodigoEmpresa(String codigoEmpresa) {
		this.codigoEmpresa = codigoEmpresa;
	}
}
