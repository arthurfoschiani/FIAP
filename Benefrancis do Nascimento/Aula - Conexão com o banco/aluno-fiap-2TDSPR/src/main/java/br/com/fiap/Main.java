package br.com.fiap;

import br.com.fiap.domain.entity.Aluno;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Aluno arthur = new Aluno().setRm("rm96525").setNome("Arthur");
        Aluno alicia = new Aluno().setRm("rm00000").setNome("Alicia");
        Aluno ana = new Aluno().setRm("rm11111").setNome("Ana");
        Aluno larah = new Aluno().setRm("rm22222").setNome("Larah");

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("maria-db");
        EntityManager manager = factory.createEntityManager();

        manager.getTransaction().begin();

        manager.persist(arthur);
        manager.persist(alicia);
        manager.persist(ana);
        manager.persist(larah);

        manager.getTransaction().commit();

        Long id = Long.valueOf(JOptionPane.showInputDialog("Informe o ID do aluno: "));

        var encontrei = manager.find(Aluno.class, id);

        System.out.println(encontrei);

        manager.close();
        factory.close();
    }
}