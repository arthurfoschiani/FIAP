package Model;

public abstract class Tecnologia {
	private String linguagemProgramacao;
	private String principalFramework;
	private String descricaoLinguagem;
	private String descricaoFramework;
	
	public String getLinguagemProgramacao() {
		return linguagemProgramacao;
	}
	
	public void setLinguagemProgramacao(String linguagemProgramacao) {
		this.linguagemProgramacao = linguagemProgramacao;
	}
	
	public String getPrincipalFramework() {
		return principalFramework;
	}
	
	public void setPrincipalFramework(String principalFramework) {
		this.principalFramework = principalFramework;
	}
	
	public String getDescricaoLinguagem() {
		return descricaoLinguagem;
	}
	
	public void setDescricaoLinguagem(String descricaoLinguagem) {
		this.descricaoLinguagem = descricaoLinguagem;
	}
	
	public String getDescricaoFramework() {
		return descricaoFramework;
	}
	
	public void setDescricaoFramework(String descricaoFramework) {
		this.descricaoFramework = descricaoFramework;
	}
}
