package Model;

import java.time.LocalDate;

public class Dominio {
	private String nome;
    private boolean disponivel;
    private LocalDate dataExpiracao;
    
    public Dominio(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
    
    public boolean isDisponivel() {
        return disponivel;
    }
    
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    
    public LocalDate getDataExpiracao() {
        return dataExpiracao;
    }
    
    public void setDataExpiracao(LocalDate dataExpiracao) {
        this.dataExpiracao = dataExpiracao;
    }
}
