package Model;

public class Cotacao {
	private String ask;
	   
    public Double getAsk() {
		return Double.parseDouble(ask);
	}

	public void setAsk(String ask) {
		this.ask = ask;
	}

	@Override
    public String toString() {
        return "Valor moeda " + this.ask;
    }
}
