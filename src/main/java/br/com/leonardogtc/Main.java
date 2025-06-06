package br.com.leonardogtc;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.leonardogtc.dominio.Pessoa;

public class Main {
    public static void main(String[] args) {
        // Exemplo de uso da classe Pessoa
        Pessoa p1 = new Pessoa(null, "João Silva", "joao@gmail.com");
        Pessoa p2 = new Pessoa(null, "Maria Oliveira", "maria@gmail.com");
        Pessoa p3 = new Pessoa(null, "Carlos Souza", "carlos@gmail.com");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("aulajpamaven");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(p1);
        em.persist(p2);
        em.persist(p3);
        em.getTransaction().commit();
        System.out.println("Pessoas salvas com sucesso!");
        em.close();
        emf.close();

    }
}