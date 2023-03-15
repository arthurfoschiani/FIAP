package Model;

public class Movie {
	private int id;
	private String nome;
	private String sinopse;
	private String foto;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSinopse() {
		return sinopse;
	}
	
	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}
	
	public String getFoto() {
		return foto;
	}
	
	public void setFoto(String foto) {
		this.foto = foto;
	}

	public Movie(int id, String nome, String sinopse, String foto) {
		this.id = id;
		this.nome = nome;
		this.sinopse = sinopse;
		this.foto = foto;
	}

	public Movie() {
	
	}
}
