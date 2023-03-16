package Model;

public class Comment {
	private int id;
    private String autor;
    private String conteudo;

    public Comment(int id, String autor, String conteudo) {
        this.id = id;
        this.autor = autor;
        this.conteudo = conteudo;
    }

    public int getId() {
        return id;
    }

    public String getAutor() {
        return autor;
    }

    public String getConteudo() {
        return conteudo;
    }

    public String toString() {
        return "ID: " + id + "\nAutor: " + autor + "\nConteúdo: " + conteudo;
    }
}
