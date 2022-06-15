package projeto.carteiraAcoes.modelo;

public class RespostaModelo {
	
	private String mensagem;
	
	public RespostaModelo() {}
	
	public RespostaModelo(String mensagem) {
		this.mensagem = mensagem;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem){
		this.mensagem = mensagem;
	}
}
