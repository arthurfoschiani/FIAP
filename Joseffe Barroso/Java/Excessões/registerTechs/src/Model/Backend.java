package Model;

import Interface.TecnologiaInterface;

public class Backend extends Tecnologia implements TecnologiaInterface {
	private boolean conteinerizar;

	public boolean isConteinerizar() {
		return conteinerizar;
	}

	public void setConteinerizar(boolean conteinerizar) {
		this.conteinerizar = conteinerizar;
	}
	
	public String descricaoLinguagem() {
		return this.getDescricaoLinguagem();
	}
	
	public String descricaoFramework() {
		return this.getDescricaoFramework();
	}
}
