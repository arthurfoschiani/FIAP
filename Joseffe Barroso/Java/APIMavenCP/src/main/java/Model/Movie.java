package Model;

import java.util.ArrayList;

public class Movie {
	private int id;
    private String titulo;
    private String sinopse;
    private ArrayList<Comment> comments = new ArrayList<>();
    
    public Movie(int id, String titulo, String sinopse) {
        this.id = id;
        this.titulo = titulo;
        this.sinopse = sinopse;
    }
	
    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getSinopse() {
        return sinopse;
    }

    public ArrayList<Comment> getComentarios() {
        return comments;
    }

    public void adicionarComentario(Comment comment) {
    	comments.add(comment);
    }

    public void excluirComentario(int index) {
    	comments.remove(index);
    }
    
    public String toString() {
        return id + " - " + titulo;
    }
}
