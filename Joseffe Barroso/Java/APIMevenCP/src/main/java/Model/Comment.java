package Model;

public class Comment {
	private int id;
	private String nome;
	private String comentario;
	private Movie movie;
	
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
	
	public String getComentario() {
		return comentario;
	}
	
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
	public Movie getMovie() {
		return movie;
	}
	
	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public Comment(int id, String nome, String comentario, Movie movie) {

		this.id = id;
		this.nome = nome;
		this.comentario = comentario;
		this.movie = movie;
	}

	public Comment() {

	}
	
	
}
