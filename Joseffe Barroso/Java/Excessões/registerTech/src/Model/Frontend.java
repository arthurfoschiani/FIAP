package Model;

import Interface.TecnologiaInterface;

public class Frontend extends Tecnologia implements TecnologiaInterface {
	private boolean isWeb;
	private boolean isMobile;

	public boolean getIsWeb() {
		return isWeb;
	}

	public void setIsWeb(boolean isWeb) {
		this.isWeb = isWeb;
	}
	
	public boolean getIsMobile() {
		return isMobile;
	}

	public void setIsMobile(boolean isMobile) {
		this.isMobile = isMobile;
	}
	
	public String descricaoLinguagem() {
		return this.getDescricaoLinguagem();
	}
	
	public String descricaoFramework() {
		return this.getDescricaoFramework();
	}
}
