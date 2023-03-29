package Model;

import Interface.TecnologiaInterface;

public class Frontend extends Tecnologia implements TecnologiaInterface {
	private boolean isWeb;

	public boolean isWeb() {
		return isWeb;
	}

	public void setWeb(boolean isWeb) {
		this.isWeb = isWeb;
	}
	
	public String descricaoLinguagem() {
		return this.getDescricaoLinguagem();
	}
	
	public String descricaoFramework() {
		return this.getDescricaoFramework();
	}
}
